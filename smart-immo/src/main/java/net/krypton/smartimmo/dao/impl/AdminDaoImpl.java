package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.krypton.smartimmo.dao.AdminDao;
import net.krypton.smartimmo.entities.Admin;


public class AdminDaoImpl implements AdminDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Admin ajouterAdmin (Admin a)
	{
		em.persist(a);
		return a;
	}
	
	@Override
	public Admin modifierAdmin(Admin m)
	{
		em.merge(m);
		return m;
	}
	
	@Override
	public void supprimerAdmin (int idAdmin)
	{
		Admin admin = em.find(Admin.class, idAdmin);
		em.remove(admin);
		
	}
	
	@Override
	public Admin consulterAdmin(int idAdmin)
	{
		Query req = em.createQuery("From Admin where idAdmin= ?1");
		req.setParameter(1, idAdmin);
		Admin admins = (Admin) req.getSingleResult();
		return admins;
	}
	
	@Override
	public List<Admin> consulterAdmins()
	{
		Query req = em.createQuery(" From Admin ");
		List<Admin> listAdmins = req.getResultList();
		return listAdmins;
	}
}
