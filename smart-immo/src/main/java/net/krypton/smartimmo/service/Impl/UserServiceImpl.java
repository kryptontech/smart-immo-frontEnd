package net.krypton.smartimmo.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.krypton.smartimmo.dao.UserDao;
import net.krypton.smartimmo.entities.User;
import net.krypton.smartimmo.service.UserService;
@Transactional
public class UserServiceImpl implements UserService {


	private UserDao dao;
	
	
	

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public User ajouterUser(User a) {
		// TODO Auto-generated method stub
		return dao.ajouterUser(a);
	}

	@Override
	public User modifierUser(User m) {
		// TODO Auto-generated method stub
		return dao.modifierUser(m);
	}

	@Override
	public void supprimerUser(int idUser) {
		// TODO Auto-generated method stub
		dao.supprimerUser(idUser);
	}

	@Override
	public User consulterUser(int idUser) {
		// TODO Auto-generated method stub
		return dao.consulterUser(idUser);
	}

	@Override
	public List<User> consulterUsers() {
		// TODO Auto-generated method stub
		return dao.consulterUsers();
	}

}
