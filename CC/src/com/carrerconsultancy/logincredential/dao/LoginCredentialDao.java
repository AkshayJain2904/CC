package com.carrerconsultancy.logincredential.dao;

import java.util.List;
import com.carrerconsultancy.entities.logincredential.LoginCredential;

public interface LoginCredentialDao {
	void insert(LoginCredential loginCredential);
	void delete(LoginCredential loginCredential);
	void update(LoginCredential loginCredential);
	LoginCredential getbyId(int id);
	List<LoginCredential> getAll();

}
