package org.example.banque_mohamadou_eddaly_kebe.service;

import org.example.banque_mohamadou_eddaly_kebe.entity.Client;
import org.example.banque_mohamadou_eddaly_kebe.entity.CompteCourant;
import org.example.banque_mohamadou_eddaly_kebe.entity.CompteEpargne;
import org.example.banque_mohamadou_eddaly_kebe.repository.ClientRepository;
import org.example.banque_mohamadou_eddaly_kebe.repository.CompteCourantRepository;
import org.example.banque_mohamadou_eddaly_kebe.repository.CompteEpargneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CompteService {

    @Autowired
    private CompteCourantRepository compteCourantRepository;

    @Autowired
    private CompteEpargneRepository compteEpargneRepository;

    @Autowired
    private ClientRepository clientRepository;

    private int compteurCompteCourant = 1;
    private int compteurCompteEpargne = 1;

    public CompteCourant creerCompteCourant(Long clientId, Double soldeInitial) {
        Client client = clientRepository.findById(clientId).orElse(null);
        if (client == null) {
            throw new RuntimeException("Client non trouvé");
        }

        CompteCourant compte = new CompteCourant();
        compte.setNumeroCompte("CC" + String.format("%03d", compteurCompteCourant++));
        compte.setSolde(soldeInitial);
        compte.setDateOuverture(LocalDate.now());
        compte.setClient(client);
        compte.setDecouvertAutorise(1000.0);

        return compteCourantRepository.save(compte);
    }

    public CompteEpargne creerCompteEpargne(Long clientId, Double soldeInitial) {
        Client client = clientRepository.findById(clientId).orElse(null);
        if (client == null) {
            throw new RuntimeException("Client non trouvé");
        }

        CompteEpargne compte = new CompteEpargne();
        compte.setNumeroCompte("CE" + String.format("%03d", compteurCompteEpargne++));
        compte.setSolde(soldeInitial);
        compte.setDateOuverture(LocalDate.now());
        compte.setClient(client);
        compte.setTauxRemuneration(3.0);

        return compteEpargneRepository.save(compte);
    }
}
