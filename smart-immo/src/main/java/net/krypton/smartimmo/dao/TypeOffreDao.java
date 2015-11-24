package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.TypeOffre;

public interface TypeOffreDao {

	public TypeOffre ajouterTypeOffre(TypeOffre a);
	public TypeOffre modifierTypeOffre(TypeOffre m);
	public void supprimerTypeOffre (int idTypeOffre);
	public TypeOffre consulterTypeOffre(int idTypeOffre);
	public List<TypeOffre> consulterTypeOffres();
}
