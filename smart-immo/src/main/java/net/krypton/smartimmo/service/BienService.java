package net.krypton.smartimmo.service;

import java.util.List;

import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.entities.Fournisseur;

public interface BienService {

	public Bien ajouterBien(Bien a);
	public Bien modifierBien(Bien m);
	public void supprimerBien (int idBien);
	public Bien consulterBien(int idBien);
	public List<Bien> consulterBiens();
	public List<Bien> consulterBienByFournisseur(Fournisseur f);
	
	// MA METHODE PERSO
	//public List<Bien> consulterParSearch(String libVille , String libSousCat, double prixMin , double prixMax);
}
