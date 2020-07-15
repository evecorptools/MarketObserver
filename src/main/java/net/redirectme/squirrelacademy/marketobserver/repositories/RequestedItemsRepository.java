package net.redirectme.squirrelacademy.marketobserver.repositories;

import net.redirectme.squirrelacademy.marketobserver.entities.RequestedItem;
import net.redirectme.squirrelacademy.marketobserver.entities.TableModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface RequestedItemsRepository extends JpaRepository<RequestedItem, Long> {
    @Query(value="SELECT ri.type_id, ri.amount_quota, mo.vol_remain, mo.price_min, mo.price_avg FROM marketobserverV5.marketobserver_requesteditems ri\n" +
            "Left join \n" +
            "   (\n" +
            "   select mo.type_id, sum(volume_remain) as vol_remain, min(price) as price_min, Round(avg(price),2) as price_avg  from marketobserverV5.api_marketorders mo\n" +
            "\twhere mo.location_id = ?1\n" +
            "\tand mo.is_buy_order = 0\n" +
            "\tgroup by mo.type_id\n" +
            "\n" +
            "    ) mo\n" +
            "on ri.type_id=mo.type_id", nativeQuery = true)
    Collection<TableModel> findByRequestlocationAndCharacterID(
            @Param("requestlocation") Long requestlocation,
            @Param("characterid") int characterid);
}
