package net.krypton.smartimmo.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.AlbumDao;
import net.krypton.smartimmo.entities.Album;
import net.krypton.smartimmo.service.AlbumService;
@Transactional
public class AlbumServiceImpl implements AlbumService {


	private AlbumDao dao;
	
	
	

	public void setDao(AlbumDao dao) {
		this.dao = dao;
	}

	@Override
	public Album ajouterAlbum(Album a) {
		// TODO Auto-generated method stub
		return dao.ajouterAlbum(a);
	}

	@Override
	public Album modifierAlbum(Album m) {
		// TODO Auto-generated method stub
		return dao.modifierAlbum(m);
	}

	@Override
	public void supprimerAlbum(int idAlbum) {
		// TODO Auto-generated method stub
		dao.supprimerAlbum(idAlbum);
	}

	@Override
	public Album consulterAlbum(int idAlbum) {
		// TODO Auto-generated method stub
		return dao.consulterAlbum(idAlbum);
	}

	@Override
	public List<Album> consulterAlbums() {
		// TODO Auto-generated method stub
		return dao.consulterAlbums();
	}
}
