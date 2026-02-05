package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

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

    @Column
    @NonNull
    private String titre;

    @Column
    @NonNull
    private String reference;

    @Column
    private int ageMin;

    @Column
    private String description;

    @Column
    private int duree;

    @Column
    @NonNull
    private int tarifJour;
}
