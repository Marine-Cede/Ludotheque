package fr.eni.ludotheque.Repository;
import fr.eni.ludotheque.bo.ClientBo;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ClientRepository extends JpaRepository<ClientBo, Integer>{

}
