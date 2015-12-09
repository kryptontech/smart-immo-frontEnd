package net.krypton.smartimmo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.AlbumDao;
import net.krypton.smartimmo.entities.Album;


public class AlbumDaoImpl implements AlbumDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Album ajouterAlbum (Album a)
	{
		em.persist(a);
		return a;
	}
	
	@Override
	public Album modifierAlbum(Album m)
	{
		em.merge(m);
		return m;
	}
	
	@Override
	public void supprimerAlbum (int idAlbum)
	{
		Album Album = em.find(Album.class, idAlbum);
		em.remove(Album);
		
	}
	
	@Override
	public Album consulterAlbum(int idAlbum)
	{
		Query req = em.createQuery("From Album where idAlbum=:idAlbum");
		req.setParameter(idAlbum, idAlbum);
		Album Albums = (Album) req.getSingleResult();
		return Albums;
	}
	
	@Override
	public List<Album> consulterAlbums()
	{
		Query req = em.createQuery("From Album ");
		List<Album> listAlbums = req.getResultList();
		return listAlbums;
	}
}
