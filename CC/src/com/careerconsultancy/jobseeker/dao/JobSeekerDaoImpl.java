package com.careerconsultancy.jobseeker.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.careerconsultancy.entities.jobseeker.JobSeeker;
import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;

public class JobSeekerDaoImpl implements JobSeekerDao {
	private Session session;
	
	
	
	public JobSeekerDaoImpl() {
		super();
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		session =  sessionFactory.openSession();
		System.out.println("Connection estsablished");
	}

	@Override
	public void insert(JobSeeker jobSeeker) {
		Transaction txTransaction=session.beginTransaction();
		session.save(jobSeeker);
		txTransaction.commit();
		System.out.println("Product inserted");
		session.close();

	}

	@Override
	public void delete(JobSeeker jobSeeker) {
		Transaction txTransaction=session.beginTransaction();
		session.delete(jobSeeker);
		txTransaction.commit();
		System.out.println("deleted");

	}

	@Override
	public void update(JobSeeker jobSeeker) {
		Transaction txTransaction=session.beginTransaction();
		session.update(jobSeeker);
		txTransaction.commit();
		System.out.println("Record updated ");
	}

	@Override
	public JobSeeker getbyId(int id) {
		return session.get(JobSeeker.class,id);
	}

	@Override
	public List<JobSeeker> getAll() {
		Query query=session.createQuery("from JobSeeker");
		return query.getResultList();
	}

}
