package ma.uh2c.uh2c.gscompte.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ma.uh2c.uh2.gscompte.dto.Compte;
import ma.uh2c.uh2c.gscompte.service.ICompteService;

@Service
public class CompteService implements ICompteService {
	@Override
	public List<Compte> findAll() {
//creating an object of ArrayList
		ArrayList<Compte> Comptes = new ArrayList<Compte>();
//adding Comptes to the List
		Comptes.add(new Compte("El bourkhissi", "Mohamed"));
		Comptes.add(new Compte("Zenasni", "Mohamed"));
//returns a list of Compte
		return Comptes;
	}
}
