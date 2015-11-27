package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.krypton.smartimmo.dao.CommuneDao;
import net.krypton.smartimmo.entities.Commune;


class CommuneDaoImpl implements CommuneDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Commune ajouterCommune(Commune a) {
		em.persist(a);
		return a;
	}

	@Override
	public Commune modifierCommune(Commune m) {
		em.merge(m);
		return m;
	}

	@Override
	public void supprimerCommune(int idCommune) {
		Commune Commune = em.find(Commune.class, idCommune);
		em.remove(Commune);

	}

	@Override
	public Commune consulterCommune(int idCommune) {
		Query req = em.createQuery("From Commune where idCommune=:idCommune");
		req.setParameter(idCommune, idCommune);
		Commune Communes = (Commune) req.getSingleResult();
		return Communes;
	}

	@Override
	public List<Commune> consulterCommunes() {
		Query req = em.createQuery("select a From Commune a");
		List<Commune> listCommunes = req.getResultList();
		return listCommunes;
	}
}
