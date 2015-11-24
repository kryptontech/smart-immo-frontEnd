package net.krypton.smartimmo.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.BienDao;
import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.service.BienService;

@Transactional
public class BienServiceImpl implements BienService {


	private BienDao dao;
	
	

	public void setDao(BienDao dao) {
		this.dao = dao;
	}

	@Override
	public Bien ajouterBien(Bien a) {
		// TODO Auto-generated method stub
		return dao.ajouterBien(a);
	}

	@Override
	public Bien modifierBien(Bien m) {
		// TODO Auto-generated method stub
		return dao.modifierBien(m);
	}

	@Override
	public void supprimerBien(int idBien) {
		// TODO Auto-generated method stub
		dao.supprimerBien(idBien);
	}

	@Override
	public Bien consulterBien(int idBien) {
		// TODO Auto-generated method stub
		return dao.consulterBien(idBien);
	}

	@Override
	public List<Bien> consulterBiens() {
		// TODO Auto-generated method stub
		return dao.consulterBiens();
	}

}
