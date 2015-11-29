package net.krypton.smartimmo.dao;

import java.util.List;

public interface IGenericDao <T> {
	
	public List<T> findAll();

	public T update(T entity);
	
	public void create(T entity);

	public void delete(T entity);

	public T findById(Long id);
	


}