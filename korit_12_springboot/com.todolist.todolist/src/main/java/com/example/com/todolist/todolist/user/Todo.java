package com.example.com.todolist.todolist.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoId;


    @NonNull@Column(nullable = false)
    private String content;

    @Column(nullable = false)
    // private Boolean isComplete=false; 와  private boolean isComplete=false;
    private Boolean isComplete=false;

    @NonNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    @JsonIgnore
    private User user;


}
