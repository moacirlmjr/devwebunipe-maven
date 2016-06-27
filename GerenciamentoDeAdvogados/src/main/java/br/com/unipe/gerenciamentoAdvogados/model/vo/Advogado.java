package br.com.unipe.gerenciamentoAdvogados.model.vo;

import java.util.Date;
import java.util.Set;

public class Advogado {

	private long id;
	private Date createdOn;
	private String numeroOab;
	private Usuario usuario;
	private Set<Anuidade> anuidade;
	private Set<Evento> eventos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getNumeroOab() {
		return numeroOab;
	}

	public void setNumeroOab(String numeroOab) {
		this.numeroOab = numeroOab;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Set<Anuidade> getAnuidade() {
		return anuidade;
	}

	public void setAnuidade(Set<Anuidade> anuidade) {
		this.anuidade = anuidade;
	}

	public Set<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}

}