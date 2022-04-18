package com.test.MicroContinuo.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.MicroContinuo.Models.User;

public interface IUsersRepositoryJPA extends JpaRepository<User, Long> {
	

}
