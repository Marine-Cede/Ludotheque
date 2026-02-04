package fr.eni.ludotheque.dal;

import ch.qos.logback.core.net.server.Client;
import fr.eni.ludotheque.Repository.ClientRepository;
import fr.eni.ludotheque.bo.ClientBo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ClientRepositoryTest {

    @Autowired
    private ClientRepository clientRepo;

    @Test
    @DisplayName("Trouver un client en connaissant son id")
    public void testFindByIdClient() {
        //Arrange
        ClientBo client1 = new ClientBo("Duck", "Donald", "d.duck@mail.com","0615817840");
        clientRepo.save(client1);


        //Act
        //Optional<Client> clientOpt = clientRepo.findById(client1.getId());

        //Assert
        //assertTrue(clientOpt.isPresent());
        //assertEquals(client1.getPrenom(), clientOpt.get().getPrenom());
        //assertEquals(client1.getNom(), clientOpt.get().getNom());
        //assertEquals(client1.getnoClient(), clientOpt.get().getNoClient());

        //clientRepo.deleteById(client1.getId());
    }

    @Test
    @DisplayName("Création d'un client avec JPA")
    @Transactional
    public void testModificationEmploye() {
        //Arrange
        ClientBo client = new ClientBo("nomTest", "prenomTest", "email@Test.com", "0777361821");

        //Act
        clientRepo.save(client);

        //Assert
        //Optional<Client> clientOpt = clientRepo.findById(client.getId());
        //assertTrue(clientOpt.isPresent());
        //assertEquals(client, clientOpt.get());


    }


}

