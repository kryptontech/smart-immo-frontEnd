package net.krypton.smartimmo.service.Impl;

import java.util.List;

import net.krypton.smartimmo.dao.AdminDao;
import net.krypton.smartimmo.entities.Admin;
import net.krypton.smartimmo.service.AdminService;

import org.springframework.transaction.annotation.Transactional;
@Transactional
public class AdminServiceImpl implements AdminService {
	
	
	private AdminDao dao;
	
	


	public void setDao(AdminDao dao) {
		this.dao = dao;
	}

	@Override
	public Admin ajouterAdmin(Admin a) {
		// TODO Auto-generated method stub
		return dao.ajouterAdmin(a);
	}

	@Override
	public Admin modifierAdmin(Admin m) {
		// TODO Auto-generated method stub
		return dao.modifierAdmin(m);
	}

	@Override
	public void supprimerAdmin(int idAdmin) {
		// TODO Auto-generated method stub
		dao.supprimerAdmin(idAdmin);
	}

	@Override
	public Admin consulterAdmin(int idAdmin) {
		// TODO Auto-generated method stub
		return dao.consulterAdmin(idAdmin);
	}

	@Override
	public List<Admin> consulterAdmins() {
		// TODO Auto-generated method stub
		return dao.consulterAdmins();
	}

}
