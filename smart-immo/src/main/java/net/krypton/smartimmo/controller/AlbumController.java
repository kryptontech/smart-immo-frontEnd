package net.krypton.smartimmo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.krypton.smartimmo.entities.Album;
import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.model.AlbumModel;
import net.krypton.smartimmo.service.AlbumService;
import net.krypton.smartimmo.service.BienService;



@Controller
public class AlbumController {
	
	@Autowired
	AlbumService albumService;
	
	@Autowired
	BienService bienService;
	
	@RequestMapping(value = "/secure/viewAlbums-{idAlbum}")
	public String consulterAlbum(@PathVariable int idAlbum,
			Map<String, Object> map) {
		map.put("listBien", bienService.consulterBiens());

		Bien bien = new Bien();

		bien = bienService.consulterBien(Integer.valueOf(idAlbum));

		List<Album> al = new ArrayList<Album>();
		List<Album> als = new ArrayList<Album>();
		als = albumService.consulterAlbums();
		for (int i = 0; i < als.size(); i++) {
			Album Album = new Album();

			Album = als.get(i);

			if (Album.getBien().getIdBien() == (idAlbum)
					&& Album.getBien().getDescriptionBien()
							.equals(bien.getDescriptionBien())) {
				al.add(Album);
			}
		}

		map.put("listAlbum", al);
		return "album";
	}
	
	
	
	

	@RequestMapping(value = "/secure/saveAlbum-{idBien}", method = RequestMethod.GET)
	public ModelAndView enregistrerAlbum(@PathVariable int idBien, ModelMap model){
		
		AlbumModel album = new AlbumModel();
		ModelAndView mav = new ModelAndView("addalbum");

		mav.addObject("idBien", Integer.toString(idBien));
		mav.addObject("formAlbum", album);
		mav.addObject("edit", false);
		return mav;
	}

	
	
	
	
	@RequestMapping(value = "/saveAlbum-{idBien}", method = RequestMethod.POST)
	public String saveAlbum(@Valid AlbumModel am, @PathVariable int idBien, ModelMap model){
		
		Album album = new Album();
		album.setPathAlbum(am.getPathAlbum());
		Bien b = new Bien();
		b = findBienByTitre(am.getBien());
		album.setBien(b);
		
		albumService.modifierAlbum(album);
		model.addAttribute("edit", false);
		model.addAttribute("formAlbum", am);
		return "publier-bien";
	}
	
	
	
	
	
	@RequestMapping(value = "/secure/modifyAlbum-{idAlbum}", method = RequestMethod.GET)
	public String editAlbum(@PathVariable int idAlbum, ModelMap model){
		Album album = albumService.consulterAlbum(idAlbum);
		
		model.addAttribute("listBien", bienService.consulterBiens());
		model.addAttribute("formAlbum", album);
		model.addAttribute("edit", true);
		return "publier-bien";
	}
	
	@RequestMapping(value = "/secure/modifyAlbum-{idAlbum}", method = RequestMethod.POST)
	public String modifierAlbum(@Valid Album a, BindingResult result, ModelMap model, @PathVariable int idAlbum){
		albumService.modifierAlbum(a);
		return "publier-bien";
	}
	
	@RequestMapping(value = "/secure/deleteAlbum-{idAlbum}", method = RequestMethod.GET)
	public String supprimerAlbum(@PathVariable int idAlbum){
		
		albumService.supprimerAlbum(idAlbum);
		return "redirect:/secure/listeBiensFour";
	}
	
	
	
	
	
	@RequestMapping("/viewAlbum")
	public Album consulterAlbum(int idAlbum)
	{
		return albumService.consulterAlbum(idAlbum);
	}
	
	@RequestMapping("/viewAlbums")
	public List<Album> consulterAlbums()
	{
		return albumService.consulterAlbums();
	}
	
	@RequestMapping("/AjouterAlbum")
	 public String ajouterAlbums()
	 {
	  return "addalbum";
	 }
	public Bien findBienByTitre(String titre)
	{
		List<Bien> biens = bienService.consulterBiens();
		Bien bien = new Bien();
		for (int i = 0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			 if (b.getTitreBien().equals(titre))
			 {
				 bien = b;
			 }
		}
		return bien;
	}
}
