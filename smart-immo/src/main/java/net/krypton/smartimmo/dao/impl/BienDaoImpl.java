package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.BienDao;
import net.krypton.smartimmo.entities.Bien;


public class BienDaoImpl implements BienDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Bien ajouterBien (Bien a)
	{
		em.persist(a);
		return a;
	}
	
	@Override
	public Bien modifierBien(Bien m)
	{
		em.merge(m);
		return m;
	}
	
	@Override
	public void supprimerBien (int idBien)
	{
		Bien Bien = em.find(Bien.class, idBien);
		em.remove(Bien);
		
	}
	
	@Override
	public Bien consulterBien(int idBien)
	{
		Query req = em.createQuery("From Bien where idBien=:idBien");
		req.setParameter(idBien, idBien);
		Bien Biens = (Bien) req.getSingleResult();
		return Biens;
	}
	
	@Override
	public List<Bien> consulterBiens()
	{
		Query req = em.createQuery("select a From Bien a");
		List<Bien> listBiens = req.getResultList();
		return listBiens;
	}
}
