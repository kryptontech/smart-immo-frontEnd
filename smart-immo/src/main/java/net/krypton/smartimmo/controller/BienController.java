package net.krypton.smartimmo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import net.krypton.smartimmo.entities.Album;
import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.entities.Disponibilite;
import net.krypton.smartimmo.entities.Fournisseur;
import net.krypton.smartimmo.entities.SousCategorie;
import net.krypton.smartimmo.entities.TypeOffre;
import net.krypton.smartimmo.entities.Ville;
import net.krypton.smartimmo.model.DetailsImgModel;
import net.krypton.smartimmo.model.FrontPage;
import net.krypton.smartimmo.service.AlbumService;
import net.krypton.smartimmo.service.BienService;
import net.krypton.smartimmo.service.DisponibiliteService;
import net.krypton.smartimmo.service.FournisseurService;
import net.krypton.smartimmo.service.SousCategorieService;
import net.krypton.smartimmo.service.TypeOffreService;
import net.krypton.smartimmo.service.VilleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class BienController {

 @Autowired
 BienService bienService;
 
 @Autowired
 AlbumService albumService;
 
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
 

 @RequestMapping("/modifyBien")
 public Bien modifierBien(Bien a){
  return bienService.modifierBien(a);
 }
 
 /*@RequestMapping("/deleteBien")
 public void supprimerBien(int idBien){
  
  bienService.supprimerBien(idBien);
 }
 
 
 @RequestMapping("/viewBien")
 public Bien consulterBien(int idBien)
 {
  return bienService.consulterBien(idBien);
 }*/
 
 
 
 @RequestMapping(value = "/detailsBien-{idBien}", method =RequestMethod.GET)
 public String consulterBien(@PathVariable int idBien, DetailsImgModel im, Model model)
 {
  Bien b =  new Bien();
  b =  consulterBien(idBien);
  im.setDatePubBien(b.getDatePubBien());
  im.setPrixBien(b.getPrixBien());
  im.setQuartierBien(b.getQuartierBien());
  im.setSousCategorie(b.getSouscategorie().getLibelleSousCat());
  im.setTypeOffre(b.getTypeoffre().getLibelleTypeOffre());
  im.setSuperficieBien(b.getSuperficieBien());
  im.setNbrePiece(b.getNbPieceBien());
  im.setDescriptif(b.getDescriptionBien());
  im.setFournisseur(b.getFournisseur().getNomFournisseur());;
  im.setVille(b.getVille().getLibelleVille());
  im.setDispo(b.getDisponibilite().getLibelleDisponibilite());

  List<Album> retourAlbum = new ArrayList<Album>();
  List<Album> albums = albumService.consulterAlbums();
	System.out.println("albums  "+ albums.size());
	  System.out.println("idBien  "+ idBien);
  for (int i=0; i < albums.size(); i++){
   Album A = new Album();
   A = albums.get(i);
   int id = A.getBien().getIdBien();
   System.out.println("id  "+ A.getBien().getIdBien());
   if (id == idBien){ 
		System.out.println("albums  "+ A.getPathAlbum());
    retourAlbum.add(A);
   } 
  }
  im.setRetourAlbum(retourAlbum);
  model.addAttribute("listAlbums", retourAlbum);
  model.addAttribute("listAlbu", retourAlbum);
  model.addAttribute("unBien", im);
  return "details";
 }
 
 //roland modification pour fournisseur 
 
 
 @RequestMapping(value = "/saveBien", method = RequestMethod.POST)
	public String enregistrerBien(@Valid @ModelAttribute("v") FrontPage v,
			BindingResult result, ModelMap model) {

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
			model.addAttribute("edit", true);
			return "formBien";
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

			Fournisseur f = new Fournisseur();
			f = findFournisseurByNom(v.getFournisseur());
			bien.setFournisseur(f);

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

			bienService.modifierBien(bien);

		} catch (Exception e) {

			v.setException(e.getMessage());
		}

		return "profile";
	}

	@RequestMapping(value = "/saveBien", method = RequestMethod.GET)
	public String newBien(ModelMap model) {
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
		model.addAttribute("edit", false);
		return "formBien";
	}

	@RequestMapping(value = "/modifyBien-{idBien}", method = RequestMethod.GET)
	public String editBien(@PathVariable int idBien, ModelMap model) {
		Bien bien = bienService.consulterBien(idBien);
		
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
		model.addAttribute("edit", true);
		return "formBien";
	}

	@RequestMapping(value = "/modifyBien-{idBien}", method = RequestMethod.POST)
	public String modifierBien(@Valid Bien v, BindingResult result,
			ModelMap model, @PathVariable int idBien) {
		bienService.modifierBien(v);
		return "redirect:/viewBiens";
	}

	@RequestMapping(value = "/deleteBien-{idBien}")
	public String supprimerBien(@PathVariable int idBien) {

		try {
			bienService.supprimerBien(idBien);
			return "redirect:/viewBiens";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "redirect:/viewBiens";
		}
	
	}

	@RequestMapping("/viewBien")
	public Bien consulterBien(int idBien) {
		return bienService.consulterBien(idBien);
	}

	@RequestMapping(value = "/viewBiens")
	public String consulterBiens(Map<String, Object> map) {
		map.put("listDisponible",disponibiliteService.consulterDisponibilites());
		map.put("listFournisseur", fournisseurService.consulterFournisseurs());
		map.put("listTypeOffre", typeOffreService.consulterTypeOffres());
		map.put("listVille", villeService.consulterVilles());
		map.put("listSousCategorie",
				sousCategorieService.consulterSousCategories());
		map.put("listDisponibilite",
				disponibiliteService.consulterDisponibilites());
		map.put("listBien", bienService.consulterBiens());
		return "bien";
	}

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
	
	@RequestMapping("/Resultat")
	 public String resultat() {
	  return "bien-list";
	 }
	
	@RequestMapping("/detailBien")
	 public String detailBien(){
	  return "details";
	 }
}