package com.example.com.todolist.todolist;

import com.example.com.todolist.todolist.repository.TodoRepository;
import com.example.com.todolist.todolist.repository.UserRepository;
import com.example.com.todolist.todolist.user.Todo;
import com.example.com.todolist.todolist.user.User;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final UserRepository userRepository;
	private final TodoRepository todoRepository;

	public Application(UserRepository userRepository, TodoRepository todoRepository) {
		this.userRepository = userRepository;
		this.todoRepository = todoRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	public void run(String... args) throws Exception {
		User user0 = new User("김일","123","user");
		User user1 = new User("김이", "456", "user");

		userRepository.save(user0);
		userRepository.save(user1);

		Todo todo1 = new Todo("SQLD", user0);
		Todo todo2 = new Todo("자습", user1);
		todoRepository.saveAll(Arrays.asList(todo1, todo2));

	}
}
