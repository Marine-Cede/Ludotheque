package fr.eni.ludotheque.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class AdresseBo {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Exclude
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
