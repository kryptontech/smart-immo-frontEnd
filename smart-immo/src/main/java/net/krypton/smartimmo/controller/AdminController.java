package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.Admin;
import net.krypton.smartimmo.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/saveAdmin")
	public Admin enregistrerAdmin(Admin a){
		return adminService.ajouterAdmin(a);
	}
	
	@RequestMapping("/modifyAdmin")
	public Admin modifierAdmin(Admin a){
		return adminService.modifierAdmin(a);
	}
	
	@RequestMapping("/deleteAdmin")
	public void supprimerAdmin(int idAdmin){
		
		adminService.supprimerAdmin(idAdmin);
	}
	
	
	@RequestMapping("/viewAdmin")
	public Admin consulterAdmin(int idAdmin)
	{
		return adminService.consulterAdmin(idAdmin);
	}
	
	@RequestMapping("/viewAdmins")
	public List<Admin> consulterAdmins()
	{
		return adminService.consulterAdmins();
	}
}
