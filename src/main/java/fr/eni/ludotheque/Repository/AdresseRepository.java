package fr.eni.ludotheque.Repository;

import fr.eni.ludotheque.bo.AdresseBo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository extends JpaRepository<AdresseBo, Integer> {
}
