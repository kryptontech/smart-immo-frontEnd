package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.Region;
import net.krypton.smartimmo.service.RegionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegionController {

	@Autowired
	RegionService regionService;
	
	@RequestMapping("/saveRegion")
	public Region enregistrerRegion(Region a){
		return regionService.ajouterRegion(a);
	}
	
	@RequestMapping("/modifyRegion")
	public Region modifierRegion(Region a){
		return regionService.modifierRegion(a);
	}
	
	@RequestMapping("/deleteRegion")
	public void supprimerRegion(int idRegion){
		
		regionService.supprimerRegion(idRegion);
	}
	
	
	@RequestMapping("/viewRegion")
	public Region consulterRegion(int idRegion)
	{
		return regionService.consulterRegion(idRegion);
	}
	
	@RequestMapping("/viewRegions")
	public List<Region> consulterRegions()
	{
		return regionService.consulterRegions();
	}
	
}
