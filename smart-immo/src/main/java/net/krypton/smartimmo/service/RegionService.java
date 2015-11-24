package net.krypton.smartimmo.service;

import java.util.List;

import net.krypton.smartimmo.entities.Region;

public interface RegionService {

	public Region ajouterRegion(Region a);
	public Region modifierRegion(Region m);
	public void supprimerRegion (int idRegion);
	public Region consulterRegion(int idRegion);
	public List<Region> consulterRegions();
}
