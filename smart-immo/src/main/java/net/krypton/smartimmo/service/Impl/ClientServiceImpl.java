package net.krypton.smartimmo.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.ClientDao;
import net.krypton.smartimmo.entities.Client;
import net.krypton.smartimmo.service.ClientService;
@Transactional
public class ClientServiceImpl implements ClientService {


	private ClientDao dao;
	
	

	public void setDao(ClientDao dao) {
		this.dao = dao;
	}

	@Override
	public Client ajouterClient(Client a) {
		// TODO Auto-generated method stub
		return dao.ajouterClient(a);
	}

	@Override
	public Client modifierClient(Client m) {
		// TODO Auto-generated method stub
		return dao.modifierClient(m);
	}

	@Override
	public void supprimerClient(int idClient) {
		// TODO Auto-generated method stub
		dao.supprimerClient(idClient);
	}

	@Override
	public Client consulterClient(int idClient) {
		// TODO Auto-generated method stub
		return dao.consulterClient(idClient);
	}

	@Override
	public List<Client> consulterClients() {
		// TODO Auto-generated method stub
		return dao.consulterClients();
	}
}
