package br.com.paraense.assembleia.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.paraense.assembleia.models.EventoComanda;

public class ComandaDao {
	
	private EntityManager em;

	public ComandaDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(EventoComanda comanda) {
		this.em.persist(comanda);
	}
	public void atualizar(EventoComanda comanda) {
		this.em.merge(comanda);
	}
	
	public void remover(EventoComanda comanda) {
		comanda = em.merge(comanda);
		this.em.remove(comanda);
	}
	
	public EventoComanda bucarPorId(Long id) {
		return em.find(EventoComanda.class, id);
	}
	
	public List<EventoComanda> buscarTodos(){
		String jpql = "SELECT ev FROM EventoComanda ev";
		return em.createQuery(jpql, EventoComanda.class).getResultList();
	}


}
