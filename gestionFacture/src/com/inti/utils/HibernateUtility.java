package com.inti.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtility {

	private static SessionFactory sf;
	/*Constructeur redéfinie comme étaant privé pour interdire son appel et
	 *  forcer à passer par la méthode getSessionFactory*/

		private HibernateUtility() {
			
		}
		
		/*public static  synchronized SessionFactory getSessionFactory() {
			if (sf==null) {
				sf= new Configuration().configure().buildSessionFactory();**/
				/*Si tu trouves que l'instance sf est null, alors tu crées l'instance.
				 * Sinon, tu ne crées pas l'instance.*/
			/*}

			return sf;
		} obsolète*/
		
		
		public static  synchronized SessionFactory getSessionFactory() {
			if (sf==null) {
				Configuration configuration = new Configuration().configure();
				ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
				registry.applySettings(configuration.getProperties());
				ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
				sf= configuration.buildSessionFactory(serviceRegistry);
				/*Si tu trouves que l'instance sf est null, alors tu crées l'instance.
				 * Sinon, tu ne crées pas l'instance.*/
			}

			return sf;
		}
		
}
