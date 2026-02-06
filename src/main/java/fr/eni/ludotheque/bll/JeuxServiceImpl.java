package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.Repository.ExemplaireRepository;
import fr.eni.ludotheque.Repository.JeuxRepository;
import fr.eni.ludotheque.bo.JeuxBo;
import fr.eni.ludotheque.exceptions.DataNotFound;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Data
@Service
public class JeuxServiceImpl {

    @NonNull
    private JeuxRepository jeuRepository;

    @NonNull
    private ExemplaireRepository exemplaireRepository;

    @Override
    public void ajouterJeu(JeuxBo jeu) {

        jeuRepository.save(jeu);


    }


    @Override
    public JeuxBo trouverJeuParNoJeu(Integer noJeu) {
        Optional<JeuxBo> optJeu = jeuRepository.findById(noJeu);

        if(optJeu.isEmpty()) {
            throw new DataNotFound("Jeu", noJeu);
        }
        return optJeu.get();

    }
}
