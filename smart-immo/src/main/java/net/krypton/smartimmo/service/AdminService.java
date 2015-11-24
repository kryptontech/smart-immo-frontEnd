package net.krypton.smartimmo.service;

import java.util.List;

import net.krypton.smartimmo.entities.Admin;


public interface AdminService {

	public Admin ajouterAdmin(Admin a);
	public Admin modifierAdmin(Admin m);
	public void supprimerAdmin (int idAdmin);
	public Admin consulterAdmin(int idAdmin);
	public List<Admin> consulterAdmins();
}
