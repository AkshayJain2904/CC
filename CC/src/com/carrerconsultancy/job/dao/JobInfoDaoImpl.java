package com.carrerconsultancy.job.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.careerconsultancy.entities.jobseeker.JobSeekerAddress;
import com.carrerconsultancy.entities.job.JobInfo;

public class JobInfoDaoImpl implements JobInfoDao {
	private Session session;
	
	
	
	public JobInfoDaoImpl() {
		super();
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		session =  sessionFactory.openSession();
		System.out.println("Connection estsablished");
	}

	@Override
	public void insert(JobInfo jobInfo) {
		Transaction txTransaction=session.beginTransaction();
		session.save(jobInfo);
		txTransaction.commit();
		System.out.println("Product inserted");
		session.close();


	}

	@Override
	public void delete(JobInfo jobInfo) {
		Transaction txTransaction=session.beginTransaction();
		session.delete(jobInfo);
		txTransaction.commit();
		System.out.println("deleted");

	}

	@Override
	public void update(JobInfo jobInfo) {
		Transaction txTransaction=session.beginTransaction();
		session.update(jobInfo);
		txTransaction.commit();
		System.out.println("Record updated ");

	}

	@Override
	public JobInfo getbyId(int id) {
		return session.get(JobInfo.class,id);
	}

	@Override
	public List<JobInfo> getAll() {
		Query query=session.createQuery("from JobInfo");
		return query.getResultList();
	}

}
