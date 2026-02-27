package org.example.test9;


import lombok.Builder;
import lombok.ToString;

@Builder
@ToString

public class User {
    private String username;
    private String email;
    private int age;
}

class UserFactory {
    public static void main(String[] args) {
        User user= User.builder()
                .username("user1")
                .email("user1@example.com")
                .age(25)
                .build();

        System.out.println(String.valueOf(user));
        // TODO: 빌더 패턴을 사용하여 username="user1", email="user1@example.com", age=25 인 User 객체를 생성하고 출력하시오.
        User user1= User.builder()
                .username("user2")
                .email("use2@example.com")
                .build();

        System.out.printf(String.valueOf(user1));
        // TODO: 빌더 패턴을 사용하여 username="user2", email="user2@example.com" 인 User 객체를 생성하고 출력하시오.
    }
}
