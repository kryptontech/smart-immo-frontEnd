package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.krypton.smartimmo.dao.AgenceDao;
import net.krypton.smartimmo.entities.Agence;

import org.springframework.transaction.annotation.Transactional;


public class AgenceDaoImpl implements AgenceDao{
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Agence ajouterAgence (Agence a)
	{
		em.persist(a);
		return a;
	}
	
	@Override
	public Agence modifierAgence(Agence m)
	{
		em.merge(m);
		return m;
	}
	
	@Override
	public void supprimerAgence (int idAgence)
	{
		Agence Agence = em.find(Agence.class, idAgence);
		em.remove(Agence);
		
	}
	
	@Override
	public Agence consulterAgence(int idAgence)
	{
		Query req = em.createQuery("From Agence where idAgence=:idAgence");
		req.setParameter(idAgence, idAgence);
		Agence Agences = (Agence) req.getSingleResult();
		return Agences;
	}
	
	@Override
	public List<Agence> consulterAgences()
	{
		Query req = em.createQuery("From Agence ");
		List<Agence> listAgences = req.getResultList();
		return listAgences;
	}
}

