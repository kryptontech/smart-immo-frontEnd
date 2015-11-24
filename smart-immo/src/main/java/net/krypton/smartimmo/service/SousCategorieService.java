package net.krypton.smartimmo.service;

import java.util.List;

import net.krypton.smartimmo.entities.SousCategorie;

public interface SousCategorieService {

	public SousCategorie ajouterSousCategorie(SousCategorie a);
	public SousCategorie modifierSousCategorie(SousCategorie m);
	public void supprimerSousCategorie (int idSousCategorie);
	public SousCategorie consulterSousCategorie(int idSousCategorie);
	public List<SousCategorie> consulterSousCategories();
}
