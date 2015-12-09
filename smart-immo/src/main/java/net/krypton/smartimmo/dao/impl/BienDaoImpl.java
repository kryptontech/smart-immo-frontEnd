package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.krypton.smartimmo.dao.BienDao;
import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.entities.Fournisseur;

public class BienDaoImpl implements BienDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Bien ajouterBien(Bien a) {
		em.persist(a);
		return a;
	}

	@Override
	public Bien modifierBien(Bien m) {
		em.merge(m);
		return m;
	}

	@Override
	public void supprimerBien(int idBien) {
		Bien Bien = em.find(Bien.class, idBien);
		em.remove(Bien);

	}

	@Override
	public Bien consulterBien(int idBien) {

		return em.find(Bien.class, idBien);
	}

	@Override
	public List<Bien> consulterBiens() {
		Query req = em.createQuery("From Bien");

		List<Bien> listBiens = req.getResultList();
		return listBiens;
	}

	@Override
	public List<Bien> consulterBienByFournisseur(Fournisseur f) {
		Query req = em.createQuery("From Bien where id_fournisseur=:f");
		req.setParameter("f", f);
		List<Bien>  Bien = req.getResultList();
		return Bien;
	}

	/*
	 * @Override public List<Bien> consulterBiens() { Query req =
	 * em.createQuery("select a From Bien a"); List<Bien> listBiens =
	 * req.getResultList(); return listBiens; }
	 */

}
