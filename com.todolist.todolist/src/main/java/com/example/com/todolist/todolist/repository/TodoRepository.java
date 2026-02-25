package com.example.com.todolist.todolist.repository;

import com.example.com.todolist.todolist.user.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
