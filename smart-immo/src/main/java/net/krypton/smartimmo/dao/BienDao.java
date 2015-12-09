package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.entities.Fournisseur;

public interface BienDao {

	public Bien ajouterBien(Bien a);
	public Bien modifierBien(Bien m);
	public void supprimerBien (int idBien);
	public Bien consulterBien(int idBien);
	public List<Bien> consulterBienByFournisseur(Fournisseur f);
	public List<Bien> consulterBiens();
	
	/*// MA METHODE PERSO
	public List<Bien> consulterParSearch();*/
	
	
}
