package com.carrerconsultancy.logincredential.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.carrerconsultancy.entities.logincredential.LoginCredential;

public class LoginCredentialDaoImpl implements LoginCredentialDao {
	private Session session;
	
	
	
	public LoginCredentialDaoImpl() {
		super();
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		session =  sessionFactory.openSession();
		System.out.println("Connection estsablished");
	}

	@Override
	public void insert(LoginCredential loginCredential) {
		Transaction txTransaction=session.beginTransaction();
		session.save(loginCredential);
		txTransaction.commit();
		System.out.println("Product inserted");
		session.close();

	}

	@Override
	public void delete(LoginCredential loginCredential) {
		Transaction txTransaction=session.beginTransaction();
		session.delete(loginCredential);
		txTransaction.commit();
		System.out.println("deleted");

	}

	@Override
	public void update(LoginCredential loginCredential) {
		Transaction txTransaction=session.beginTransaction();
		session.update(loginCredential);
		txTransaction.commit();
		System.out.println("Record updated ");

	}

	@Override
	public LoginCredential getbyId(int id) {
		return session.get(LoginCredential.class,id);
	}

	@Override
	public List<LoginCredential> getAll() {
		Query query=session.createQuery("from LoginCredential");
		return query.getResultList();
	}

}
