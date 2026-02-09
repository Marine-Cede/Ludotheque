package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.Repository.ClientRepository;
import fr.eni.ludotheque.bo.AdresseBo;
import fr.eni.ludotheque.bo.ClientBo;
import fr.eni.ludotheque.dto.ClientDTO;
import fr.eni.ludotheque.exceptions.DataNotFound;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@Service
public class ClientServiceImpl implements ClientService{

    List<ClientBo> client ;

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public void ajouterClient(ClientBo client) {
        clientRepository.save(client);
    }

    @Override
    public List<ClientBo> trouverClientsParNom(String nom) {
        return clientRepository.findByNomStartsWith(nom);
    }

    //@Override
    public ClientBo modifierClient(Integer noClient, ClientDTO clientDto) {
        //Client client = clientRepository.findById(noClient).orElseThrow(()->new DataNotFound("Client", noClient));
        ClientBo client = new ClientBo();
        client.setNoClient(noClient);
        client.setAdresse(new AdresseBo());
        BeanUtils.copyProperties(clientDto, client);
        BeanUtils.copyProperties(clientDto, client.getAdresse());
        ClientBo clientBD = null;
        try {
            clientBD = clientRepository.save(client);
        } catch (OptimisticLockingFailureException e) {//thrown if entity is assumed to be present but does not exists in db
            //e.printStackTrace();
            throw new DataNotFound("Client", noClient);
        }

        return clientBD;
    }

    @Override
    public List<ClientBo> getAllClients() {
        return client.stream().collect(Collectors.toList());
    }

    @Override
    public Optional<ClientBo> getClientById(Integer id) {
        Optional<ClientBo> foundClient = client.stream()
                .filter(clientBo -> clientBo.getId().equals(id))
                .findFirst();
        return foundClient;
    }

    @Override
    public void deleteClient(Integer id) {
        Optional<ClientBo> foundClient = client.stream()
                .filter(clientBo -> clientBo.getId().equals(id))
                .findFirst();
        client.remove(foundClient.get());
    }

}

