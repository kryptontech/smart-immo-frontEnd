package net.krypton.smartimmo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
 public String enregistrerBien(@PathVariable int idFour, Model model){
	 Bien b = new Bien();
	 
	 model.addAttribute("listDisponible",
				disponibiliteService.consulterDisponibilites());	
 
		
		model.addAttribute("listTypeOffre",
				typeOffreService.consulterTypeOffres());
		model.addAttribute("listVille", villeService.consulterVilles());
		model.addAttribute("listSousCategorie",
				sousCategorieService.consulterSousCategories());
		model.addAttribute("listDisponibilite",
				disponibiliteService.consulterDisponibilites());
		model.addAttribute("formBien", b);
		
		
		
		
		
		/*model.addAttribute("idFour",
				idFour);
		model.addAttribute("date",
				f.getDatePubBien());
		model.addAttribute("statu",
				f.isStatutBien());
		model.addAttribute("formBien", b);
		model.addAttribute("edit", false);
	 */
  return "publier-bien";
 }
 
 
 @RequestMapping(value = "/saveBien-{idFour}", method = RequestMethod.POST)
 public String enregistrerBien(@Valid FrontPage v,
			BindingResult result, ModelMap model, @PathVariable String idFour){

		
	
			Bien bien = new Bien();
			
			bien.setDescriptionBien(v.getDescriptionBien());
			bien.setNbPieceBien(v.getNbPieceBien());
			bien.setPrixBien(v.getPrixBien());
			bien.setQuartierBien(v.getQuartierBien());
			bien.setStatutBien(v.isStatutBien());
			bien.setSuperficieBien(v.getSuperficieBien());
			bien.setTitreBien(v.getTitreBien());
			
			
			
			Fournisseur f = new Fournisseur();
			f = findFournisseurById(v.getIdFour());
			bien.setFournisseur(f);
			                    
			 System.out.println(v.getFournisseur());
			 System.out.println(v.getFournisseur());
			 
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
			model.addAttribute("formBien", v);
			bienService.ajouterBien(bien);

		
		return "publier-bien";
	}
 
 
 @RequestMapping("/modifyBien")
 public Bien modifierBien(Bien a){
  return bienService.modifierBien(a);
 }
 
 @RequestMapping("/deleteBien")
 public void supprimerBien(int idBien){
  
  bienService.supprimerBien(idBien);
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

	public Fournisseur findFournisseurById(String id) {
		  List<Fournisseur> Fournisseurs = fournisseurService
		    .consulterFournisseurs();
		  Fournisseur Fournisseur = new Fournisseur();
		  for (int i = 0; i < Fournisseurs.size(); i++) {
		   Fournisseur F = new Fournisseur();
		   F = Fournisseurs.get(i);

		   if (F.getIdFournisseur()==Integer.valueOf(id)) {
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
 
 
