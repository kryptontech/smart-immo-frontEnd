package net.krypton.smartimmo.service;

import java.util.List;

import net.krypton.smartimmo.entities.Client;

public interface ClientService {

	public Client ajouterClient(Client a);
	public Client modifierClient(Client m);
	public void supprimerClient (int idClient);
	public Client consulterClient(int idClient);
	public List<Client> consulterClients();
}
