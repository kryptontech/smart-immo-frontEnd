package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.Album;

public interface AlbumDao {

	public Album ajouterAlbum(Album a);
	public Album modifierAlbum(Album m);
	public void supprimerAlbum (int idAlbum);
	public Album consulterAlbum(int idAlbum);
	public List<Album> consulterAlbums();
}
