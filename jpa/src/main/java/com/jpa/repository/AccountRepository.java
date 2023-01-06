package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
