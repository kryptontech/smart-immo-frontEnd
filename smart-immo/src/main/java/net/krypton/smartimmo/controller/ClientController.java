package net.krypton.smartimmo.controller;

import java.util.List;

import net.krypton.smartimmo.dao.ClientDao;
import net.krypton.smartimmo.entities.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

	
	@Autowired
	ClientDao clientDao;
	
	@RequestMapping("/saveClient")
	public Client enregistrerClient(Client a){
		return clientDao.ajouterClient(a);
	}
	
	@RequestMapping("/modifyClient")
	public Client modifierClient(Client a){
		return clientDao.modifierClient(a);
	}
	
	@RequestMapping("/deleteClient")
	public void supprimerClient(int idClient){
		
		clientDao.supprimerClient(idClient);
	}
	
	
	@RequestMapping("/viewClient")
	public Client consulterClient(int idClient)
	{
		return clientDao.consulterClient(idClient);
	}
	
	@RequestMapping("/viewClients")
	public List<Client> consulterClients()
	{
		return clientDao.consulterClients();
	}
	
}
