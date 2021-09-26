package br.com.caelum.vraptor.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Vendas;

@RequestScoped
public class VendasDAO extends DAO<Vendas>{

	@Inject
	public VendasDAO(EntityManager em) {
		super(em, Vendas.class);
	}
	
	@Deprecated	public VendasDAO(){this(null);}
	
	
	

}
