package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.RegionDao;
import net.krypton.smartimmo.entities.Region;


public class RegionDaoImpl implements RegionDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Region ajouterRegion (Region a)
	{
		em.persist(a);
		return a;
	}
	
	@Override
	public Region modifierRegion(Region m)
	{
		em.merge(m);
		return m;
	}
	
	@Override
	public void supprimerRegion (int idRegion)
	{
		Region Region = em.find(Region.class, idRegion);
		em.remove(Region);
		
	}
	
	@Override
	public Region consulterRegion(int idRegion)
	{
		Query req = em.createQuery("From Region where idRegion=:idRegion");
		req.setParameter(idRegion, idRegion);
		Region Regions = (Region) req.getSingleResult();
		return Regions;
	}
	
	@Override
	public List<Region> consulterRegions()
	{
		Query req = em.createQuery("select a From Region a");
		List<Region> listRegions = req.getResultList();
		return listRegions;
	}
}
