package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.Repository.ClientRepository;
import fr.eni.ludotheque.bo.ClientBo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public void ajouterClient(ClientBo client) {
        clientRepository.save(client);
    }
}

