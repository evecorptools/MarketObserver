package net.redirectme.squirrelacademy.character.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PublicInfoRepository extends JpaRepository<PublicInfo, Long> {
    PublicInfo findByCharacterid(int id);
}
