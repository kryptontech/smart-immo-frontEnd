package net.krypton.smartimmo.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.TypeOffreDao;
import net.krypton.smartimmo.entities.TypeOffre;
import net.krypton.smartimmo.service.TypeOffreService;

@Transactional
public class TypeOffreServiceImpl implements TypeOffreService {


	private TypeOffreDao dao;
	
	
	

	public void setDao(TypeOffreDao dao) {
		this.dao = dao;
	}

	@Override
	public TypeOffre ajouterTypeOffre(TypeOffre a) {
		// TODO Auto-generated method stub
		return dao.ajouterTypeOffre(a);
	}

	@Override
	public TypeOffre modifierTypeOffre(TypeOffre m) {
		// TODO Auto-generated method stub
		return dao.modifierTypeOffre(m);
	}

	@Override
	public void supprimerTypeOffre(int idTypeOffre) {
		// TODO Auto-generated method stub
		dao.supprimerTypeOffre(idTypeOffre);
	}

	@Override
	public TypeOffre consulterTypeOffre(int idTypeOffre) {
		// TODO Auto-generated method stub
		return dao.consulterTypeOffre(idTypeOffre);
	}

	@Override
	public List<TypeOffre> consulterTypeOffres() {
		// TODO Auto-generated method stub
		return dao.consulterTypeOffres();
	}
}
