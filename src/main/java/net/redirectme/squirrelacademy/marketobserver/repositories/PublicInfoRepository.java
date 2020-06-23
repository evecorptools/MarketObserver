package net.redirectme.squirrelacademy.marketobserver.repositories;

import net.redirectme.squirrelacademy.marketobserver.entities.PublicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicInfoRepository extends JpaRepository<PublicInfo, Long> {
}
