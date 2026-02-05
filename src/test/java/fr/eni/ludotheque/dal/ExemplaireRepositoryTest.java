package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.Repository.ExemplaireRepository;
import fr.eni.ludotheque.Repository.JeuxRepository;
import fr.eni.ludotheque.bo.ExemplaireBo;
import fr.eni.ludotheque.bo.GenreBo;
import fr.eni.ludotheque.bo.JeuxBo;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExemplaireRepositoryTest {

    @Autowired
    private JeuxRepository jeuRepository;

    @Autowired
    private ExemplaireRepository exemplaireRepository;

    @Test
    @Transactional
    public void testCreationExemplaire() {

        JeuxBo jeux = new JeuxBo("Subterra", "refSubterra", 3.7);
        jeux.setAgeMin(12);
        jeux.setDescription("C'est un jeu de société sympa, avec des règles sympa et une ambiance sympa");
        jeux.addGenre(new GenreBo(1, ""));
        JeuxBo jeuBD = jeuRepository.save(jeux);
        ExemplaireBo subterraBoite = new ExemplaireBo("1414141414141", true);

        exemplaireRepository.save(subterraBoite);
    }
}
