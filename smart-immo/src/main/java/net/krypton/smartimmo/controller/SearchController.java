package net.krypton.smartimmo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.model.AllMethods;
import net.krypton.smartimmo.model.FormSearch;
import net.krypton.smartimmo.service.BienService;

@Controller
public class SearchController {
	
	@Autowired
	static BienService bienService;
	
	AllMethods  search = new AllMethods();
	final double PRIX_MAX = 2000000000;
	final double PRIX_MIN = 0;
	
	
	@RequestMapping(value="recherche", method= RequestMethod.POST)
	public String Recherche(@Valid FormSearch fs, Model model)
	{
		List<Bien> listBiens=new ArrayList<Bien>();
		String to = fs.getTo().getLibelleTypeOffre();
		String ville = fs.getVille().getLibelleVille();
		String sousCategorie = fs.getSousCategorie().getLibelleSousCat();
		double prixMini = fs.getPrixMini();
		double prixMaxi = fs.getPrixMaxi();
		String quartier = fs.getQuartier();
		
		if(ville.length()>0){
			if(sousCategorie.length()>0){
				if(prixMini >= PRIX_MIN){
					if (prixMaxi <= PRIX_MAX){
						if (quartier.length()>0){
							listBiens = AllMethods.listeDesBiensParVilleSousCatQuartierEtPrix(to, ville, sousCategorie, quartier, prixMini, prixMaxi);
							model.addAttribute("listBiens", listBiens);
						}
						else{
							listBiens = AllMethods.listeDesBiensParVilleSousCatEtPrix(to, ville, sousCategorie, prixMini, prixMaxi);
							model.addAttribute("listBiens", listBiens);
						}
					}
					else
					{
						if (quartier.length()>0){
							listBiens = AllMethods.listeDesBiensParVilleSousCatQuartierEtPrixMin(to, ville, sousCategorie, quartier, prixMini);
							model.addAttribute("listBiens", listBiens);
						}
						else{
							listBiens = AllMethods.listeDesBiensParVilleSousCatEtPrixMin(to, ville, sousCategorie, prixMini);
							model.addAttribute("listBiens", listBiens);
						}
							
					}
				}
				else{
						if (prixMaxi <= PRIX_MAX){
							if(quartier.length()>0){
								listBiens = AllMethods.listeDesBiensParVilleSousCatQuartierEtPrixMax(to, ville, sousCategorie, quartier, prixMaxi);
								model.addAttribute("listBiens", listBiens);
							}
							else{
								listBiens = AllMethods.listeDesBiensParVilleSousCatEtPrixMax(to, ville, sousCategorie, prixMaxi);
								model.addAttribute("listBiens", listBiens);
							}
						}
						else{
							if(quartier.length()>0){
								listBiens = AllMethods.listeDesBiensParVilleSousCatEtQuartier(to, ville, sousCategorie, quartier);
								model.addAttribute("listBiens", listBiens);
							}
							else{
								listBiens = AllMethods.listeDesBiensParVilleEtSousCat(to, ville, sousCategorie);
								model.addAttribute("listBiens", listBiens);
							}
						}
						
				}
			}
			else{
				if(prixMini >= PRIX_MIN){

					if (prixMaxi <= PRIX_MAX){
						if (quartier.length()>0){
							listBiens = AllMethods.listeDesBiensParVilleQuartierEtPrix(to, ville, quartier, prixMini, prixMaxi);
							model.addAttribute("listBiens", listBiens);
						}
						else{
							listBiens = AllMethods.listeDesBiensParVilletEtPrix(to, ville, prixMini, prixMaxi);
							model.addAttribute("listBiens", listBiens);
						}
					}
					else
					{
						if (quartier.length()>0){
							listBiens = AllMethods.listeDesBiensParVilleQuartierEtPrixMin(to, ville, quartier, prixMini);
							model.addAttribute("listBiens", listBiens);
						}
						else{
							listBiens = AllMethods.listeDesBiensParVilleEtPrixMin(to, ville, prixMini);
							model.addAttribute("listBiens", listBiens);
						}
							
					}
				
				}
				else{

					if (prixMaxi <= PRIX_MAX){
						if(quartier.length()>0){
							listBiens = AllMethods.listeDesBiensParVilleQuartierEtPrixMax(to, ville, quartier, prixMaxi);
							model.addAttribute("listBiens", listBiens);
						}
						else{
							listBiens = AllMethods.listeDesBiensParVilleEtPrixMax(to, ville, prixMaxi);
							model.addAttribute("listBiens", listBiens);
						}
					}
					else{
						if(quartier.length()>0){
							listBiens = AllMethods.listeDesBiensParVilleEtQuartier(to, ville, quartier);
							model.addAttribute("listBiens", listBiens);
						}
						else{
							listBiens = AllMethods.listeDesBiensParVille(to, ville);
							model.addAttribute("listBiens", listBiens);
						}
					}
					
			
				}
					
			}
		}
		else{
			if(sousCategorie.length()>0){
				if(prixMini >= PRIX_MIN){
					if (prixMaxi <= PRIX_MAX){
						if (quartier.length()>0){
							listBiens = AllMethods.listeDesBiensParSousCatQuartierEtPrix(to, sousCategorie, quartier, prixMini, prixMaxi);
							model.addAttribute("listBiens", listBiens);
						}
						else{
							listBiens = AllMethods.listeDesBiensParSousCatEtPrix(to, sousCategorie, prixMini, prixMaxi);
							model.addAttribute("listBiens", listBiens);
						}
					}
					else
					{
						if (quartier.length()>0){
							listBiens = AllMethods.listeDesBiensParSousCatQuartierEtPrixMin(to, sousCategorie, quartier, prixMini);
							model.addAttribute("listBiens", listBiens);
						}
						else{
							listBiens = AllMethods.listeDesBiensParSousCatEtPrixMin(to, sousCategorie, prixMini);
							model.addAttribute("listBiens", listBiens);
						}
							
					}
				}
				else{
						if (prixMaxi <= PRIX_MAX){
							if(quartier.length()>0){
								listBiens = AllMethods.listeDesBiensParSousCatQuartierEtPrixMax(to, sousCategorie, quartier, prixMaxi);
								model.addAttribute("listBiens", listBiens);
							}
							else{
								listBiens = AllMethods.listeDesBiensParSousCatEtPrixMax(to, ville, prixMaxi);
								model.addAttribute("listBiens", listBiens);
							}
						}
						else{
							if(quartier.length()>0){
								listBiens = AllMethods.listeDesBiensParSousCatEtQuartier(to, sousCategorie, quartier);
								model.addAttribute("listBiens", listBiens);
							}
							else{
								listBiens = AllMethods.listeDesBiensParSousCat(to, sousCategorie);
								model.addAttribute("listBiens", listBiens);
							}
						}	
				}
			}
			else{
				if(prixMini >= PRIX_MIN){

					if (prixMaxi <= PRIX_MAX){
						if (quartier.length()>0){
							listBiens = AllMethods.listeDesBiensParQuartierEtPrix(to, quartier, prixMini, prixMaxi);
							model.addAttribute("listBiens", listBiens);
						}
						else{
							listBiens = AllMethods.listeDesBiensParPrix(to, prixMini, prixMaxi);
							model.addAttribute("listBiens", listBiens);
						}
					}
					else
					{
						if (quartier.length()>0){
							listBiens = AllMethods.listeDesBiensQuartierEtPrixMin(to, quartier, prixMini);
							model.addAttribute("listBiens", listBiens);
						}
						else{
							listBiens = AllMethods.listeDesBiensParPrixBas(to, prixMini);
							model.addAttribute("listBiens", listBiens);
						}
							
					}
				
				}
				else{

					if (prixMaxi <= PRIX_MAX){
						if(quartier.length()>0){
							listBiens = AllMethods.listeDesBiensQuartierEtPrixMax(to, quartier, prixMaxi);
							model.addAttribute("listBiens", listBiens);
						}
						else{
							listBiens = AllMethods.listeDesBiensParPrixMax(to, prixMaxi);
							model.addAttribute("listBiens", listBiens);
						}
					}
					else{
						if(quartier.length()>0){
							listBiens = AllMethods.listeDesBiensParQuartier(to, quartier);
							model.addAttribute("listBiens", listBiens);
						}
						else{
							listBiens = bienService.consulterBiens();
							model.addAttribute("listBiens", listBiens);
						}
					}
					
			
				}
					
			}
		}
		
		return "bien-list";
	}
	
}
