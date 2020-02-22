package com.inti.dao.interfaces;

import com.inti.entities.Employe;

public interface IEmployeDAO {

	Employe getEmployeByLoginAndPassword(String login, String pwd);
	Employe getEmployeByLogin(String login);
}
