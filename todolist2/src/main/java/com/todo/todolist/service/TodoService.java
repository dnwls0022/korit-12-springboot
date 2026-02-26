package com.todo.todolist.service;


import com.todo.todolist.dto.TodoRequest;
import com.todo.todolist.dto.TodoResponse;
import com.todo.todolist.entity.Todo;
import com.todo.todolist.entity.User;
import com.todo.todolist.repository.TodoRepository;
import com.todo.todolist.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoService {
    //필드(Field)는 "내가 쓸 수 있는 도구"입니다
    //우리가 변수를 선언하는 건, 이 클래스 안에서 **"어떤 물건을 보관하거나 도구로 쓰겠다"**고 선언하는 거예요.
    //
    //private String content;: "나는 '글자'라는 재료를 가지고 있을 거야."
    //자바에서는 숫자나 문자뿐만 아니라, **우리가 만든 클래스나 인터페이스도 하나의 '타입(자료형)'**
    //private UserRepository userRepository;: "나는 '사용자 창고 관리자'라는 **전문가(도구)**를 내 옆에 두고 언제든 부려 먹을 거야."

    private final TodoRepository todoRepository;
    private final UserRepository userRepository;

    //post요청을 하는 비즈니스 로직작성
    @Transactional
    public TodoResponse createTodo(Long userId, TodoRequest request){
        User user = userRepository.findById(userId).orElseThrow(()->new RuntimeException("사용자찾을수없음"));

        Todo todo = new Todo(request.content(), user); // Todo객체 만들어지면isComplete 가 적용된다.
        Todo saveTodo = todoRepository.save(todo);


        // Entity를 dto로 변환해서 Controller 로 넘겨주기
        return new TodoResponse(saveTodo.getId(), saveTodo.getContent(),saveTodo.isCompleted());
    }


    //get 요청하는로직
    @Transactional(readOnly = true)
    public List<TodoResponse> getTodoList(){
        // list에 하나하나 새로운함수를 적용 map()
        return  todoRepository.findAll().stream()
                .map(todo -> new TodoResponse(todo.getId(), todo.getContent(),todo.isCompleted()))
                .collect(Collectors.toList());

    }
}
