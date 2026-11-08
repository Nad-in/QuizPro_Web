package com.example.quizpro;

import jakarta.persistence.*;

@Entity
@Table(name = "categorie")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCat")
    private int idCat;

    @Column(name = "nom", length = 50)
    private String nom;

    @Column(name = "Desc", length = 100)
    private String desc;

    protected Categorie() {
        // Constructeur requis par JPA.
    }

    public Categorie(String nom, String desc) {
        this.nom = nom;
        this.desc = desc;
    }

    // Getters et Setters
    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}