package net.krypton.smartimmo.controller;

import java.util.ArrayList;
import java.util.List;

import net.krypton.smartimmo.entities.Album;
import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.model.DetailsImgModel;
import net.krypton.smartimmo.service.AlbumService;
import net.krypton.smartimmo.service.BienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class BienController {

 @Autowired
 BienService bienService;
 
 @Autowired
 AlbumService albumService;
 
 @RequestMapping("/saveBien")
 public Bien enregistrerBien(Bien a){
  return bienService.ajouterBien(a);
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
}