package org.example.banque_mohamadou_eddaly_kebe.controller;

import org.example.banque_mohamadou_eddaly_kebe.entity.CompteCourant;
import org.example.banque_mohamadou_eddaly_kebe.entity.CompteEpargne;
import org.example.banque_mohamadou_eddaly_kebe.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/clients/{clientId}/comptes")
public class CompteController {

    @Autowired
    private CompteService compteService;

    @PostMapping("/courant")
    public ResponseEntity<CompteCourant> creerCompteCourant(
            @PathVariable Long clientId,
            @RequestBody Map<String, Double> request) {

        Double soldeInitial = request.get("solde");
        if (soldeInitial == null) {
            soldeInitial = 0.0;
        }

        CompteCourant compte = compteService.creerCompteCourant(clientId, soldeInitial);
        return ResponseEntity.status(HttpStatus.CREATED).body(compte);
    }

    @PostMapping("/epargne")
    public ResponseEntity<CompteEpargne> creerCompteEpargne(
            @PathVariable Long clientId,
            @RequestBody Map<String, Double> request) {

        Double soldeInitial = request.get("solde");
        if (soldeInitial == null) {
            soldeInitial = 0.0;
        }

        CompteEpargne compte = compteService.creerCompteEpargne(clientId, soldeInitial);
        return ResponseEntity.status(HttpStatus.CREATED).body(compte);
    }
}
