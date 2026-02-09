package fr.eni.ludotheque.Repository;
import fr.eni.ludotheque.bo.ClientBo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientBo, Integer>{

    List<ClientBo> findByNomStartsWith(String nom);

}
