package com.careerconsultancy.jobseeker.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;

public class JobSeekerPersonalDetailsDaoImpl implements JobSeekerPersonalDetailsDao {
	private Session session;
	
	
	
	public JobSeekerPersonalDetailsDaoImpl() {
		super();
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		session =  sessionFactory.openSession();
		System.out.println("Connection estsablished");
	}

	@Override
	public void insert(JobSeekerPersonalDetails jobSeekerPersonalDetails) {
		Transaction txTransaction=session.beginTransaction();
		session.save(jobSeekerPersonalDetails);
		txTransaction.commit();
		System.out.println("Product inserted");
		session.close();

	}

	@Override
	public void update(JobSeekerPersonalDetails jobSeekerPersonalDetails) {
		Transaction txTransaction=session.beginTransaction();
		session.update(jobSeekerPersonalDetails);
		txTransaction.commit();
		System.out.println("Record updated ");

	}

	@Override
	public void delete(JobSeekerPersonalDetails jobSeekerPersonalDetails) {
		Transaction txTransaction=session.beginTransaction();
		session.delete(jobSeekerPersonalDetails);
		txTransaction.commit();
		System.out.println("deleted");

	}

	@Override
	public JobSeekerPersonalDetails getById(int id) {
		return session.get(JobSeekerPersonalDetails.class,id);
	}

	@Override
	public List<JobSeekerPersonalDetails> getAll() {
		Query query=session.createQuery("from JobSeekerPersonalDetails");
		return query.getResultList();
	}

}
