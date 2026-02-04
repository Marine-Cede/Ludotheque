package fr.eni.ludotheque.bo;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class AdresseBo {
    @Id
    int noAdresse;
    String rue;
    int codePostal;
    String ville;
}
