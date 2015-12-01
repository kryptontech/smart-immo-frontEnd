package net.krypton.smartimmo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.entities.Disponibilite;
import net.krypton.smartimmo.entities.Fournisseur;
import net.krypton.smartimmo.entities.SousCategorie;
import net.krypton.smartimmo.entities.TypeOffre;
import net.krypton.smartimmo.entities.Ville;
import net.krypton.smartimmo.model.FrontPage;
import net.krypton.smartimmo.model.MdpModel;
import net.krypton.smartimmo.model.ModifierFourModel;
import net.krypton.smartimmo.model.Test;
import net.krypton.smartimmo.service.AgenceService;
import net.krypton.smartimmo.service.BienService;
import net.krypton.smartimmo.service.DisponibiliteService;
import net.krypton.smartimmo.service.FournisseurService;
import net.krypton.smartimmo.service.SousCategorieService;
import net.krypton.smartimmo.service.TypeOffreService;
import net.krypton.smartimmo.service.VilleService;

@Controller
public class FournisseurController {

	@Autowired
	FournisseurService fournisseurService;
	@Autowired
	AgenceService agenceService;
	
	
	@Autowired
	BienService bienService;
	

	@Autowired
	TypeOffreService typeOffreService;

	@Autowired
	VilleService villeService;

	@Autowired
	SousCategorieService sousCategorieService;

	@Autowired
	DisponibiliteService disponibiliteService;
	
	
	Test Test = new Test();
	
	@RequestMapping(value="/saveFournisseur", method = RequestMethod.POST)
	public String enregistrerFournisseur(@Valid Fournisseur v, BindingResult result, ModelMap model){
		v.setMdpFournisseur(Test.md5(v.getMdpFournisseur()));
		fournisseurService.ajouterFournisseur(v);
		return "profile";
	}
	@RequestMapping(value = "/saveFournisseur", method = RequestMethod.GET)
	public String newFournisseur(ModelMap model){
		Fournisseur fournisseur = new Fournisseur();
		model.addAttribute("formFournisseur", fournisseur);
		
		return "form-inscription";
	}
	
	
	
	
	

	
	@RequestMapping(value = "/deleteFournisseur-{idFournisseur}")
	public String supprimerFournisseur(@PathVariable int idFournisseur){
		
		fournisseurService.supprimerFournisseur(idFournisseur);
		return "redirect:/viewFournisseurs";
	}
	
	
	
	
	@RequestMapping(value = "/modifyFournisseur-{idFournisseur}", method = RequestMethod.GET)
	public String editFournisseur(@PathVariable int idFournisseur, ModelMap model){
		
		Fournisseur fournisseur = fournisseurService.consulterFournisseur(idFournisseur);
		model.addAttribute("formFournisseur", fournisseur);
		model.addAttribute("edit", true);
		return "formFournisseur";
	}
	@RequestMapping(value = "/modifyFournisseur-{idFournisseur}", method = RequestMethod.POST)
	public String modifierFournisseur(@Valid Fournisseur v, BindingResult result, ModelMap model, @PathVariable int idFournisseur){
		v.setMdpFournisseur(Test.md5(v.getMdpFournisseur()));
		fournisseurService.modifierFournisseur(v);
		return "profile";
	}
	
	
	/*
	@RequestMapping("/viewFournisseur")
	public Fournisseur consulterFournisseur(int idFournisseur)
	{
		return fournisseurService.consulterFournisseur(idFournisseur);
	}
	
	@RequestMapping(value="/viewFournisseurs")
	public String consulterFournisseurs(Map<String, Object> map)
	{
		map.put("listFournisseur", fournisseurService.consulterFournisseurs());
		return "fournisseur";
	}*/
	
	/*public Fournisseur findFournisseurByNom(String nom)
	{
		List<Fournisseur> Fournisseurs = fournisseurService.consulterFournisseurs();
		Fournisseur Fournisseur = new Fournisseur();
		for (int i = 0; i < Fournisseurs.size(); i++)
		{
			Fournisseur F = new Fournisseur();
			F = Fournisseurs.get(i);
			
			if (F.getNomFournisseur().equals(nom))
			{
				Fournisseur = F;
			}
		}
		return Fournisseur;
	}*/
	
	
	
	@RequestMapping(value = "/profile-{idFour}", method = RequestMethod.GET)
	public String listBienParIdFournisseur(@PathVariable int idFour , Model model)
	{
		 // LIST DES BIEN DU FOURNISSEUR 
		  List<Bien> biens = new ArrayList<Bien>();
	      biens = bienService.consulterBiens();
		  List<Bien> listBiens = new ArrayList<Bien>();
	      
	      for (int i = 0; i < biens.size(); i++) {
	    	
	    	  Bien b = new Bien();
	    	  b = biens.get(i);
	    	  int id=b.getFournisseur().getIdFournisseur();
	    	  
	    	  if (id==idFour)
				{
					listBiens.add(b);
				}
	    	 
	      }
	      
	      // MODIFIER FOURNISSEUR 
	        Fournisseur f = fournisseurService.consulterFournisseur(idFour);
			ModifierFourModel mf = new ModifierFourModel();
			mf.setEmailFournisseur(f.getEmailFournisseur());
			mf.setNomFournisseur(f.getNomFournisseur());
			mf.setPseudoFournisseur(f.getPseudoFournisseur());
			mf.setTelMobileFournisseur(f.getTelMobileFournisseur());
			System.out.println("roland");
		    model.addAttribute("fFournisseur", mf);	
		    System.out.println(mf);
		    
	        model.addAttribute("listBiens", listBiens);
	        Bien b = new Bien();
	        model.addAttribute("formBien", b);
	        System.out.println(mf.getEmailFournisseur());
	        
	        // MOT DE PASSE DU FOURNISSEUR 
	     
	        MdpModel mdpd = new MdpModel();
	        //mdpd.setMdpFournisseur(f.getMdpFournisseur());
	        model.addAttribute("mdpform", mdpd);
	        
	        
	        //*******************************************
	        Bien bien = new Bien();

			model.addAttribute("listDisponible",
					disponibiliteService.consulterDisponibilites());	

			model.addAttribute("listFournisseur",
					fournisseurService.consulterFournisseurs());
			model.addAttribute("listTypeOffre",
					typeOffreService.consulterTypeOffres());
			model.addAttribute("listVille", villeService.consulterVilles());
			model.addAttribute("listSousCategorie",
					sousCategorieService.consulterSousCategories());
			model.addAttribute("listDisponibilite",
					disponibiliteService.consulterDisponibilites());
			model.addAttribute("formBien", bien);
		
	        
	        
	        
	        return "profile"; 
	        
	        // AJOUTER UN BIEN PAR LE FOURNISSEUR
	        
	        
	        
	      
	}
	@RequestMapping(value = "/profile-{idFour}", method = RequestMethod.POST)
	public String update(@Valid ModifierFourModel mf, BindingResult result, ModelMap model, @PathVariable int idFour)
	{
		
		
		
		Fournisseur f = new Fournisseur();
		f = fournisseurService.consulterFournisseur(idFour);
		f.setEmailFournisseur(mf.getEmailFournisseur());
		f.setNomFournisseur(mf.getNomFournisseur());
		f.setPseudoFournisseur(mf.getPseudoFournisseur());
		f.setTelMobileFournisseur(mf.getTelMobileFournisseur());
		
		model.addAttribute("fFournisseur", mf);	
		fournisseurService.modifierFournisseur(f);
		
		 	
		// AJOUT DE BIEN PAR LE FOURNISSEUR POST
		//******************************
		
	    

	
		return "redirect:/profile-{idFour}";
	    
	    
	}
	
	
	// TEST AVEC UN NOUVEAU REQUEST MAPPING 
	
	@RequestMapping(value = "/profileAddBien-{idFour}", method = RequestMethod.GET)
	public String listBienParIdFournisseur1(@PathVariable int idFour , Model model)
	{
		 Bien bien = new Bien();

			model.addAttribute("listDisponible",
					disponibiliteService.consulterDisponibilites());	

			model.addAttribute("listFournisseur",
					fournisseurService.consulterFournisseurs());
			model.addAttribute("listTypeOffre",
					typeOffreService.consulterTypeOffres());
			model.addAttribute("listVille", villeService.consulterVilles());
			model.addAttribute("listSousCategorie",
					sousCategorieService.consulterSousCategories());
			model.addAttribute("listDisponibilite",
					disponibiliteService.consulterDisponibilites());
			model.addAttribute("formBien", bien);
		
			 return "profile";        
	}      
	        
	       
	
	@RequestMapping(value = "/profileAddBien", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("v") FrontPage v, BindingResult result, ModelMap model)
	{
		

		if (result.hasErrors()) {
			System.out.println("    ");
			System.out.println(result.getFieldErrorCount());
			System.out.println(result.getNestedPath());
			System.out.println(result.getObjectName());
			System.out.println(result.getFieldError());
			System.out.println("    ");
			
			model.addAttribute("listDisponible",
					disponibiliteService.consulterDisponibilites());
			model.addAttribute("listFournisseur",
					fournisseurService.consulterFournisseurs());
			model.addAttribute("listTypeOffre",
					typeOffreService.consulterTypeOffres());
			model.addAttribute("listVille", villeService.consulterVilles());
			model.addAttribute("listSousCategorie",
					sousCategorieService.consulterSousCategories());
			model.addAttribute("listDisponibilite",
					disponibiliteService.consulterDisponibilites());
			model.addAttribute("formBien", v);
			
		}
		try {
			Bien bien = new Bien();
			bien.setDatePubBien(new Date());
			bien.setDescriptionBien(v.getDescriptionBien());
			bien.setNbPieceBien(v.getNbPieceBien());
			bien.setPrixBien(v.getPrixBien());
			bien.setQuartierBien(v.getQuartierBien());
			bien.setStatutBien(v.isStatutBien());
			bien.setSuperficieBien(v.getSuperficieBien());
			bien.setTitreBien(v.getTitreBien());

			Fournisseur four = new Fournisseur();
			four = findFournisseurByNom(v.getFournisseur());
			bien.setFournisseur(four);

			Ville V = new Ville();
			V = findVilleByName(v.getVille());
			bien.setVille(V);

			TypeOffre T = new TypeOffre();
			T = findTypeOffreByLibelle(v.getTypeoffre());
			bien.setTypeoffre(T);

			Disponibilite D = new Disponibilite();
			D = findDisponibiliteByLibelle(v.getDisponibilite());
			bien.setDisponibilite(D);

			SousCategorie S = new SousCategorie();
			S = findSousCategorieByLibelle(v.getSouscategorie());
			bien.setSouscategorie(S);

			
			model.addAttribute("formBien", bien);

		} catch (Exception e) {

			v.setException(e.getMessage());
		}
		
		

		return "redirect:/profile-{idFour}";
	    
	    
	}
	
	
	
	
	
	
	// LES METHODES POUR L AJOUT DU BIEN PAR LE FOURNISSEUR 
	
	public Bien findBienByTitre(String titre) {
		List<Bien> biens = bienService.consulterBiens();
		Bien bien = new Bien();
		for (int i = 0; i < biens.size(); i++) {
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getTitreBien().equals(titre)) {
				bien = b;
			}
		}
		return bien;
	}

	public Ville findVilleByName(String ville) {
		List<Ville> villes = villeService.consulterVilles();
		Ville Ville = new Ville();
		for (int i = 0; i < villes.size(); i++) {
			Ville V = new Ville();
			V = villes.get(i);

			if (V.getLibelleVille().equals(ville)) {
				Ville = V;
			}
		}
		return Ville;
	}

	public TypeOffre findTypeOffreByLibelle(String tofre) {
		List<TypeOffre> TypeOffres = typeOffreService.consulterTypeOffres();
		TypeOffre TypeOffre = new TypeOffre();
		for (int i = 0; i < TypeOffres.size(); i++) {
			TypeOffre T = new TypeOffre();
			T = TypeOffres.get(i);

			if (T.getLibelleTypeOffre().equals(tofre)) {
				TypeOffre = T;
			}
		}
		return TypeOffre;
	}

	public SousCategorie findSousCategorieByLibelle(String scat) {
		List<SousCategorie> SousCategories = sousCategorieService
				.consulterSousCategories();
		SousCategorie SousCategorie = new SousCategorie();
		for (int i = 0; i < SousCategories.size(); i++) {
			SousCategorie S = new SousCategorie();
			S = SousCategories.get(i);

			if (S.getLibelleSousCat().equals(scat)) {
				SousCategorie = S;
			}
		}
		return SousCategorie;
	}

	public Fournisseur findFournisseurByNom(String nom) {
		List<Fournisseur> Fournisseurs = fournisseurService
				.consulterFournisseurs();
		Fournisseur Fournisseur = new Fournisseur();
		for (int i = 0; i < Fournisseurs.size(); i++) {
			Fournisseur F = new Fournisseur();
			F = Fournisseurs.get(i);

			if (F.getNomFournisseur().equals(nom)) {
				Fournisseur = F;
			}
		}
		return Fournisseur;
	}

	public Disponibilite findDisponibiliteByLibelle(String libDispo) {
		List<Disponibilite> disponibilites = disponibiliteService
				.consulterDisponibilites();
		Disponibilite Disponibilite = new Disponibilite();
		for (int i = 0; i < disponibilites.size(); i++) {
			Disponibilite D = new Disponibilite();
			D = disponibilites.get(i);

			if (D.getLibelleDisponibilite().equals(libDispo)) {
				Disponibilite = D;
			}
		}
		return Disponibilite;
	}
		
	/*@RequestMapping(value = "/profilePass-{idFour}", method = RequestMethod.POST)
	public String update(@Valid MdpModel mdp, BindingResult result, ModelMap model, @PathVariable int idFour)
	{
		
	    return "redirect:/profile-{idFour}";
	}*/
	
	@RequestMapping("/SeConnecter")
	 public String login() {
	  return "login";
	 }

	
	
}
