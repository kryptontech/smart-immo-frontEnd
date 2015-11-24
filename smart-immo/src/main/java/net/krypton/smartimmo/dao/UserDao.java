package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.User;

public interface UserDao {

	public User ajouterUser(User a);
	public User modifierUser(User m);
	public void supprimerUser (int idUser);
	public User consulterUser(int idUser);
	public List<User> consulterUsers();
}
