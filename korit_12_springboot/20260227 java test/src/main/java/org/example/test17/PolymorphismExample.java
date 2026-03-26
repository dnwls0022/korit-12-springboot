package org.example.test17;

class Animal {
    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    public void fetch() {
        System.out.println("공을가져옵니다.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        // TODO: animals 배열의 0번 인덱스에 Dog 객체를, 1번 인덱스에 Cat 객체를 할당하시오.
        animals[0] = new Dog();
        animals[1]= new Cat();
        // TODO: 반복문을 사용하여 모든 동물의 makeSound() 메서드를 호출하시오.
        Animal animal4 = new Dog();
        if(animal4 instanceof Dog) {    // 이 조건식이 true라면 animal4의 생성시 호출된 생성자는 Dog();라는 의미
            animal4.makeSound();        // 그러므로 animal4.makeSound()를 호출했을 때의 결과값은 개가 짖습니다.
            // 근데 fetch도 호출하고 싶다면
            Dog dog4 = (Dog)animal4;
            // 그래서 다운캐스팅
            dog4.fetch();               // 그러면 오류가 발생하는 일 없이 실행문이 호출되겠네요.
        } else if (animal4 instanceof Cat ) {
            Cat Cat4 = (Cat) animal4;
            Cat4.makeSound();

        }
        Animal animal0 = new Cat();
        animal0.makeSound();
        // 추가로, instanceof를 사용해 Dog일 경우 다운캐스팅하여 fetch() 메서드를 호출하시오.
    }
}