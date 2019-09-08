package com.github.dasister.sourcebans.repositories;

import com.github.dasister.sourcebans.domain.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
	Admin getAdminByEmail(String email);
}
