package fr.eni.ludotheque.Repository;
import fr.eni.ludotheque.bo.ClientBo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ClientRepository extends JpaRepository<ClientBo, Integer>{

    List<ClientBo> findByNomStartsWith(String nom);
    ClientBo findByNoTelephone(String telephone);
}
