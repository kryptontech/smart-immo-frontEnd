package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.TypeOffre;
import net.krypton.smartimmo.service.TypeOffreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TypeOffreController {

	@Autowired
	TypeOffreService typeOffreService;
	
	@RequestMapping("/saveTypeOffre")
	public TypeOffre enregistrerTypeOffre(TypeOffre a){
		return typeOffreService.ajouterTypeOffre(a);
	}
	
	@RequestMapping("/modifyTypeOffre")
	public TypeOffre modifierTypeOffre(TypeOffre a){
		return typeOffreService.modifierTypeOffre(a);
	}
	
	@RequestMapping("/deleteTypeOffre")
	public void supprimerTypeOffre(int idTypeOffre){
		
		typeOffreService.supprimerTypeOffre(idTypeOffre);
	}
	
	
	@RequestMapping("/viewTypeOffre")
	public TypeOffre consulterTypeOffre(int idTypeOffre)
	{
		return typeOffreService.consulterTypeOffre(idTypeOffre);
	}
	
	@RequestMapping("/viewTypeOffres")
	public List<TypeOffre> consulterTypeOffres()
	{
		return typeOffreService.consulterTypeOffres();
	}
	
}
