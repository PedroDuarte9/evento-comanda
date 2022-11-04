package br.com.paraense.assembleia.test;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.paraense.assembleia.dao.CategoriaDao;
import br.com.paraense.assembleia.dao.ComandaDao;
import br.com.paraense.assembleia.models.Categoria;
import br.com.paraense.assembleia.models.EventoComanda;
import br.com.paraense.assembleia.util.JPAUtil;

public class CadastroComanda {

	public static void main(String[] args) {
		
		cadastrarProduto();
		EntityManager em = JPAUtil.getEntityManager(); 
		ComandaDao comandaDao = new ComandaDao(em);
		
		EventoComanda ev = comandaDao.bucarPorId(1l);
		System.out.println(ev.getNameSocio());
		
		List<EventoComanda> todos = comandaDao.buscarTodos();
		todos.forEach(eve -> System.out.println(eve.getNameSocio()));
	}

	private static void cadastrarProduto() {
		Categoria categoria = new Categoria("Ativo Proprietário");
     	EventoComanda comanda = new EventoComanda("Pedro", 6320, categoria);	
		
		
		EntityManager em = JPAUtil.getEntityManager(); 
		ComandaDao comandaDao = new ComandaDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		
		em.getTransaction().begin();
		categoriaDao.getCadastrar(categoria);
		comandaDao.cadastrar(comanda);
		
		em.getTransaction().commit();
		em.close();
	}

}
