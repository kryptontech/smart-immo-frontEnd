package net.krypton.smartimmo.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.SousCategorieDao;
import net.krypton.smartimmo.entities.SousCategorie;
import net.krypton.smartimmo.service.SousCategorieService;

@Transactional
public class SousCategorieServiceImpl implements SousCategorieService {


	private SousCategorieDao dao;
	
	
	

	public void setDao(SousCategorieDao dao) {
		this.dao = dao;
	}

	@Override
	public SousCategorie ajouterSousCategorie(SousCategorie a) {
		// TODO Auto-generated method stub
		return dao.ajouterSousCategorie(a);
	}

	@Override
	public SousCategorie modifierSousCategorie(SousCategorie m) {
		// TODO Auto-generated method stub
		return dao.modifierSousCategorie(m);
	}

	@Override
	public void supprimerSousCategorie(int idSousCategorie) {
		// TODO Auto-generated method stub
		dao.supprimerSousCategorie(idSousCategorie);
	}

	@Override
	public SousCategorie consulterSousCategorie(int idSousCategorie) {
		// TODO Auto-generated method stub
		return dao.consulterSousCategorie(idSousCategorie);
	}

	@Override
	public List<SousCategorie> consulterSousCategories() {
		// TODO Auto-generated method stub
		return dao.consulterSousCategories();
	}

}
