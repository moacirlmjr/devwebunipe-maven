package br.com.unipe.gerenciamentoAdvogados.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.unipe.gerenciamentoAdvogados.model.util.EntityManagerUtil;
import br.com.unipe.gerenciamentoAdvogados.model.vo.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

	@PersistenceContext
	protected EntityManager em;

	@Transactional
	public void create(Usuario usuario) {
		em.persist(usuario);
	}

	@Transactional
	public void update(Usuario usuario) {
		em.merge(usuario);
	}

	@Transactional
	public void delete(Usuario usuario) {
		em.remove(usuario);
	}

	@Transactional(readOnly = true)
	public List<Usuario> listAll() {
		return em.createQuery("From Usuario a").getResultList();
	}

	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		return em.find(Usuario.class, id);
	}

	@Override
	public Usuario findByUsername(String sessionUserName) {
		return (Usuario) em.createQuery("From Usuario a where a.username=:" + sessionUserName).getSingleResult();
	}

}
