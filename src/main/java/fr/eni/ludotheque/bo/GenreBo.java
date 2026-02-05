package fr.eni.ludotheque.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "GENRES")
public class GenreBo {
    @Id
    @NonNull
    private int noGenre;

    @Column
    @NonNull
    private String libelle;
}
