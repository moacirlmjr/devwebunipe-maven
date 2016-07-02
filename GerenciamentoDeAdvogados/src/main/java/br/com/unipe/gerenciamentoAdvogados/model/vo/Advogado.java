package br.com.unipe.gerenciamentoAdvogados.model.vo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Advogado extends EntityMaster {

	private String numeroOab;

	@OneToOne(targetEntity = Usuario.class, optional = false)
	private Usuario usuario;

	@OneToMany(targetEntity = Anuidade.class, mappedBy = "advogado")
	private Set<Anuidade> anuidade;

	@ManyToMany(targetEntity = Evento.class)
	@JoinTable(name = "evento_advogado", joinColumns = @JoinColumn(name = "advogado_id"), inverseJoinColumns = @JoinColumn(name = "evento_id"))
	private Set<Evento> eventos;

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