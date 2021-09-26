package br.com.caelum.vraptor.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Vendedor extends Model {

	@NotEmpty (message = "{vendedor.nome.embranco}") @Size(min = 4, max = 20, message = "{vendedor.nome.size}")	
	private String nome;
	@NotEmpty(message = "{vendedor.email.embranco}") @Email (message = "{vendedor.email.size}")
	private String email;
	@NotNull(message = "{vendedor.phone.embranco}") @Size(min = 12, max = 12, message = "{vendedor.phone.size}")	
	private Integer phone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}
