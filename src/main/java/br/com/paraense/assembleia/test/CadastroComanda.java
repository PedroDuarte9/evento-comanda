package br.com.paraense.assembleia.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.paraense.assembleia.dao.ComandaDao;
import br.com.paraense.assembleia.models.EventoComanda;
import br.com.paraense.assembleia.util.JPAUtil;

public class CadastroComanda {

	public static void main(String[] args) {

		EventoComanda comanda = new EventoComanda();
		comanda.setNameSocio("Carlos");
		comanda.setNumComanda(6320);
		
		
		EntityManager em = JPAUtil.getEntityManager(); //Instanciando a Classe JPAUtil para usar os gerenciadores de entidade e retirar a verbosidade desta classe de teste 
		
		ComandaDao dao = new ComandaDao(em);//Instanciei com base no gerenciador de entidade
		
		em.getTransaction().begin();//Inicia a transação
		dao.cadastrar(comanda); //Passa o objeto que será persistido
		em.getTransaction().commit();
		em.close();
		

	}

}
