package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.Fournisseur;

public interface FournisseurDao {

	public Fournisseur ajouterFournisseur(Fournisseur a);
	public Fournisseur modifierFournisseur(Fournisseur m);
	public void supprimerFournisseur (int idFournisseur);
	public Fournisseur consulterFournisseur(int idFournisseur);
	public Fournisseur consulterFournisseurByName(String Fournisseur);
	public List<Fournisseur> consulterFournisseurs();
}
