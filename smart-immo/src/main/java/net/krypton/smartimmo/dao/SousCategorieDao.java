package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.SousCategorie;

public interface SousCategorieDao {

	public SousCategorie ajouterSousCategorie(SousCategorie a);
	public SousCategorie modifierSousCategorie(SousCategorie m);
	public void supprimerSousCategorie (int idSousCategorie);
	public SousCategorie consulterSousCategorie(int idSousCategorie);
	public List<SousCategorie> consulterSousCategories();
}
