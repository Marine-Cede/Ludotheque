package fr.eni.ludotheque.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class AdresseBo {
    @Id
    @NonNull
    private Integer noAdresse;
    @Column
    @NonNull
    private String rue;
    @Column
    @NonNull
    private String codePostal;
    @Column
    @NonNull
    private String ville;
}
