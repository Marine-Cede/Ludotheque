package fr.eni.ludotheque.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class ClientBo {
    @Id
    @GeneratedValue
    private int noClient;
    @Column
    @NonNull
    private String nom;
    @Column
    @NonNull
    private String prenom;
    @Column
    @NonNull
    private String email;
    @Column
    @NonNull
    private String noTel;

}
