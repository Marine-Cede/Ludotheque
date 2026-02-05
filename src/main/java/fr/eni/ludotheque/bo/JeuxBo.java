package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "JEUX")
public class JeuxBo {
    @Id
    @GeneratedValue
    @NonNull
    private int noJeu;

    @Column(name = "titre")
    @NonNull
    private String titre;

    @Column(name = "reference")
    @NonNull
    private String reference;

    @Column(name = "age_min")
    private int ageMin;

    @Column(name = "description")
    private String description;

    @Column(name = "duree")
    private int duree;

    @Column(name = "tarif_jour")
    @NonNull
    private int tarifJour;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "JEUX_GENRES",
            joinColumns = @JoinColumn(name="no_jeu"),
            inverseJoinColumns = @JoinColumn(name="no_genre"))
    private List<GenreBo> genres = new ArrayList<>();

    public void addGenre(GenreBo g) {
        genres.add(g);
    }
}
