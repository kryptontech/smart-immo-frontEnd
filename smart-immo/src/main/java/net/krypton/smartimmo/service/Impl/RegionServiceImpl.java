package net.krypton.smartimmo.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.RegionDao;
import net.krypton.smartimmo.entities.Region;
import net.krypton.smartimmo.service.RegionService;

@Transactional
public class RegionServiceImpl implements RegionService {


	private RegionDao dao;
	
	

	public void setDao(RegionDao dao) {
		this.dao = dao;
	}

	@Override
	public Region ajouterRegion(Region a) {
		// TODO Auto-generated method stub
		return dao.ajouterRegion(a);
	}

	@Override
	public Region modifierRegion(Region m) {
		// TODO Auto-generated method stub
		return dao.modifierRegion(m);
	}

	@Override
	public void supprimerRegion(int idRegion) {
		// TODO Auto-generated method stub
		dao.supprimerRegion(idRegion);
	}

	@Override
	public Region consulterRegion(int idRegion) {
		// TODO Auto-generated method stub
		return dao.consulterRegion(idRegion);
	}

	@Override
	public List<Region> consulterRegions() {
		// TODO Auto-generated method stub
		return dao.consulterRegions();
	}
}
