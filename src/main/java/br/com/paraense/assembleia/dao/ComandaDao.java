package br.com.paraense.assembleia.dao;

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


}
