package ma.uh2c.uh2c.gscompte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.uh2c.uh2.gscompte.dto.Compte;
import ma.uh2c.uh2c.gscompte.service.ICompteService;

@RestController
public class CompteController {
	@Autowired
	private ICompteService CompteService;
	//mapping the getCompte() method to /Compte
	@GetMapping(value = "/Compte")
	public List<Compte> getCompte() 
	{
	//finds all the Comptes
	List<Compte> Comptes = CompteService.findAll();
	//returns the Compte list
	return Comptes;
	}
}
