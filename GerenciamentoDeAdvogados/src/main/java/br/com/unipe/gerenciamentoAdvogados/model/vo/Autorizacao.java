package br.com.unipe.gerenciamentoAdvogados.model.vo;

import javax.persistence.Entity;

import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;
import org.hibernate.validator.constraints.NotEmpty;

@Audited
@Entity
public class Autorizacao extends EntityMaster {
	
	@NotAudited
	@NotEmpty(message="{notempty}")
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
