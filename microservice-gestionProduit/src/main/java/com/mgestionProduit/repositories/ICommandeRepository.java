package com.mgestionProduit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgestionProduit.entites.Commande;



@Repository
public interface ICommandeRepository extends JpaRepository<Commande, Long>{

}
