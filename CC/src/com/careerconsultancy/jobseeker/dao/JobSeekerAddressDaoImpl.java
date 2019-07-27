package com.careerconsultancy.jobseeker.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.careerconsultancy.entities.jobseeker.JobSeekerAddress;
import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;

public class JobSeekerAddressDaoImpl implements JobSeekerAddressDao {
	private Session session;
	
	public JobSeekerAddressDaoImpl() {
		super();
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		session =  sessionFactory.openSession();
		System.out.println("Connection estsablished");
	}

	@Override
	public void insert(JobSeekerAddress jobSeekerAddress) {
		Transaction txTransaction=session.beginTransaction();
		session.save(jobSeekerAddress);
		txTransaction.commit();
		System.out.println("Product inserted");
		session.close();

	}

	@Override
	public void delete(JobSeekerAddress jobSeekerAddress) {
		Transaction txTransaction=session.beginTransaction();
		session.delete(jobSeekerAddress);
		txTransaction.commit();
		System.out.println("deleted");

	}

	@Override
	public void update(JobSeekerAddress jobSeekerAddress) {
		Transaction txTransaction=session.beginTransaction();
		session.update(jobSeekerAddress);
		txTransaction.commit();
		System.out.println("Record updated ");

	}

	@Override
	public JobSeekerAddress getbyId(int id) {
		return session.get(JobSeekerAddress.class,id);
	}

	@Override
	public List<JobSeekerAddress> getAll() {
		Query query=session.createQuery("from JobSeekerAddress");
		return query.getResultList();
	}

}
