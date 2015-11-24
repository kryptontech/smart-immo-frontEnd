package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.krypton.smartimmo.dao.DisponibiliteDao;
import net.krypton.smartimmo.entities.Disponibilite;

import org.springframework.transaction.annotation.Transactional;


public class DisponibiliteDaoImpl implements DisponibiliteDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Disponibilite ajouterDisponibilite (Disponibilite a)
	{
		em.persist(a);
		return a;
	}
	
	@Override
	public Disponibilite modifierDisponibilite(Disponibilite m)
	{
		em.merge(m);
		return m;
	}
	
	@Override
	public void supprimerDisponibilite (int idDisponibilite)
	{
		Disponibilite Disponibilite = em.find(Disponibilite.class, idDisponibilite);
		em.remove(Disponibilite);
		
	}
	
	@Override
	public Disponibilite consulterDisponibilite(int idDisponibilite)
	{
		Query req = em.createQuery("From Disponibilite where idDisponibilite=:idDisponibilite");
		req.setParameter(idDisponibilite, idDisponibilite);
		Disponibilite Disponibilites = (Disponibilite) req.getSingleResult();
		return Disponibilites;
	}
	
	@Override
	public List<Disponibilite> consulterDisponibilites()
	{
		Query req = em.createQuery("select a From Disponibilite a");
		List<Disponibilite> listDisponibilites = req.getResultList();
		return listDisponibilites;
	}
}
