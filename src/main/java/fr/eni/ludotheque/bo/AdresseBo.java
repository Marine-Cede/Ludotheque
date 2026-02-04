package fr.eni.ludotheque.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class AdresseBo {
    @Column
    int noAdresse;
    @Column
    String rue;
    @Column
    int codePostal;
    @Column
    String ville;
}
