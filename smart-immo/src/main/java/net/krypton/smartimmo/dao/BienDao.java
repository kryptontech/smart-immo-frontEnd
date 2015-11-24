package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.Bien;

public interface BienDao {

	public Bien ajouterBien(Bien a);
	public Bien modifierBien(Bien m);
	public void supprimerBien (int idBien);
	public Bien consulterBien(int idBien);
	public List<Bien> consulterBiens();
}
