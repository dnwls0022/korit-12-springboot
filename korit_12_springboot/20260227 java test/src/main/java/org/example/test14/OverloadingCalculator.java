package org.example.test14;

class Calculator {
    // TODO: 두 개의 int를 더하는 add 메서드를 작성하시오.
    public int add(int a, int b) {
        int result =a+b;
        return result;
    }
    // TODO: 두 개의 double을 더하는 add 메서드를 작성하시오.
    public int add(double a, double b) {
        double result =a+b;
        return (int) result;
    }
}

//Calculator 클래스 안에 이름이 add인 메서드를 두 개 정의합니다.
//첫 번째 add 메서드는 두 개의 int를 인자로 받아 합을 반환합니다.
//두 번째 add 메서드는 두 개의 double을 인자로 받아 합을 반환합니다.
//main 메서드에서 두 add 메서드를 각각 호출하여 결과를 "실행 예"와 같이 출력하세요.
public class OverloadingCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // TODO: 5와 10을 더한 결과를 "정수 덧셈 결과: [결과]" 형식으로 출력하시오.
        calc.add(5,10);
        System.out.println("정수 덧셈 결과: [결과]"+calc.add(5,10));
        // TODO: 3.5와 2.5를 더한 결과를 "실수 덧셈 결과: [결과]" 형식으로 출력하시오.
        calc.add(3.5,5.5);
        System.out.println("실수 덧셈 결과: [결과]"+calc.add(3.5,2.5));

    }
}
