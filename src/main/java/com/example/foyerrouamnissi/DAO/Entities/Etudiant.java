package com.example.foyerrouamnissi.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class  Etudiant  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private LocalDate dateNaissance;
    private String email;
    private  String password;






}
