package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.entities.User;
import net.krypton.smartimmo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
	
	@Autowired
	UserService userService;

	
	@RequestMapping("/saveUser")
	public User enregistrerUser(User a){
		return userService.ajouterUser(a);
	}
	
	@RequestMapping("/modifyUser")
	public User modifierUser(User a){
		return userService.modifierUser(a);
	}
	
	@RequestMapping("/deleteUser")
	public void supprimerUser(int idUser){
		
		userService.supprimerUser(idUser);
	}
	
	
	@RequestMapping("/viewUser")
	public User consulterUser(int idUser)
	{
		return userService.consulterUser(idUser);
	}
	
	@RequestMapping("/viewUsers")
	public List<User> consulterUsers()
	{
		return userService.consulterUsers();
	}
	
}
