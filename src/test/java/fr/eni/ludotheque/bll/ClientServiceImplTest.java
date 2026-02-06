package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.Repository.ClientRepository;
import fr.eni.ludotheque.bo.AdresseBo;
import fr.eni.ludotheque.bo.ClientBo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ClientServiceImplTest {
    @Autowired
    ClientService clientService;

    @Autowired
    ClientRepository clientRepository;

    @Test
    void testCreationClient(){
        AdresseBo adresse = new AdresseBo("rue du coincoin", "79260", "La Crèche");
        ClientBo client = new ClientBo("Duck", "Donald", "d.duck@mail.com","0615817840", adresse);

        clientService.ajouterClient(client);

        ClientBo clientBd = clientRepository.findById(client.getNoClient()).orElse(null);
        Assertions.assertNotNull(clientBd);
        Assertions.assertEquals(client, clientBd);
    }

    @Test
    @DisplayName("Trouver les clients dont le nom commence par")
    public void testTrouverClientsDontLeNomCommencePar() {

        String nom = "DUP";
        AdresseBo adresse = new AdresseBo("rue des Cormorans", "44860", "Saint Aignan Grand Lieu");
        ClientBo clientATrouver = new ClientBo("DUPIEUX", "Quentin", "email@email.email", "061475455",  adresse);
        clientATrouver.setNoTel("tel1");
        AdresseBo adresse2 = new AdresseBo("rue 2", "44860", "Saint Aignan Grand Lieu");
        ClientBo clientATrouver2 = new ClientBo("DUPONT", "Jacques", "email@mail.mail","074567876542", adresse2);
        clientATrouver2.setNoTel("tel2");

        List<ClientBo> listeClients = new ArrayList<>();
        listeClients.add(clientATrouver);
        listeClients.add(clientATrouver2);
        when(clientRepository.findByNomStartsWith(nom)).thenReturn(listeClients);


        List<ClientBo> clients = clientService.trouverClientsParNom(nom);


        assertThat(clients).hasSize(2);

    }


}
