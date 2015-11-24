package net.krypton.smartimmo.service.Impl;

import java.util.List;

import net.krypton.smartimmo.dao.CommuneDao;
import net.krypton.smartimmo.entities.Commune;
import net.krypton.smartimmo.service.CommuneService;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CommuneServiceImpl implements CommuneService {

	private CommuneDao dao;
	
	
	

	public void setDao(CommuneDao dao) {
		this.dao = dao;
	}

	@Override
	public Commune ajouterCommune(Commune a) {
		// TODO Auto-generated method stub
		return dao.ajouterCommune(a);
	}

	@Override
	public Commune modifierCommune(Commune m) {
		// TODO Auto-generated method stub
		return dao.modifierCommune(m);
	}

	@Override
	public void supprimerCommune(int idCommune) {
		// TODO Auto-generated method stub
		dao.supprimerCommune(idCommune);
	}

	@Override
	public Commune consulterCommune(int idCommune) {
		// TODO Auto-generated method stub
		return dao.consulterCommune(idCommune);
	}

	@Override
	public List<Commune> consulterCommunes() {
		// TODO Auto-generated method stub
		return dao.consulterCommunes();
	}

}
