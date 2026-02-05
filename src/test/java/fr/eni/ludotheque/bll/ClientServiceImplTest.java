package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.Repository.ClientRepository;
import fr.eni.ludotheque.bo.AdresseBo;
import fr.eni.ludotheque.bo.ClientBo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClientServiceImplTest {
    @Autowired
    ClientService clientService;

    @Autowired
    ClientRepository clientRepository;

    @Test
    void testCreationClient(){
        AdresseBo adresse = new AdresseBo(2,"rue du coincoin", "79260", "La Crèche");
        ClientBo client = new ClientBo("Duck", "Donald", "d.duck@mail.com","0615817840", adresse);

        clientService.ajouterClient(client);

        ClientBo clientBd = clientRepository.findById(client.getNoClient()).orElse(null);
        Assertions.assertNotNull(clientBd);
        Assertions.assertEquals(client, clientBd);
    }


}
