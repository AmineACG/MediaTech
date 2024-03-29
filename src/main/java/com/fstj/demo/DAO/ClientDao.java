package com.fstj.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstj.demo.Model.ClientEntity;

@Repository
public interface ClientDao extends JpaRepository<ClientEntity,Integer>{

    ClientEntity findByNom(String nom);

}