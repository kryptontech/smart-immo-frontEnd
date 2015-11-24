package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.Admin;


public interface AdminDao {

	public Admin ajouterAdmin(Admin a);
	public Admin modifierAdmin(Admin m);
	public void supprimerAdmin (int idAdmin);
	public Admin consulterAdmin(int idAdmin);
	public List<Admin> consulterAdmins();
}
