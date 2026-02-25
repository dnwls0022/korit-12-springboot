package com.example.com.todolist.todolist.user;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;


@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NonNull@Column(nullable = false, unique = true)
    private String username;
    @NonNull@Column(nullable = false)
    private String password;
    @NonNull@Column(nullable = false)
    private String role;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Todo> todos;


}
