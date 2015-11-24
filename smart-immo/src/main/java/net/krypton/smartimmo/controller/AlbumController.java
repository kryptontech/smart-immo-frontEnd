package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.Album;
import net.krypton.smartimmo.service.AlbumService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller

public class AlbumController {
	
	@Autowired
	AlbumService albumService;

	@RequestMapping("/saveAlbum")
	public Album enregistrerAlbum(Album a){
		return albumService.ajouterAlbum(a);
	}
	
	@RequestMapping("/modifyAlbum")
	public Album modifierAlbum(Album m){
		return albumService.modifierAlbum(m);
	}
	
	@RequestMapping("/deleteAlbum")
	public void supprimerAlbum(int idAlbum){
		
		albumService.supprimerAlbum(idAlbum);
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
	
}
