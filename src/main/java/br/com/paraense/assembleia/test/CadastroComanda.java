package br.com.paraense.assembleia.test;

import javax.persistence.EntityManager;

import br.com.paraense.assembleia.dao.CategoriaDao;
import br.com.paraense.assembleia.dao.ComandaDao;
import br.com.paraense.assembleia.models.Categoria;
import br.com.paraense.assembleia.models.EventoComanda;
import br.com.paraense.assembleia.util.JPAUtil;

public class CadastroComanda {

	public static void main(String[] args) {
		
		Categoria categoria = new Categoria("ATIVO_PROPRIETARIO");
		
		EventoComanda comanda = new EventoComanda("Pedro", 6320, categoria);	
		
		
		EntityManager em = JPAUtil.getEntityManager(); //Instanciando o Gerenciador de persistencia a Classe JPAUtil para usar os gerenciadores de entidade e retirar a verbosidade desta classe de teste 
		
		
		ComandaDao comandaDao = new ComandaDao(em);//Instanciei com base no gerenciador de entidade
		CategoriaDao categoriaDao = new CategoriaDao(em); 
		
		em.getTransaction().begin();//Inicia a transação
		 
		categoriaDao.getCadastrar(categoria);
		comandaDao.cadastrar(comanda); //Passa o objeto que será persistido OBS.: Este é o principal estado que um objeto pode estar, pois pelo ciclo de vida, aqui o objeto de fato está sendo persistido na tabela  
		
		em.getTransaction().commit();
		em.close();
		

	}

}
