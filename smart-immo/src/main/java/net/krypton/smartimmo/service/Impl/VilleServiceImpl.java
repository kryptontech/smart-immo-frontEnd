package net.krypton.smartimmo.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.VilleDao;
import net.krypton.smartimmo.entities.Ville;
import net.krypton.smartimmo.service.VilleService;
@Transactional
public class VilleServiceImpl implements VilleService {


	private VilleDao dao;
	
	

	public void setDao(VilleDao dao) {
		this.dao = dao;
	}

	@Override
	public Ville ajouterVille(Ville a) {
		// TODO Auto-generated method stub
		return dao.ajouterVille(a);
	}

	@Override
	public Ville modifierVille(Ville m) {
		// TODO Auto-generated method stub
		return dao.modifierVille(m);
	}

	@Override
	public void supprimerVille(int idVille) {
		// TODO Auto-generated method stub
		dao.supprimerVille(idVille);
	}

	@Override
	public Ville consulterVille(int idVille) {
		// TODO Auto-generated method stub
		return dao.consulterVille(idVille);
	}

	@Override
	public List<Ville> consulterVilles() {
		// TODO Auto-generated method stub
		return dao.consulterVilles();
	}

}
