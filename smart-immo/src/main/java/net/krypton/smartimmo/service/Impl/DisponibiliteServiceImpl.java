package net.krypton.smartimmo.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.DisponibiliteDao;
import net.krypton.smartimmo.entities.Disponibilite;
import net.krypton.smartimmo.service.DisponibiliteService;

@Transactional
public class DisponibiliteServiceImpl implements DisponibiliteService {


	private DisponibiliteDao dao;
	
	
	

	public void setDao(DisponibiliteDao dao) {
		this.dao = dao;
	}

	@Override
	public Disponibilite ajouterDisponibilite(Disponibilite a) {
		// TODO Auto-generated method stub
		return dao.ajouterDisponibilite(a);
	}

	@Override
	public Disponibilite modifierDisponibilite(Disponibilite m) {
		// TODO Auto-generated method stub
		return dao.modifierDisponibilite(m);
	}

	@Override
	public void supprimerDisponibilite(int idDisponibilite) {
		// TODO Auto-generated method stub
		dao.supprimerDisponibilite(idDisponibilite);
	}

	@Override
	public Disponibilite consulterDisponibilite(int idDisponibilite) {
		// TODO Auto-generated method stub
		return dao.consulterDisponibilite(idDisponibilite);
	}

	@Override
	public List<Disponibilite> consulterDisponibilites() {
		// TODO Auto-generated method stub
		return dao.consulterDisponibilites();
	}
}
