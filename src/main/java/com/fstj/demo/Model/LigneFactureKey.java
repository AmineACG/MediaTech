package com.fstj.demo.Model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LigneFactureKey implements Serializable {
    private static final long serialVersionUID = 3059209837592L;

    @Column(name="facture_id")
    private Integer factureId;

    @Column(name="produit_id")
    private Integer produitId;
}
