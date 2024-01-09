package com.bitirme.bitirmeLoginPage.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bitirme.bitirmeLoginPage.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

    Login findByUsernameAndPassword(String username, String password);

    Login findByUsername(String username);
}

