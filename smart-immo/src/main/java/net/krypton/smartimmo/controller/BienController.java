package net.krypton.smartimmo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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


@Controller

public class BienController {

	
	
	

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
	 BienService bienService;
	 
	 @Autowired
	 AlbumService albumService;
	 
	 
  // AJOUTER UN BIEN PAR FURNISSEUR
	 
 @RequestMapping(value = "/saveBien-{idFour}", method = RequestMethod.GET)
 public String formBien(@PathVariable int idFour, Model model){
	 
	 Bien b = new Bien();
	 FrontPage v = new FrontPage();
	 v.setDescriptionBien(b.getDescriptionBien());
	 v.setNbPieceBien(b.getNbPieceBien());
	 v.setPrixBien(b.getPrixBien());
	 v.setQuartierBien(b.getQuartierBien());
	 v.setSuperficieBien(b.getSuperficieBien());
	 v.setTitreBien(b.getTitreBien());
	 
	 Fournisseur f = new Fournisseur();
	 f = findFournisseurById(idFour);
	 v.setFournisseur(f.getIdFournisseur());
	 
	 model.addAttribute("listVille", villeService.consulterVilles());
	 model.addAttribute("listTypeOffre", typeOffreService.consulterTypeOffres());
	 model.addAttribute("listSousCategorie", sousCategorieService.consulterSousCategories());
	 model.addAttribute("listDisponibilite", disponibiliteService.consulterDisponibilites());
	 model.addAttribute("idFour", idFour);
	 model.addAttribute("statuBien", v.isStatutBien());
	 model.addAttribute("maDate", v.getDatePubBien());
	 model.addAttribute("edit", false);
	 model.addAttribute("frontPage", v);
	 
	 return "publier-bien"; 
	 
 }
 
 
 @RequestMapping(value = "/saveBien-{idFour}", method = RequestMethod.POST)
 public String enregistrerBien(@Valid FrontPage v,
			BindingResult result, ModelMap model, @PathVariable String idFour){
	 
	 Bien b = new Bien();
	 b.setDatePubBien(v.getDatePubBien());
	 b.setDescriptionBien(v.getDescriptionBien());
	 b.setDisponibilite(findDisponibiliteByLibelle(v.getDisponibilite()));
	 b.setFournisseur(findFournisseurById(v.getFournisseur()));
	 b.setNbPieceBien(v.getNbPieceBien());
	 b.setPrixBien(v.getPrixBien());
	 b.setQuartierBien(v.getQuartierBien());
	 b.setSouscategorie(findSousCategorieByLibelle(v.getSouscategorie()));
	 b.setStatutBien(v.isStatutBien());
	 b.setSuperficieBien(v.getSuperficieBien());
	 b.setTitreBien(v.getTitreBien());
	 b.setTypeoffre(findTypeOffreByLibelle(v.getTypeoffre()));
	 b.setVille(findVilleByName(v.getVille()));
	 
	 bienService.modifierBien(b);
	 
	 model.addAttribute("listVille", villeService.consulterVilles());
	 model.addAttribute("listTypeOffre", typeOffreService.consulterTypeOffres());
	 model.addAttribute("listSousCategorie", sousCategorieService.consulterSousCategories());
	 model.addAttribute("listDisponibilite", disponibiliteService.consulterDisponibilites());
	 model.addAttribute("idFour", idFour);
	 model.addAttribute("statuBien", v.isStatutBien());
	 model.addAttribute("maDate", v.getDatePubBien());
	 model.addAttribute("idBien", v.getIdBien());
	 model.addAttribute("edit", false);
	 model.addAttribute("frontPage", v);
	 
	 return "listebiensfournisseur";
 }
 
 
 @RequestMapping(value = "/modifyBien-{idBien}", method = RequestMethod.GET)
 public String modifyBien(@PathVariable int idBien, Model model){
	 
	 Bien b = new Bien();
	 b = bienService.consulterBien(idBien);
	 FrontPage v = new FrontPage();
	 v.setDescriptionBien(b.getDescriptionBien());
	 v.setNbPieceBien(b.getNbPieceBien());
	 v.setPrixBien(b.getPrixBien());
	 v.setQuartierBien(b.getQuartierBien());
	 v.setSuperficieBien(b.getSuperficieBien());
	 v.setTitreBien(b.getTitreBien());
	 
	
	 v.setFournisseur(b.getFournisseur().getIdFournisseur());
	 
	 model.addAttribute("listVille", villeService.consulterVilles());
	 model.addAttribute("listTypeOffre", typeOffreService.consulterTypeOffres());
	 model.addAttribute("listSousCategorie", sousCategorieService.consulterSousCategories());
	 model.addAttribute("listDisponibilite", disponibiliteService.consulterDisponibilites());
	 model.addAttribute("idFour",  v.getFournisseur());
	 model.addAttribute("statuBien", v.isStatutBien());
	 model.addAttribute("maDate", v.getDatePubBien());
	 model.addAttribute("edit", true);
	 model.addAttribute("frontPage", v);
	 
	 return "publier-bien"; 
	 
 }
 
 @RequestMapping(value = "/modifyBien-{idFour}", method = RequestMethod.POST)
 public String modifyBien(@Valid FrontPage v,
			BindingResult result, ModelMap model, @PathVariable String idFour){
	 
	 Bien b = new Bien();
	 b.setDatePubBien(v.getDatePubBien());
	 b.setDescriptionBien(v.getDescriptionBien());
	 b.setDisponibilite(findDisponibiliteByLibelle(v.getDisponibilite()));
	 b.setFournisseur(findFournisseurById(v.getFournisseur()));
	 b.setNbPieceBien(v.getNbPieceBien());
	 b.setPrixBien(v.getPrixBien());
	 b.setQuartierBien(v.getQuartierBien());
	 b.setSouscategorie(findSousCategorieByLibelle(v.getSouscategorie()));
	 b.setStatutBien(v.isStatutBien());
	 b.setSuperficieBien(v.getSuperficieBien());
	 b.setTitreBien(v.getTitreBien());
	 b.setTypeoffre(findTypeOffreByLibelle(v.getTypeoffre()));
	 b.setVille(findVilleByName(v.getVille()));
	 
	 bienService.modifierBien(b);
	 
	 model.addAttribute("listVille", villeService.consulterVilles());
	 model.addAttribute("listTypeOffre", typeOffreService.consulterTypeOffres());
	 model.addAttribute("listSousCategorie", sousCategorieService.consulterSousCategories());
	 model.addAttribute("listDisponibilite", disponibiliteService.consulterDisponibilites());
	 model.addAttribute("idFour", idFour);
	 model.addAttribute("statuBien", v.isStatutBien());
	 model.addAttribute("maDate", v.getDatePubBien());
	 model.addAttribute("idBien", v.getIdBien());
	 model.addAttribute("edit", true);
	 model.addAttribute("frontPage", v);
	 
	 return "listebiensfournisseur";
 }
 
 
 
 @RequestMapping("/modifyBien")
 public Bien modifierBien(Bien a){
  return bienService.modifierBien(a);
 }
 
 @RequestMapping("/deleteBien-{idBien}")
 public String supprimerBien(@PathVariable int idBien) {

		try {
			bienService.supprimerBien(idBien);
			return "listebiensfournisseur";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "listebiensfournisseur";
		}
 }
 
 @RequestMapping("/viewBien")
 public Bien consulterBien(int idBien)
 {
  return bienService.consulterBien(idBien);
 }
 
 @RequestMapping("/viewBiens")
 public List<Bien> consulterBiens()
 {
  return bienService.consulterBiens();
 }
 
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
 
 
 //AFFICHAGE DE LA LISTE DES BIENS D'UN FOURNISSEUR
 @RequestMapping(value = "/listeBiensFour-{idFour}", method =RequestMethod.GET)
 public String listeBiensFournissseur(@PathVariable int idFour, Model model){
	 
	 List<Bien> listeBiens = new ArrayList<Bien>();
	 List<Bien> biens = new ArrayList<Bien>();
	 biens = bienService.consulterBiens();
	 for (int i = 0; i < biens.size(); i++){
		 Bien bien = new Bien();
		 bien = biens.get(i);
		 int id = bien.getFournisseur().getIdFournisseur();
		 if (id == idFour){
			 listeBiens.add(bien);
		 }
	 }
	 
	 model.addAttribute("listBiens", listeBiens);
	 return "listebiensfournisseur";
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

	public Fournisseur findFournisseurById(int idFour) {
		  List<Fournisseur> Fournisseurs = fournisseurService
		    .consulterFournisseurs();
		  Fournisseur Fournisseur = new Fournisseur();
		  for (int i = 0; i < Fournisseurs.size(); i++) {
		   Fournisseur F = new Fournisseur();
		   F = Fournisseurs.get(i);

		   if (F.getIdFournisseur()==Integer.valueOf(idFour)) {
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

 }
 
 
