package br.com.unipe.gerenciamentoAdvogados.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.unipe.gerenciamentoAdvogados.model.util.EntityManagerUtil;
import br.com.unipe.gerenciamentoAdvogados.model.util.HibernateUtil;
import br.com.unipe.gerenciamentoAdvogados.model.vo.Autorizacao;

public class AutorizacaoDAOImpl {

	public void create(Autorizacao autorizacao) {
		EntityManager em = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(autorizacao);
			em.getTransaction().commit();
		} catch (HibernateException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	public void update(Autorizacao autorizacao) {
		EntityManager em = EntityManagerUtil.
				getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(autorizacao);
			em.getTransaction().commit();
		} catch (HibernateException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	public void delete(Autorizacao autorizacao) {
		EntityManager em = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(autorizacao);
			em.getTransaction().commit();
		} catch (HibernateException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	public Autorizacao findById(Long id) {
		EntityManager em = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			return em.find(Autorizacao.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return null;
	}

	public List<Autorizacao> listAll() {
		EntityManager em = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			return em.createQuery("From Autorizacao a").getResultList();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return null;
	}

}
