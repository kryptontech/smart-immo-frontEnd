package net.krypton.smartimmo.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.CategorieDao;
import net.krypton.smartimmo.entities.Categorie;
import net.krypton.smartimmo.service.CategorieService;

@Transactional
public class CategorieServiceImpl implements CategorieService {

	private CategorieDao dao;
	
	
	

	public void setDao(CategorieDao dao) {
		this.dao = dao;
	}

	@Override
	public Categorie ajouterCategorie(Categorie a) {
		// TODO Auto-generated method stub
		return dao.ajouterCategorie(a);
	}

	@Override
	public Categorie modifierCategorie(Categorie m) {
		// TODO Auto-generated method stub
		return dao.modifierCategorie(m);
	}

	@Override
	public void supprimerCategorie(int idCategorie) {
		// TODO Auto-generated method stub
		dao.supprimerCategorie(idCategorie);
	}

	@Override
	public Categorie consulterCategorie(int idCategorie) {
		// TODO Auto-generated method stub
		return dao.consulterCategorie(idCategorie);
	}

	@Override
	public List<Categorie> consulterCategories() {
		// TODO Auto-generated method stub
		return dao.consulterCategories();
	}

}
