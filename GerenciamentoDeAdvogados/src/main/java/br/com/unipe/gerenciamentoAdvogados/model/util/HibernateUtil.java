package br.com.unipe.gerenciamentoAdvogados.model.util;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil implements Serializable {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}

		return sessionFactory;
	}

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();
	}
}
