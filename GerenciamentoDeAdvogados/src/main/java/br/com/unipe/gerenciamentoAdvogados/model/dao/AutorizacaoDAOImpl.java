package br.com.unipe.gerenciamentoAdvogados.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.unipe.gerenciamentoAdvogados.model.util.EntityManagerUtil;
import br.com.unipe.gerenciamentoAdvogados.model.vo.Autorizacao;

@Repository
public class AutorizacaoDAOImpl implements AutorizacaoDAO {

	@PersistenceContext
	protected EntityManager em;

	@Transactional
	public void create(Autorizacao autorizacao) {
		em.persist(autorizacao);
	}

	@Transactional
	public void update(Autorizacao autorizacao) {
		em.merge(autorizacao);
	}

	@Transactional
	public void update2(Autorizacao autorizacao) {
		Autorizacao authBD = em.find(Autorizacao.class, autorizacao.getId());
		authBD.setCreatedOn(autorizacao.getCreatedOn());
		authBD.setNome(autorizacao.getNome());
	}

	@Transactional
	public void delete(Autorizacao autorizacao) {
		em.remove(em.contains(autorizacao) ? autorizacao : em.merge(autorizacao));
	}

	@Transactional(readOnly = true)
	public Autorizacao findById(Long id) {
		return em.find(Autorizacao.class, id);
	}

	@Transactional(readOnly = true)
	public List<Autorizacao> listAll() {
		return em.createQuery("From Autorizacao a").getResultList();
	}

}
