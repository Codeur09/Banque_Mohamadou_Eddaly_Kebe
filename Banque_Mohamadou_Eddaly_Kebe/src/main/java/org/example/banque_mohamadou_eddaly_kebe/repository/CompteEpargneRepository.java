package org.example.banque_mohamadou_eddaly_kebe.repository;

import org.example.banque_mohamadou_eddaly_kebe.entity.CompteEpargne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteEpargneRepository extends JpaRepository<CompteEpargne, Long> {
    List<CompteEpargne> findByClientId(Long clientId);
}
