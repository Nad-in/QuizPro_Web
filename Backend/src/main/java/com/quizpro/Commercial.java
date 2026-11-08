package com.example.quizpro;

import jakarta.persistence.*;

@Entity
@Table(name = "commercial")
public class Commercial extends Utilisateur {

    @Column(name = "nom_equipe", length = 50)
    private String nomEquipe;

    @ManyToOne
    @JoinColumn(name = "id_formateur")
    private Formateur formateur;

    protected Commercial() {
        super();
    }}