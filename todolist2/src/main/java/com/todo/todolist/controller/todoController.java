package com.todo.todolist.controller;

import com.todo.todolist.dto.TodoRequest;
import com.todo.todolist.dto.TodoResponse;
import com.todo.todolist.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor

public class todoController {
    private final TodoService todoService;

    // todo 등록 api
    @PostMapping("/{userId}")
    public ResponseEntity<TodoResponse> addTodo(@PathVariable Long userId, @RequestBody TodoRequest request) {
        // 결과를response 객체명에저장햇다
        TodoResponse response = todoService.createTodo(userId, request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }
// 요청 종류,HTTP 메서드,URL 주소,Body 입력 여부
//할 일 등록,POST,.../api/todos/{유저ID},O (JSON 형식)
//전체 조회,GET,.../api/todos,X (비워둠)
    // todo 조회 api
    @GetMapping
    public ResponseEntity<List<TodoResponse>> getALLTodos(){
        return ResponseEntity.ok(todoService.getTodoList());
    }
}






