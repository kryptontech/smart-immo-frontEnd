package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.Commune;

public interface CommuneDao {

	public Commune ajouterCommune(Commune a);
	public Commune modifierCommune(Commune m);
	public void supprimerCommune (int idCommune);
	public Commune consulterCommune(int idCommune);
	public List<Commune> consulterCommunes();
}
