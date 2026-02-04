package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "Client")
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AdresseBo", referencedColumnName = "noAdresse")
    @NonNull private AdresseBo adresse;

}
