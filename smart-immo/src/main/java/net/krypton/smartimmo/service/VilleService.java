package net.krypton.smartimmo.service;

import java.util.List;

import net.krypton.smartimmo.entities.Ville;

public interface VilleService {

	public Ville ajouterVille(Ville a);
	public Ville modifierVille(Ville m);
	public void supprimerVille (int idVille);
	public Ville consulterVille(int idVille);
	public List<Ville> consulterVilles();
}
