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
		
		em.getTransaction().begin();//Inicia a transação
		
		em.persist(categoria);
		categoria.setNome("");
		
		em.flush();
		em.clear();
		
		em.merge(comanda);
		comanda.setNameSocio("Paulo");
		em.flush();
		
	}

}
