package br.com.caelum.vraptor.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vendas extends Model {
	
	private String produto;
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name = "vendedor_nome")
	private Vendedor vendedor;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
