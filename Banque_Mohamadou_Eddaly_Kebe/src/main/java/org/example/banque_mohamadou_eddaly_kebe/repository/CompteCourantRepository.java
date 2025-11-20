package org.example.banque_mohamadou_eddaly_kebe.repository;

import org.example.banque_mohamadou_eddaly_kebe.entity.CompteCourant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteCourantRepository extends JpaRepository<CompteCourant, Long> {
    List<CompteCourant> findByClientId(Long clientId);
}
