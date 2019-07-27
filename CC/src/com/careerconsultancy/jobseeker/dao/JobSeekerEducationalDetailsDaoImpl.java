package com.careerconsultancy.jobseeker.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.careerconsultancy.entities.jobseeker.JobSeekerEducationalDetails;
import com.careerconsultancy.entities.jobseeker.JobSeekerPersonalDetails;

public class JobSeekerEducationalDetailsDaoImpl implements JobSeekerEducationalDetailsDao {
	private Session session;
	
	public JobSeekerEducationalDetailsDaoImpl() {
		super();
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		session =  sessionFactory.openSession();
		System.out.println("Connection estsablished");
	}

	@Override
	public void insert(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		Transaction txTransaction=session.beginTransaction();
		session.save(jobSeekerEducationalDetails);
		txTransaction.commit();
		System.out.println("Product inserted");
		session.close();


	}

	@Override
	public void delete(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		Transaction txTransaction=session.beginTransaction();
		session.delete(jobSeekerEducationalDetails);
		txTransaction.commit();
		System.out.println("deleted");

	}

	@Override
	public void update(JobSeekerEducationalDetails jobSeekerEducationalDetails) {
		Transaction txTransaction=session.beginTransaction();
		session.update(jobSeekerEducationalDetails);
		txTransaction.commit();
		System.out.println("Record updated ");

	}

	@Override
	public JobSeekerEducationalDetails getbyId(int id) {
		return session.get(JobSeekerEducationalDetails.class,id);
	}

	@Override
	public List<JobSeekerEducationalDetails> getAll() {
		Query query=session.createQuery("from JobSeekerEducationalDetails");
		return query.getResultList();
	}

}
