package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.JeuxBo;

import java.util.List;

public interface JeuxService {

    void ajouterJeu(JeuxBo jeu);

    JeuxBo trouverJeuParNoJeu(Integer noJeu);

    List<JeuxBo> listeJeuxCatalogue(String filtreTitre);
}
