package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.krypton.smartimmo.dao.FournisseurDao;
import net.krypton.smartimmo.entities.Fournisseur;


public class FournisseurDaoImpl implements FournisseurDao{
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Fournisseur ajouterFournisseur (Fournisseur a)
	{
		em.persist(a);
		return a;
	}
	
	@Override
	public Fournisseur modifierFournisseur(Fournisseur m)
	{
		em.merge(m);
		return m;
	}
	
	@Override
	public void supprimerFournisseur (int idFournisseur)
	{
		Fournisseur Fournisseur = em.find(Fournisseur.class, idFournisseur);
		em.remove(Fournisseur);
		
	}
	
	@Override
	public Fournisseur consulterFournisseur(int idFournisseur)
	{
		Query req = em.createQuery("From Fournisseur where idFournisseur=?1");
		req.setParameter(1, idFournisseur);
		Fournisseur Fournisseurs = (Fournisseur) req.getSingleResult();
		return Fournisseurs;
	}
	
	@Override
	public List<Fournisseur> consulterFournisseurs()
	{
		Query req = em.createQuery("select a From Fournisseur a");
		List<Fournisseur> listFournisseurs = req.getResultList();
		return listFournisseurs;
	}
}
