package net.krypton.smartimmo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.krypton.smartimmo.entities.Album;
import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.entities.Fournisseur;
import net.krypton.smartimmo.model.FormSearch;
import net.krypton.smartimmo.model.ImageModel;
import net.krypton.smartimmo.service.AlbumService;
import net.krypton.smartimmo.service.BienService;
import net.krypton.smartimmo.service.DisponibiliteService;
import net.krypton.smartimmo.service.FournisseurService;
import net.krypton.smartimmo.service.SousCategorieService;
import net.krypton.smartimmo.service.TypeOffreService;
import net.krypton.smartimmo.service.VilleService;


@Controller
public class HomeController {
	
	final static double PRIX_MAX = 2000000000;
	final static double PRIX_MIN = 0;
	
	@Autowired
	SousCategorieService sousCategorieService;
	
	@Autowired
	BienService bienService;
	
	@Autowired
	FournisseurService fournisseurService;

	@Autowired
	TypeOffreService typeOffreService;

	@Autowired
	VilleService villeService;
	
	 
	@Autowired
	AlbumService AlbumService;
	
	
	@Autowired
	DisponibiliteService disponibiliteService;
	
	// controller pour appeler les bien sur la page accueil
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(ModelMap model, FormSearch fm) {
		
		List<Bien> listbien =new ArrayList<Bien>();
		listbien  = bienService.consulterBiens();
		List<ImageModel> listdto =new ArrayList<ImageModel>(); 
		
		
		int t = listbien.size();
		
		//int y = tS-1;
		
	System.out.println("t  "+ t);	
	
	for(int i=0;i<t; i++){

		
			Bien b = new Bien();
			b = listbien.get(i);
			ImageModel dto = new ImageModel ();

			System.out.println("b  "+ b.getDescriptionBien());
			
			
			List<Album> retourAlbum = new ArrayList<Album>();
			List<Album> albums = AlbumService.consulterAlbums();
			
			System.out.println("albums  "+ albums.size());
			for (int j=0; j < albums.size(); j++){
				Album A = new Album();
				A = albums.get(j);
				int id = A.getBien().getIdBien();
				if (id == b.getIdBien()){ 
					retourAlbum.add(A);
				} 
			}

			dto.setDatePuBien(b.getDatePubBien());
			
			
			dto.setAlbum(albums.get(0).getPathAlbum());
			dto.setSuperfie(b.getSuperficieBien());
			dto.setPrix(b.getPrixBien());
			dto.setIdBien(b.getIdBien());
			dto.setQuartier(b.getQuartierBien());
			
			System.out.println("b  "+ dto.getAlbum());
			listdto.add(dto);
		}
	
	  Bien b = new Bien();
	  fm.setPrixMaxi(PRIX_MAX);
	  fm.setPrixMini(PRIX_MIN);
	  fm.setQuartierBien(b.getQuartierBien());
	  fm.setSousCategorie("");
	  fm.setVille("");
	  model.addAttribute("formSearch", fm);
		
      model.addAttribute("listBiensHome", listdto);
		
      //FIN DU CONTROLLER KI APPELLE LES IMAGE SUR LA PAGE ACCUEIL
       
       //return "form-inscription";
		return "index";
      // return "profile";
	}	
	
	 @RequestMapping("/Apropos")
	 public String profile() {
	  return "about";
	 }
}
