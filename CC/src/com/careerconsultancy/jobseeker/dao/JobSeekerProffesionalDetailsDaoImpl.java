package com.careerconsultancy.jobseeker.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;
import com.careerconsultancy.entities.jobseeker.JobSeekerProffesionalDetails;

public class JobSeekerProffesionalDetailsDaoImpl implements JobSeekerProffesionalDetailsDao {
	
	private Session session;
	
	
	
	public JobSeekerProffesionalDetailsDaoImpl() {
		super();
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		session =  sessionFactory.openSession();
		System.out.println("Connection estsablished");
	}

	@Override
	public void insert(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		Transaction txTransaction=session.beginTransaction();
		session.save(jobSeekerProffesionalDetails);
		txTransaction.commit();
		System.out.println("Product inserted");
		session.close();

	}

	@Override
	public void delete(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		Transaction txTransaction=session.beginTransaction();
		session.delete(jobSeekerProffesionalDetails);
		txTransaction.commit();
		System.out.println("deleted");


	}

	@Override
	public void update(JobSeekerProffesionalDetails jobSeekerProffesionalDetails) {
		Transaction txTransaction=session.beginTransaction();
		session.update(jobSeekerProffesionalDetails);
		txTransaction.commit();
		System.out.println("Record updated ");

	}

	@Override
	public JobSeekerProffesionalDetails getbyId(int id) {
		return session.get(JobSeekerProffesionalDetails.class,id);
	}

	@Override
	public List<JobSeekerProffesionalDetails> getAll() {
		Query query=session.createQuery("from JobSeekerProffesionalDetails");
		return query.getResultList();
	}

}
