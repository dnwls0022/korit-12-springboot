package org.example.test18;


public class FruitPrinter {
    public static void main(String[] args) {
        String[] fruits = {"사과", "바나나", "딸기", "포도"};

        for (String s : fruits) {
            System.out.printf("맛있는"+s+"\n");
        }
        // TODO: 향상된 for문을 사용하여 배열의 모든 과일 이름을 지정된 형식으로 출력하시오.
        // for(요소타입 변수 : 배열이름)

    }
}
