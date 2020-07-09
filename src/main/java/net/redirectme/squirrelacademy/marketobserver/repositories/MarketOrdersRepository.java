package net.redirectme.squirrelacademy.marketobserver.repositories;

import net.redirectme.squirrelacademy.marketobserver.entities.MarketOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MarketOrdersRepository extends JpaRepository<MarketOrder, Long> {
    void deleteByRequestlocationAndCharacterID(Long aLong, int characterID);
}
