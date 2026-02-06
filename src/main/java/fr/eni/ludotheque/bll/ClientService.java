package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.ClientBo;

import java.util.List;

public interface ClientService {

    void ajouterClient(ClientBo client);
    public List<ClientBo> trouverClientsParNom(String nom);
}
