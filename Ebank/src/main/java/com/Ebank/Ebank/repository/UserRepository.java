package com.Ebank.Ebank.repository;

import com.Ebank.Ebank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
