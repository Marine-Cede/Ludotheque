package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.Repository.JeuxRepository;
import fr.eni.ludotheque.bo.GenreBo;
import fr.eni.ludotheque.bo.JeuxBo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class JeuxRepositoryTest {

    @Autowired
    private JeuxRepository jeuRepository;

    @Test
    @DisplayName("Teste de Création d'un nouveau jeu")
    public void testCreationJeu() {

        JeuxBo jeux = new JeuxBo("Subterra", "refSubterra", 3.7 );
        jeux.setAgeMin(12);
        jeux.setDescription("C'est un jeu de société sympa, avec des règles sympa et une ambiance sympa");
        jeux.addGenre(new GenreBo(1, ""));

        jeuRepository.save(jeux);


    }

}
