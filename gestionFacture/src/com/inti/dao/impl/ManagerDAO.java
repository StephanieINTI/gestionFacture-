package com.inti.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.inti.dao.interfaces.IDAO;
import com.inti.entities.Employe;
import com.inti.utils.HibernateUtility;

public class ManagerDAO<T> implements IDAO <T>{

	Session s= HibernateUtility.getSessionFactory().openSession();
	
	public void save(T obj) {
		try {
			s.getTransaction().begin();
			s.persist(obj);
			s.getTransaction().commit();
			//s.close();
		}catch(HibernateException e) {
			e.printStackTrace();
	}
		
	}

	public void update(T obj) {
		try {
			s.getTransaction().begin();
			s.merge(obj);
			s.getTransaction().commit();
			//s.close();
		}catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}
		
	

	public void remove(T obj) {
		try {
			//s.getTransaction().begin();
			s.delete(obj);
			s.getTransaction().commit();
			//Il faut mtn supprimer les donn�es de la m�moire
			s.flush();
			//s.close();
		}catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll(Class<?> c) {
		try {
			s.getTransaction().begin();
			Query queryHql = s.createQuery(" from "+ c.getName()); 
			
			List<T> liste  = queryHql.list(); 
			s.getTransaction().commit();
			//s.close();
			return liste;
		}catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	@SuppressWarnings("unchecked")
	public T findOne(Class<?> c, Long id) {
		T t;
		s.getTransaction().begin();
		t=(T) s.get(c, id);
	return t;
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
