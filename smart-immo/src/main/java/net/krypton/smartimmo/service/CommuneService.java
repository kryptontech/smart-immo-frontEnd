package net.krypton.smartimmo.service;

import java.util.List;

import net.krypton.smartimmo.entities.Commune;

public interface CommuneService {

	public Commune ajouterCommune(Commune a);
	public Commune modifierCommune(Commune m);
	public void supprimerCommune (int idCommune);
	public Commune consulterCommune(int idCommune);
	public List<Commune> consulterCommunes();
}
