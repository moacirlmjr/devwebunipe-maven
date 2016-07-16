package br.com.unipe.gerenciamentoAdvogados.model.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.validation.constraints.Future;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.unipe.gerenciamentoAdvogados.model.TipoPessoa;

@Entity
public class Usuario extends EntityMaster {

	@NotEmpty
	private String nome;
	
	@Email
	private String email;
	
	@NotEmpty
	private String telefone;
	
	@NotEmpty
	private String username;
	
	@NotEmpty
	private String password;
	
	@Future
	private Date dataNascimento;

	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;

	@OneToOne(targetEntity = Autorizacao.class)
	private Autorizacao autorizacao;

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Autorizacao getAutorizacao() {
		return autorizacao;
	}

	public void setAutorizacao(Autorizacao autorizacao) {
		this.autorizacao = autorizacao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

}
