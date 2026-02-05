package fr.eni.ludotheque.Repository;

import fr.eni.ludotheque.bo.ClientBo;
import fr.eni.ludotheque.bo.ExemplaireBo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExemplaireRepository extends JpaRepository<ExemplaireBo, Integer> {
}
