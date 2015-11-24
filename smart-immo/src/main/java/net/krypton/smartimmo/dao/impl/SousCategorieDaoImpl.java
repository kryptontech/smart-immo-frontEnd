package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.SousCategorieDao;
import net.krypton.smartimmo.entities.SousCategorie;



public class SousCategorieDaoImpl implements SousCategorieDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public SousCategorie ajouterSousCategorie (SousCategorie a)
	{
		em.persist(a);
		return a;
	}
	
	@Override
	public SousCategorie modifierSousCategorie(SousCategorie m)
	{
		em.merge(m);
		return m;
	}
	
	@Override
	public void supprimerSousCategorie (int idSousCategorie)
	{
		SousCategorie SousCategorie = em.find(SousCategorie.class, idSousCategorie);
		em.remove(SousCategorie);
		
	}
	
	@Override
	public SousCategorie consulterSousCategorie(int idSousCategorie)
	{
		Query req = em.createQuery("From SousCategorie where idSousCategorie=:idSousCategorie");
		req.setParameter(idSousCategorie, idSousCategorie);
		SousCategorie SousCategories = (SousCategorie) req.getSingleResult();
		return SousCategories;
	}
	
	@Override
	public List<SousCategorie> consulterSousCategories()
	{
		Query req = em.createQuery("select a From SousCategorie a");
		List<SousCategorie> listSousCategories = req.getResultList();
		return listSousCategories;
	}
}
