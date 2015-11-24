package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.Client;

public interface ClientDao {

	public Client ajouterClient(Client a);
	public Client modifierClient(Client m);
	public void supprimerClient (int idClient);
	public Client consulterClient(int idClient);
	public List<Client> consulterClients();
}
