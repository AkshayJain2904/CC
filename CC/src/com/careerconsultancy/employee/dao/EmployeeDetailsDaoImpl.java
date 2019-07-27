package com.careerconsultancy.employee.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.careerconsultancy.entities.employee.EmployeeDetails;
import com.careerconsultancy.entities.jobseeker.JobSeekerAddress;

public class EmployeeDetailsDaoImpl implements EmployeeDetailsDao {
	private Session session;
	
	
	
	public EmployeeDetailsDaoImpl() {
		super();
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		session =  sessionFactory.openSession();
		System.out.println("Connection estsablished");
	}

	@Override
	public void insert(EmployeeDetails employeeDetails) {
		Transaction txTransaction=session.beginTransaction();
		session.save(employeeDetails);
		txTransaction.commit();
		System.out.println("Product inserted");
		session.close();

	}

	@Override
	public void delete(EmployeeDetails employeeDetails) {
		Transaction txTransaction=session.beginTransaction();
		session.delete(employeeDetails);
		txTransaction.commit();
		System.out.println("deleted");

	}

	@Override
	public void update(EmployeeDetails employeeDetails) {
		Transaction txTransaction=session.beginTransaction();
		session.update(employeeDetails);
		txTransaction.commit();
		System.out.println("Record updated ");

	}

	@Override
	public EmployeeDetails getbyId(int id) {
		return session.get(EmployeeDetails.class,id);
	}

	@Override
	public List<EmployeeDetails> getAll() {
		Query query=session.createQuery("from EmployeeDetails");
		return query.getResultList();
	}

}
