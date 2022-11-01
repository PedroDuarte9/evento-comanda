package br.com.paraense.assembleia.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("crud-comanda");// Instacia essa Interface que é uma Gerenciadora de Entidades
	
	public static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();//Instacia essa outra com base na de cima 
		
	}
}


