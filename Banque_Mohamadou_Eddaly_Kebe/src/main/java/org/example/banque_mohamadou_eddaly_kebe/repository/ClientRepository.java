package org.example.banque_mohamadou_eddaly_kebe.repository;

import org.example.banque_mohamadou_eddaly_kebe.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
