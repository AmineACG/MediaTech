package com.fstj.demo.Model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Client")
//lombok? 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity implements Serializable{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        @Column(nullable = false)
        private String nom;

        @Column(nullable = false)
        private String prenom;

        @Column(name="client Telephone")
        private String telephone;

        //Eager = immediate , lazy = differé
        //lazy will require using GETfactures in order to get them/for DBMS performance optimization        
    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<FactureEntity> factures;

}
        