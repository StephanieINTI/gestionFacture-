package com.inti.dao.interfaces;

import java.util.List;

public interface IDAO <T>{

		 void save(T emp);
		 void update(T emp);
		 void remove(T emp);
		 
	     List<T>findAll(Class<?> c); //Objet de type classe; ? pour la généricité des classes
	     
	     T findOne(Class<?> c,Long id);
	}

