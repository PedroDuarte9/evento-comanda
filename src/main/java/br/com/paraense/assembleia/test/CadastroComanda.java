package br.com.paraense.assembleia.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.paraense.assembleia.dao.ComandaDao;
import br.com.paraense.assembleia.models.EventoComanda;

public class CadastroComanda {

	public static void main(String[] args) {

		EventoComanda comanda = new EventoComanda();
		comanda.setNameSocio("Carlos");
		comanda.setNumComanda(6320);
		
		EntityManagerFactory etf = Persistence.createEntityManagerFactory("crud-comanda");// Instacia essa Interface que é uma Gerenciadora de Entidades
		EntityManager em = etf.createEntityManager(); //Instacia essa outra com base na de cima 
		
		ComandaDao dao = new ComandaDao(em);//Instanciei com base no gerenciador de entidade
		
		em.getTransaction().begin();//Inicia a transação
		dao.cadastrar(comanda); //Passa o objeto que será persistido
		em.getTransaction().commit();
		em.close();
		

	}

}
