package net.redirectme.squirrelacademy.marketobserver.repositories;

import net.redirectme.squirrelacademy.marketobserver.entities.MarketOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface MarketOrdersRepository extends JpaRepository<MarketOrder, Long> {
    //void deleteByRequestlocationAndCharacterID(Long aLong, int characterID);
    long deleteByRequestlocationAndCharacterID(
            @Param("requestlocation") Long requestlocation,
            @Param("characterid") int characterid);
    List<MarketOrder> findByRequestlocationAndCharacterID(
            @Param("requestlocation") Long requestlocation,
            @Param("characterid") int characterid);
}
