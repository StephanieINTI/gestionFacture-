package com.inti.service.impl;

import com.inti.dao.impl.EmployeDAO;
import com.inti.dao.interfaces.IEmployeDAO;
import com.inti.entities.Employe;
import com.inti.service.interfaces.IEmployeService;

public class EmployeService extends ManagerService <Employe> implements IEmployeService{
   IEmployeDAO employeDAO = new EmployeDAO();
   
	@Override
	public Employe getEmployeByLoginAndPassword(String login, String pwd) {
       return employeDAO.getEmployeByLoginAndPassword(login,pwd);
	}

	@Override
	public Employe getEmployeByLogin(String login) {
		return employeDAO.getEmployeByLogin(login);
	}
  

}
