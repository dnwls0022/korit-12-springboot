package org.example.test6;

public class MemberManagement {
    public static void main(String[] args) {
        Member member = new Member();
        Member member1 = new Member();
        Member member2 = new Member();

        member.setName("이순신");
        member1.setName("김");
        member2.setName("강감찬");

        member.setAge(150);
        member1.setAge(30);
        member2.setAge(45);

        member.printInfo();
        member1.printInfo();
        member2.printInfo();

        //System.out.printf(member.getName(),member.getAge());
        //System.out.printf(member1.getName(),member1.getAge());
        //System.out.printf(member2.getName(),member2.getAge());

        // TODO: 유효한 이름("이순신")과 유효하지 않은 나이(150)를 설정하고 정보를 출력하시오.
        // TODO: 유효하지 않은 이름("김")과 유효한 나이(30)를 설정하고 정보를 출력하시오.
        // TODO: 유효한 이름("강감찬")과 유효한 나이(45)를 설정하고 정보를 출력하시오.

        //실행 예:
        //
        //유효하지 않은 나이입니다.
        //이름: 이순신, 나이: 0
        //유효하지 않은 이름입니다.
        //이름: 이순신, 나이: 30
        //이름: 강감찬, 나이: 45
    }

    static class Member {
        private String name;
        private int age;

        // TODO: name에 대한 Getter와 Setter를 작성하시오.
        // Setter에는 이름이 null이 아니고 2글자 이상인지 검증하는 로직을 추가하시오.

        public String getName() {
            return name;
        }
        // 비어있지않고 이름이 두글자이상이면 김

        public void setName(String name) {
            if(name == null || name.length()<= 2) {
                System.out.println("유효하지않은 이름입니다.");
            }
            this.name = name;
        }

        // TODO: age에 대한 Getter와 Setter를 작성하시오.
        // Setter에는 나이가 0에서 120 사이인지 검증하는 로직을 추가하시오.
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            if (age < 0 || age > 120) {
                System.out.println("유효하지않은 나이입니다.");
                return;
            }
            this.age = age;
        }


        public void printInfo() {
            System.out.println("이름: " + name + ", 나이: " + age);
        }
    }
}