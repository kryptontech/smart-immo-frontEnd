package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.Categorie;

public interface CategorieDao {

	public Categorie ajouterCategorie(Categorie a);
	public Categorie modifierCategorie(Categorie m);
	public void supprimerCategorie (int idCategorie);
	public Categorie consulterCategorie(int idCategorie);
	public List<Categorie> consulterCategories();
}
