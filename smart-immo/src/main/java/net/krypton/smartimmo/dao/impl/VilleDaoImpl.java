package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.VilleDao;
import net.krypton.smartimmo.entities.Ville;

public class VilleDaoImpl implements VilleDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Ville ajouterVille(Ville a) {
		em.persist(a);
		return a;
	}

	@Override
	public Ville modifierVille(Ville m) {
		em.merge(m);
		return m;
	}

	@Override
	public void supprimerVille(int idVille) {
		Ville Ville = em.find(Ville.class, idVille);
		em.remove(Ville);

	}

	@Override
	public Ville consulterVille(int idVille) {
		Query req = em.createQuery("From Ville where idVille=:idVille");
		req.setParameter(idVille, idVille);
		Ville Villes = (Ville) req.getSingleResult();
		return Villes;
	}

	@Override
	public List<Ville> consulterVilles() {
		Query req = em.createQuery("From Ville ");
		List<Ville> listVilles = req.getResultList();
		return listVilles;
	}
}
