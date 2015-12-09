package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.krypton.smartimmo.dao.CategorieDao;
import net.krypton.smartimmo.entities.Categorie;

import org.springframework.transaction.annotation.Transactional;


public class CategorieDaoImpl implements CategorieDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Categorie ajouterCategorie (Categorie a)
	{
		em.persist(a);
		return a;
	}
	
	@Override
	public Categorie modifierCategorie(Categorie m)
	{
		em.merge(m);
		return m;
	}
	
	@Override
	public void supprimerCategorie (int idCategorie)
	{
		Categorie Categorie = em.find(Categorie.class, idCategorie);
		em.remove(Categorie);
		
	}
	
	@Override
	public Categorie consulterCategorie(int idCategorie)
	{
		Query req = em.createQuery("From Categorie where idCategorie=:idCategorie");
		req.setParameter(idCategorie, idCategorie);
		Categorie Categories = (Categorie) req.getSingleResult();
		return Categories;
	}
	
	@Override
	public List<Categorie> consulterCategories()
	{
		Query req = em.createQuery("From Categorie");
		List<Categorie> listCategories = req.getResultList();
		return listCategories;
	}
}
