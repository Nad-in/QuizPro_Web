package com.example.quizpro;
import jakarta.persistence.*;

@Entity
@Table(name = "administrateur")
public class Administrateur extends Utilisateur {

    protected Administrateur() {
        super();
    }

    public Administrateur(String nom, String prenom, String email, String password) {
        super(nom, prenom, email, password);
    }
}
