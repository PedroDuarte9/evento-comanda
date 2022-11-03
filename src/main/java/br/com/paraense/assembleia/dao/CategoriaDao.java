package br.com.paraense.assembleia.dao;

import javax.persistence.EntityManager;


import br.com.paraense.assembleia.models.Categoria;

public class CategoriaDao {
	
	private EntityManager em; //
	
	public CategoriaDao(EntityManager em) {
		this.em = em;
	}
	
	public void getCadastrar(Categoria categoria) {
		this.em.persist(categoria);
	}
	
	
	
}
