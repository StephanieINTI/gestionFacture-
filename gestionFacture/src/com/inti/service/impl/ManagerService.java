package com.inti.service.impl;

import java.util.List;

import com.inti.dao.impl.ManagerDAO;
import com.inti.dao.interfaces.IDAO;
import com.inti.entities.Employe;
import com.inti.service.interfaces.Iservice;

public class ManagerService<T> implements Iservice<T> {

	IDAO<T> dao = new ManagerDAO<T>();
	
	public void save(T obj) {
		dao.save(obj);
		
	}

	public void update(T obj) {
		dao.update(obj);
		
	}

	public void remove(T obj) {
		dao.remove(obj);
		
	}

	public List<T> findAll(Class<?> c) {
		return dao.findAll(c);
	}

	public T findOne(Class<?> c, Long id) {
		return dao.findOne(c, id);
	}

	public Employe getEmployeByLoginAndPassword(String login, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employe getEmployeByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
