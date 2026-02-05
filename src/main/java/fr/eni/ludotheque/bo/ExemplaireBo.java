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
@Table(name = "EXEMPLAIRES")
public class ExemplaireBo {
    @Id
    @GeneratedValue
    @NonNull
    private int noExemplaire;

    @Column
    @NonNull
    private String codeBarre;

    @Column
    @NonNull
    private boolean louable;
}
