package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.Ville;

public interface VilleDao {

	public Ville ajouterVille(Ville a);
	public Ville modifierVille(Ville m);
	public void supprimerVille (int idVille);
	public Ville consulterVille(int idVille);
	public List<Ville> consulterVilles();
}
