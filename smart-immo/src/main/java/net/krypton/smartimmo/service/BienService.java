package net.krypton.smartimmo.service;

import java.util.List;

import net.krypton.smartimmo.entities.Bien;

public interface BienService {

	public Bien ajouterBien(Bien a);
	public Bien modifierBien(Bien m);
	public void supprimerBien (int idBien);
	public Bien consulterBien(int idBien);
	public List<Bien> consulterBiens();
}
