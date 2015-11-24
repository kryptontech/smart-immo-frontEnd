package net.krypton.smartimmo.service;

import java.util.List;

import net.krypton.smartimmo.entities.User;

public interface UserService {

	public User ajouterUser(User a);
	public User modifierUser(User m);
	public void supprimerUser (int idUser);
	public User consulterUser(int idUser);
	public List<User> consulterUsers();
}
