package com.github.dasister.sourcebans.repositories.impl;

import com.github.dasister.sourcebans.domain.Admin;
import com.github.dasister.sourcebans.repositories.AdminRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;

@Repository
@Transactional
public class AdminRepositoryImpl implements AdminRepository {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Admin getAdminByEmail(String email) {
		TypedQuery<Admin> query = sessionFactory.getCurrentSession().createQuery("from Admin a where a.email = :email", Admin.class);
		query.setParameter("email", email);
		return query.getSingleResult();
	}
}
