package br.com.caelum.vraptor.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.VendasDAO;
import br.com.caelum.vraptor.validator.Validator;

@Path("dashboard")
@Controller
public class DashboardController {
	
	@Inject EntityManager em;
	@Inject Result result;
	@Inject VendasDAO vendasDAO;
	@Inject Validator validator;

	@Get("")
	public void dashboard() {
		
	}		
	
		
		
	
	
}
