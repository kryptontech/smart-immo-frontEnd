package net.krypton.smartimmo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.codehaus.jackson.util.DefaultPrettyPrinter.FixedSpaceIndenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.krypton.smartimmo.entities.Album;
import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.entities.SousCategorie;
import net.krypton.smartimmo.model.AllMethods;
import net.krypton.smartimmo.model.BienModel;
import net.krypton.smartimmo.model.FormSearch;
import net.krypton.smartimmo.service.AlbumService;
import net.krypton.smartimmo.service.BienService;
import net.krypton.smartimmo.service.DisponibiliteService;
import net.krypton.smartimmo.service.FournisseurService;
import net.krypton.smartimmo.service.SousCategorieService;
import net.krypton.smartimmo.service.TypeOffreService;
import net.krypton.smartimmo.service.VilleService;

@Controller
public class SearchController {
	
	@Autowired
	static BienService bienService;
	
	
	@Autowired
	FournisseurService fournisseurService;

	@Autowired
	TypeOffreService typeOffreService;

	@Autowired
	VilleService villeService;

	@Autowired
	SousCategorieService sousCategorieService;

	@Autowired
	DisponibiliteService disponibiliteService;

	 
	 
	 @Autowired
	 AlbumService albumService;
	
	AllMethods  search = new AllMethods();
	final static double PRIX_MAX = 2000000000;
	final static double PRIX_MIN = 0;
	private final String V ="Vente";
	private final String L ="Location";
	
	
	
	//NOUVELLE METHODE POUR LA RECHERCHE
	
	
	
	
	@RequestMapping(value="/rechercheVente", method= RequestMethod.POST)
	public String RechercheVente(@Valid FormSearch fs, Model model)
	{
		List<Bien> listBiens=new ArrayList<Bien>();
		String to = V;
		String ville = fs.getVille();
		String sousCategorie = fs.getSousCategorie();
		double prixMini = fs.getPrixMini();
		double prixMaxi = fs.getPrixMaxi();
		String quartier = fs.getQuartierBien();
		//if(ville.length()>0)
			if(sousCategorie.length()>0){
	System.out.println("taille char ville " + sousCategorie.length());
			//if(sousCategorie.length()>0)
			if(ville.length()>0){
				System.out.println("taille char ville " + ville.length());
				if(prixMini >= PRIX_MIN){
					if (prixMaxi <= PRIX_MAX){
						if (quartier.length()>0){
							listBiens = AllMethods.listeDesBiensParVilleSousCatQuartierEtPrix(to, ville, sousCategorie, quartier, prixMini, prixMaxi);
							model.addAttribute("listBiens", listBiens);
							System.out.println(quartier);
							System.out.println(prixMaxi);
							System.out.println(prixMini);
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
							
							System.out.println(listBiens.size());
							System.out.println(listBiens.size());
							System.out.println(listBiens.size());
						}
					}
					
			
				}
					
			}
		}
		
		return "bien-list";
	}
	
	
	// recherche location 
	
	@RequestMapping(value="/rechercheLocation", method= RequestMethod.POST)
	public String RechercheLocation(@Valid FormSearch fs, Model model)
	{
		List<Bien> listBiens=new ArrayList<Bien>();
		String to = L;
		String ville = fs.getVille();
		String sousCategorie = fs.getSousCategorie();
		double prixMini = fs.getPrixMini();
		double prixMaxi = fs.getPrixMaxi();
		String quartier = fs.getQuartierBien();
		
		if(ville.length()>0){
			if(sousCategorie.toString().length()>0){
				
				System.out.println("test"+sousCategorie.length());
				if(prixMini >= PRIX_MIN){
					if (prixMaxi <= PRIX_MAX){
						if (quartier.length()>0){
							listBiens = AllMethods.listeDesBiensParVilleSousCatQuartierEtPrix(to, ville, sousCategorie, quartier, prixMini, prixMaxi);
							model.addAttribute("listBiens", listBiens);
							System.out.println(quartier);
							System.out.println(prixMaxi);
							System.out.println(prixMini);
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
			if(sousCategorie.toString().length()>0){
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
							
							System.out.println(listBiens.size());
							System.out.println(listBiens.size());
							System.out.println(listBiens.size());
						}
					}
					
			
				}
					
			}
		}
		
		return "bien-list";
	}
	
	
	
	
	public static List<Bien> listeDesBiensParTypeOffre(String libTO)
	{
		
		List<Bien> biens = bienService.consulterBiens();
		System.out.println("biens"+ biens);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getTypeoffre().getLibelleTypeOffre().equals(libTO))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}
	
	
	public static List<Bien> listeDesBiensParQuartier(String libTO, String quartier)
	{
		
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getQuartierBien().equals(quartier))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}
	
	
	public static List<Bien> listeDesBiensParSousCat(String libTO, String libSousCat)
	{
		
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getSousCategorie().getLibelleSousCategorie().equals(libSousCat))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}
	
	
	public static List<Bien> listeDesBiensParPrixBas(String libTO, double prixMin)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			double prix = b.getPrixBien();
			if ((prix >= prixMin) && (prix <= PRIX_MAX))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}
	
	
	public static List<Bien> listeDesBiensParPrixMax(String libTO, double prixMax)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			double prix = b.getPrixBien();
			if ((prix <= prixMax) && (prix >= PRIX_MIN))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}
	
	
	public static List<Bien> listeDesBiensParVille(String libTO, String libVille)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getVille().getLibelleVille().equals(libVille))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}
	
	
	public static List<Bien> listeDesBiensParVilleEtSousCat(String libTO, String libVille, String libSousCat)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getVille().getLibelleVille().equals(libVille)) {
				if  (b.getSousCategorie().getLibelleSousCategorie().equals(libSousCat)){
						listBiens.add(i, b);
				}
			}
		}
		return listBiens;
	}
	
	public static List<Bien> listeDesBiensParVilleEtQuartier(String libTO, String libVille, String quartier)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getVille().getLibelleVille().equals(libVille)) {
				if  (b.getQuartierBien().equals(quartier)){
						listBiens.add(i, b);
				}
			}
		}
		return listBiens;
	}
	
	public static List<Bien> listeDesBiensParVilleSousCatEtQuartier(String libTO, String libVille, String libSousCat, String quartier)
	{
		List<Bien> BVS = listeDesBiensParVilleEtSousCat(libTO, libVille, libSousCat);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  Bien b = new Bien();
			  b = BVS.get(i);
			  if (b.getQuartierBien().equals(quartier))
			  {
				  listBiens.add(i, b);
			  }
		  }
		  return listBiens; 
	}
	
	public static List<Bien> listeDesBiensParSousCatEtQuartier(String libTO, String libSousCat, String quartier)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getSousCategorie().getLibelleSousCategorie().equals(libSousCat)) {
				if  (b.getQuartierBien().equals(quartier)){
						listBiens.add(i, b);
				}
			}
		}
		return listBiens;
	}
	
	////////////////////////////////////////////
	public static List<Bien> listeDesBiensQuartierEtPrixMin(String libTO, String quartier, double prixMin)
	{
		List<Bien> BVS = listeDesBiensParQuartier(libTO, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix <= PRIX_MAX) && (prix >= prixMin))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	////////////////////////////////////////	
	public static List<Bien> listeDesBiensQuartierEtPrixMax(String libTO, String quartier, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParQuartier(libTO, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix <= prixMax) && (prix >= PRIX_MIN))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
		
	///////2
	public static List<Bien> listeDesBiensParVilleSousCatQuartierEtPrixMin(String libTO, String libVille, String libSousCat, String quartier, double prixMin)
	{
		List<Bien> BVS = listeDesBiensParVilleSousCatEtQuartier(libTO, libVille, libSousCat, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix <= PRIX_MAX) && (prix >= prixMin))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	
	//////3
	public static List<Bien> listeDesBiensParVilleSousCatQuartierEtPrixMax(String libTO, String libVille, String libSousCat, String quartier, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParVilleSousCatEtQuartier(libTO, libVille, libSousCat, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= PRIX_MIN) && (prix <= prixMax))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	
	//////4
	public static List<Bien> listeDesBiensParVilleSousCatQuartierEtPrix(String libTO, String libVille, String libSousCat, String quartier,  double prixMin, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParVilleSousCatEtQuartier(libTO, libVille, libSousCat, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= prixMin) && (prix <= prixMax))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	
	/////500000000000000
	public static List<Bien> listeDesBiensParVilleQuartierEtPrix(String libTO, String libVille, String quartier,  double prixMin, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParVilleEtQuartier(libTO, libVille, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= prixMin) && (prix <= prixMax))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	
	
	////0000000000000
	public static List<Bien> listeDesBiensParSousCatQuartierEtPrix(String libTO, String libSousCat, String quartier,  double prixMin, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParSousCatEtQuartier(libTO, libSousCat, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= prixMin) && (prix <= prixMax))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	
	////0000000000000
	public static List<Bien> listeDesBiensParSousCatQuartierEtPrixMin(String libTO, String libSousCat, String quartier,  double prixMin)
	{
		List<Bien> BVS = listeDesBiensParSousCatEtQuartier(libTO, libSousCat, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= prixMin) && (prix <= PRIX_MAX))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	///////////////0000000000000000000
	public static List<Bien> listeDesBiensParVilleQuartierEtPrixMin(String libTO, String libVille, String quartier,  double prixMin)
	{
		List<Bien> BVS = listeDesBiensParVilleEtQuartier(libTO, libVille, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= prixMin) && (prix <= PRIX_MAX))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	/////////////////////0000000000000000000000000000000
	public static List<Bien> listeDesBiensParSousCatQuartierEtPrixMax(String libTO, String libSousCat, String quartier, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParSousCatEtQuartier(libTO, libSousCat, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= PRIX_MIN) && (prix <= prixMax))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	///////////////0000000000000000000
	public static List<Bien> listeDesBiensParVilleQuartierEtPrixMax(String libTO, String libVille, String quartier, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParVilleEtQuartier(libTO, libVille, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= PRIX_MIN) && (prix <= prixMax))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	
	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	public static List<Bien> listeDesBiensParVilleSousCatEtPrixMin(String libTO, String libVille, String libSousCat, double prixMin)
	 {
	  List<Bien> BVS = listeDesBiensParVilleEtSousCat(libTO, libVille, libSousCat);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= prixMin) && (prix <=PRIX_MAX))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }
	
	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	public static List<Bien> listeDesBiensParVilleSousCatEtPrixMax(String libTO, String libVille, String libSousCat, double prixMax)
	 {
	  List<Bien> BVS = listeDesBiensParVilleEtSousCat(libTO, libVille, libSousCat);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= PRIX_MIN) && (prix <=prixMax))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }
	
	
	public static List<Bien> listeDesBiensParVilleSousCatEtPrix(String libTO, String libVille, String libSousCat, double prixMin, double prixMax)
	 {
	  List<Bien> BVS = listeDesBiensParVilleEtSousCat(libTO, libVille, libSousCat);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= prixMin) && (prix <=prixMax))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }

	
	public static List<Bien> listeDesBiensParVilletEtPrix(String libTO, String libVille, double prixMin, double prixMax) 
	{

		  List<Bien> BVP = listeDesBiensParPrix(libTO,prixMin, prixMax);
		  List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVP.size(); i++)
		  {
			  Bien b = new Bien();
			  b = BVP.get(i);
			  if (b.getVille().getLibelleVille().equals(libVille))
			  {
				  listBiens.add(i, b);
			  }
		  }
		  return listBiens; 
	}
	
	public static List<Bien> listeDesBiensParSousCatEtPrix(String libTO, String libSousCat, double prixMin, double prixMax)
	{
		 List<Bien> BVP = listeDesBiensParPrix(libTO, prixMin, prixMax);
		  List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVP.size(); i++)
		  {
			  Bien b = new Bien();
			  b = BVP.get(i);
			  if (b.getVille().getLibelleVille().equals(libSousCat))
			  {
				  listBiens.add(i, b);
			  }
		  }
		  return listBiens; 
	}
	
	public static List<Bien> listeDesBiensParPrix(String libTO, double prixMin, double prixMax)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			double prix = b.getPrixBien();
			if ((prix >= prixMin) && (prix <= prixMax))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}

	
	
	//wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
	public static List<Bien> listeDesBiensParVilleEtPrixMin(String libTO, String libVille, double prixMin)
	 {
	  List<Bien> BVS = listeDesBiensParVille(libTO, libVille);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= prixMin) && (prix <=PRIX_MAX))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }
	//wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
	public static List<Bien> listeDesBiensParSousCatEtPrixMin(String libTO, String libSousCat, double prixMin)
	 {
	  List<Bien> BVS = listeDesBiensParSousCat(libTO, libSousCat);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= prixMin) && (prix <=PRIX_MAX))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }
	//wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
	public static List<Bien> listeDesBiensParVilleEtPrixMax(String libTO, String libVille, double prixMax)
	 {
	  List<Bien> BVS = listeDesBiensParVille(libTO, libVille);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= PRIX_MIN) && (prix <=prixMax))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }
	//wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
	public static List<Bien> listeDesBiensParSousCatEtPrixMax(String libTO, String libVille, double prixMax)
	 {
	  List<Bien> BVS = listeDesBiensParSousCat(libTO, libVille);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= PRIX_MIN) && (prix <=prixMax))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }

	public static List<Bien> listeDesBiensParQuartierEtPrix(String libTO, String quartier, double prixMin, double prixMax)
	{
		List<Bien> BVP = listeDesBiensParPrix(libTO, prixMin, prixMax);
		  List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVP.size(); i++)
		  {
			  Bien b = new Bien();
			  b = BVP.get(i);
			  if (b.getQuartierBien().equals(quartier))
			  {
				  listBiens.add(i, b);
			  }
		  }
		  return listBiens;
	}

	
	
	
	
	@RequestMapping(value="/Vente")
	public String Vente(FormSearch fs,  Model model)
	{
	 List<BienModel> BM = new ArrayList<BienModel>();
	 BienModel bm =new BienModel();
	 List<Bien> listBiens=new ArrayList<Bien>();
	 String to = V;
	 listBiens =   listeDesBiensParTypeOffre(to);
	 for (int i=0; i<listBiens.size(); i++){
	  Bien b = new Bien();
	  b = listBiens.get(i);
	  bm.setDescriptif(b.getDescriptionBien());
	  bm.setIdBien(b.getIdBien());
	  int id = bm.getIdBien();
	  bm.setPrixBien(b.getPrixBien());
	  bm.setQuartierBien(b.getQuartierBien());
	  bm.setSouscategorie(b.getSousCategorie().getLibelleSousCategorie());
	  bm.setTitreBien(b.getTitreBien());
	  bm.setVille(b.getVille().getLibelleVille());
	  List<Album> listAlbums=new ArrayList<Album>();
	  listAlbums = albumService.consulterAlbums();
	  for (int j=0; j<listAlbums.size(); j++){
	   Album a = new Album();
	   a = listAlbums.get(i);
	   int ID = a.getBien().getIdBien();
	   if (id == ID){
	    bm.setAlbum(a.getPathAlbum());
	   }
	  }
	  BM.add(bm);
	 }
	 

	  model.addAttribute("listBiens", BM);
	 
	 return "bienlist";
	}
	
	
	@RequestMapping(value="/Location")
	public String Location(FormSearch fs,  Model model)
	{
	 List<BienModel> BM = new ArrayList<BienModel>();
	 BienModel bm =new BienModel();
	 List<Bien> listBiens=new ArrayList<Bien>();
	 String to = L;
	 listBiens =   listeDesBiensParTypeOffre(to);
	 for (int i=0; i<listBiens.size(); i++){
	  Bien b = new Bien();
	  b = listBiens.get(i);
	  bm.setDescriptif(b.getDescriptionBien());
	  bm.setIdBien(b.getIdBien());
	  int id = bm.getIdBien();
	  bm.setPrixBien(b.getPrixBien());
	  bm.setQuartierBien(b.getQuartierBien());
	  bm.setSouscategorie(b.getSousCategorie().getLibelleSousCategorie());
	  bm.setTitreBien(b.getTitreBien());
	  bm.setVille(b.getVille().getLibelleVille());
	  List<Album> listAlbums=new ArrayList<Album>();
	  listAlbums = albumService.consulterAlbums();
	  for (int j=0; j<listAlbums.size(); j++){
	   Album a = new Album();
	   a = listAlbums.get(i);
	   int ID = a.getBien().getIdBien();
	   if (id == ID){
	    bm.setAlbum(a.getPathAlbum());
	   }
	  }
	  BM.add(bm);
	 }
	 
	 
	  model.addAttribute("listBiens", BM);
	 
	 return "bienlist";
	}
}
