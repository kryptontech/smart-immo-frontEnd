package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.krypton.smartimmo.dao.UserDao;
import net.krypton.smartimmo.entities.User;

import org.springframework.transaction.annotation.Transactional;


public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public User ajouterUser(User a) {
		em.persist(a);
		return a;
	}

	@Override
	public User modifierUser(User m)
	{
		em.merge(m);
		return m;
	}
	
	@Override
	public void supprimerUser (int idUser)
	{
		User User = em.find(User.class, idUser);
		em.remove(User);
		
	}
	
	@Override
	public User consulterUser(int idUser)
	{
		Query req = em.createQuery("From User where idUser=:idUser");
		req.setParameter(idUser, idUser);
		User Users = (User) req.getSingleResult();
		return Users;
	}
	
	@Override
	public List<User> consulterUsers()
	{
		Query req = em.createQuery("select a From User a");
		List<User> listUsers = req.getResultList();
		return listUsers;
	}
}
