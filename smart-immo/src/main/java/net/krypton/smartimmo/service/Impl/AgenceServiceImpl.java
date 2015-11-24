package net.krypton.smartimmo.service.Impl;

import java.util.List;

import net.krypton.smartimmo.dao.AgenceDao;
import net.krypton.smartimmo.entities.Agence;
import net.krypton.smartimmo.service.AgenceService;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AgenceServiceImpl implements AgenceService {

	private AgenceDao dao;

	public void setDao(AgenceDao dao) {
		this.dao = dao;
	}
	@Override
	public Agence ajouterAgence(Agence a) {
		// TODO Auto-generated method stub
		return dao.ajouterAgence(a);
	}

	@Override
	public Agence modifierAgence(Agence m) {
		// TODO Auto-generated method stub
		return dao.modifierAgence(m);
	}

	@Override
	public void supprimerAgence(int idAgence) {
		// TODO Auto-generated method stub
		dao.supprimerAgence(idAgence);
	}

	@Override
	public Agence consulterAgence(int idAgence) {
		// TODO Auto-generated method stub
		return dao.consulterAgence(idAgence);
	}

	@Override
	public List<Agence> consulterAgences() {
		// TODO Auto-generated method stub
		return dao.consulterAgences();
	}
}
