package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.Region;

public interface RegionDao {

	public Region ajouterRegion(Region a);
	public Region modifierRegion(Region m);
	public void supprimerRegion (int idRegion);
	public Region consulterRegion(int idRegion);
	public List<Region> consulterRegions();
}
