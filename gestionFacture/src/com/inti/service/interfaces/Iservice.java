package com.inti.service.interfaces;

import java.util.List;

public interface Iservice <T>{


	 void save(T emp);
	 void update(T emp);
	 void remove(T emp);
	 
    List<T>findAll(Class<?> c); //Objet de type classe; ? pour la g�n�ricit� des classes
    
    T findOne(Class<?> c,Long id);
}
