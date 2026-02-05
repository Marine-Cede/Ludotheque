package fr.eni.ludotheque.Repository;

import fr.eni.ludotheque.bo.AdresseBo;
import fr.eni.ludotheque.bo.JeuxBo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JeuxRepository extends JpaRepository<JeuxBo, Integer> {
}
