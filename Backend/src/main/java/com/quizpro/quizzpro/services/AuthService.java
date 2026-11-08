package com.quizpro.quizzpro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quizpro.quizzpro.entities.Utilisateur;
import com.quizpro.quizzpro.repositories.UtilisateurRepository;

@Service
public class AuthService {
	
	@Autowired
	private UtilisateurRepository utlrepo;
	
	@Autowired
    private BCryptPasswordEncoder mopcryp;

	@Transactional
	public Utilisateur inscrire(Utilisateur utl) {
		Utilisateur u=utlrepo.findByEmail(utl.getEmail());
		
		if(u!=null) {
			throw new RuntimeException("Email déjà utilisé !");
		}
		else {
			
			String mpCryp =mopcryp.encode(utl.getMotdepasse());
			
			utl.setMotdepasse(mpCryp);
			return utlrepo.save(utl);
		}
	}

}
