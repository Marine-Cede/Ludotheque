package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.ClientBo;
import fr.eni.ludotheque.dto.ClientDTO;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    void ajouterClient(ClientBo client);
    public List<ClientBo> trouverClientsParNom(String nom);
    List<ClientBo> getAllClients();
    Optional<ClientBo> getClientById(Integer id);
    void deleteClient (Integer id);
}
