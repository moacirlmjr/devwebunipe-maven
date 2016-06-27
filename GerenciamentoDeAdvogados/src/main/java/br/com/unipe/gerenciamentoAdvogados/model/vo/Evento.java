package br.com.unipe.gerenciamentoAdvogados.model.vo;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Evento {

	private long id;
	private Date createdOn;

	private String nome;
	private Calendar data;

	private Set<Advogado> advogados;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Set<Advogado> getAdvogados() {
		return advogados;
	}

	public void setAdvogados(Set<Advogado> advogados) {
		this.advogados = advogados;
	}

}
