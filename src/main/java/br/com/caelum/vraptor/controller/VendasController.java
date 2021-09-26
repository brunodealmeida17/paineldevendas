package br.com.caelum.vraptor.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.VendasDAO;
import br.com.caelum.vraptor.model.Vendas;
import br.com.caelum.vraptor.validator.Validator;

@Path("vendas")
@Controller

public class VendasController {
	@Inject EntityManager em;
	@Inject Result result;
	@Inject VendasDAO vendasDAO;
	@Inject Validator validator;

	@Get("")
	public void vendas() {
		
	}
	@Post("salvavendas")
	public void salvavendas(@Valid Vendas vendas) {
		validator.onErrorRedirectTo(this).vendas();
		
		vendasDAO.insertOrUpdate(vendas);
		result.redirectTo(DashboardController.class).dashboard();
	}

}
