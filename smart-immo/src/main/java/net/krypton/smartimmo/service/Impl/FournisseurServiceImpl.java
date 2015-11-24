package net.krypton.smartimmo.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.FournisseurDao;
import net.krypton.smartimmo.entities.Fournisseur;
import net.krypton.smartimmo.service.FournisseurService;

@Transactional
public class FournisseurServiceImpl implements FournisseurService {


	private FournisseurDao dao;
	
	
	

	public void setDao(FournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public Fournisseur ajouterFournisseur(Fournisseur a) {
		// TODO Auto-generated method stub
		return dao.ajouterFournisseur(a);
	}

	@Override
	public Fournisseur modifierFournisseur(Fournisseur m) {
		// TODO Auto-generated method stub
		return dao.modifierFournisseur(m);
	}

	@Override
	public void supprimerFournisseur(int idFournisseur) {
		// TODO Auto-generated method stub
		dao.supprimerFournisseur(idFournisseur);
	}

	@Override
	public Fournisseur consulterFournisseur(int idFournisseur) {
		// TODO Auto-generated method stub
		return dao.consulterFournisseur(idFournisseur);
	}

	@Override
	public List<Fournisseur> consulterFournisseurs() {
		// TODO Auto-generated method stub
		return dao.consulterFournisseurs();
	}

}
