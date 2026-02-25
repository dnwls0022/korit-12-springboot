package com.example.com.todolist.todolist.repository;

import com.example.com.todolist.todolist.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
