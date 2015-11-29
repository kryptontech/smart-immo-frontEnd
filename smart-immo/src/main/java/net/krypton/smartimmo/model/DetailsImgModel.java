package net.krypton.smartimmo.model;

import java.util.Date;
import java.util.List;

import net.krypton.smartimmo.entities.Album;

public class DetailsImgModel {
 
 private int idBien;
 private Date datePubBien;
 private String sousCategorie;
 private String quartierBien;
 private Double prixBien;
 private Double superficieBien;
 private String descriptif;
 private String TypeOffre;
 private String fournisseur;
 private String ville;
 private int nbrePiece;
 private String dispo;
 List<Album> retourAlbum;
 
 public List<Album> getRetourAlbum() {
  return retourAlbum;
 }
 public void setRetourAlbum(List<Album> retourAlbum) {
  this.retourAlbum = retourAlbum;
 }
 public String getDescriptif() {
  return descriptif;
 }
 public void setDescriptif(String descriptif) {
  this.descriptif = descriptif;
 }
 public int getIdBien() {
  return idBien;
 }
 public void setIdBien(int idBien) {
  this.idBien = idBien;
 }
 public Date getDatePubBien() {
  return datePubBien;
 }
 public void setDatePubBien(Date datePubBien) {
  this.datePubBien = datePubBien;
 }
 public String getSousCategorie() {
  return sousCategorie;
 }
 public void setSousCategorie(String sousCategorie) {
  this.sousCategorie = sousCategorie;
 }
 public String getQuartierBien() {
  return quartierBien;
 }
 public void setQuartierBien(String quartierBien) {
  this.quartierBien = quartierBien;
 }
 public Double getPrixBien() {
  return prixBien;
 }
 public void setPrixBien(Double prixBien) {
  this.prixBien = prixBien;
 }
 public Double getSuperficieBien() {
  return superficieBien;
 }
 public void setSuperficieBien(Double superficieBien) {
  this.superficieBien = superficieBien;
 }
 public String getTypeOffre() {
  return TypeOffre;
 }
 public void setTypeOffre(String typeOffre) {
  TypeOffre = typeOffre;
 }
 
 public String getFournisseur() {
  return fournisseur;
 }
 public void setFournisseur(String fournisseur) {
  this.fournisseur = fournisseur;
 }
 public String getVille() {
  return ville;
 }
 public void setVille(String ville) {
  this.ville = ville;
 }
 public int getNbrePiece() {
  return nbrePiece;
 }
 public void setNbrePiece(int nbrePiece) {
  this.nbrePiece = nbrePiece;
 }
 public String getDispo() {
  return dispo;
 }
 public void setDispo(String dispo) {
  this.dispo = dispo;
 }
 public DetailsImgModel() {
  super();
  // TODO Auto-generated constructor stub
 }
 
 
 
}