package org.example.banque_mohamadou_eddaly_kebe.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "comptes_epargnes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompteEpargne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroCompte;
    private Double solde;
    private LocalDate dateOuverture;
    private Double tauxRemuneration;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
