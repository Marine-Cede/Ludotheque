package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.ClientBo;
import fr.eni.ludotheque.dto.ClientDTO;

import java.util.List;

public interface ClientService {

    void ajouterClient(ClientBo client);
    public List<ClientBo> trouverClientsParNom(String nom);
    List<ClientBo> getAllClients();
}
