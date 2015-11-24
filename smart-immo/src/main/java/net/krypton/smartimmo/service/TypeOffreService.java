package net.krypton.smartimmo.service;

import java.util.List;

import net.krypton.smartimmo.entities.TypeOffre;

public interface TypeOffreService {

	public TypeOffre ajouterTypeOffre(TypeOffre a);
	public TypeOffre modifierTypeOffre(TypeOffre m);
	public void supprimerTypeOffre (int idTypeOffre);
	public TypeOffre consulterTypeOffre(int idTypeOffre);
	public List<TypeOffre> consulterTypeOffres();
}
