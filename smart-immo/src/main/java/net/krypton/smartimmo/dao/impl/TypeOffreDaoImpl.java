package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.TypeOffreDao;
import net.krypton.smartimmo.entities.TypeOffre;



public class TypeOffreDaoImpl implements TypeOffreDao{
	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public TypeOffre ajouterTypeOffre (TypeOffre a)
	{
		em.persist(a);
		return a;
	}
	
	@Override
	public TypeOffre modifierTypeOffre(TypeOffre m)
	{
		em.merge(m);
		return m;
	}
	
	@Override
	public void supprimerTypeOffre (int idTypeOffre)
	{
		TypeOffre TypeOffre = em.find(TypeOffre.class, idTypeOffre);
		em.remove(TypeOffre);
		
	}
	
	@Override
	public TypeOffre consulterTypeOffre(int idTypeOffre)
	{
		Query req = em.createQuery("From TypeOffre where idTypeOffre=:idTypeOffre");
		req.setParameter(idTypeOffre, idTypeOffre);
		TypeOffre TypeOffres = (TypeOffre) req.getSingleResult();
		return TypeOffres;
	}
	
	@Override
	public List<TypeOffre> consulterTypeOffres()
	{
		Query req = em.createQuery(" From TypeOffre ");
		List<TypeOffre> listTypeOffres = req.getResultList();
		return listTypeOffres;
	}
}
