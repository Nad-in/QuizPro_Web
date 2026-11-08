package com.example.quizpro;

import jakarta.persistence.*;

@Entity
@Table(name = "formateur")
public class Formateur extends Utilisateur {

    protected Formateur() {
        super();
    }

    public Formateur(String nom, String prenom, String email, String password) {
        super(nom, prenom, email, password);
    }
}