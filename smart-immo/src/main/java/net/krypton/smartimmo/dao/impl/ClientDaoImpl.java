package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.krypton.smartimmo.dao.ClientDao;
import net.krypton.smartimmo.entities.Client;

import org.springframework.transaction.annotation.Transactional;


public class ClientDaoImpl implements ClientDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Client ajouterClient (Client a)
	{
		em.persist(a);
		return a;
	}
	
	@Override
	public Client modifierClient(Client m)
	{
		em.merge(m);
		return m;
	}
	
	@Override
	public void supprimerClient (int idClient)
	{
		Client Client = em.find(Client.class, idClient);
		em.remove(Client);
		
	}
	
	@Override
	public Client consulterClient(int idClient)
	{
		Query req = em.createQuery("From Client where idClient=:idClient");
		req.setParameter(idClient, idClient);
		Client Clients = (Client) req.getSingleResult();
		return Clients;
	}
	
	@Override
	public List<Client> consulterClients()
	{
		Query req = em.createQuery("select a From Client a");
		List<Client> listClients = req.getResultList();
		return listClients;
	}
}
