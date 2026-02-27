package org.example.test8;
// TODO: send(String message) 추상 메서드를 가진 Notification 인터페이스를 작성하시오.

// TODO: Notification 인터페이스를 구현하는 EmailNotification 클래스를 작성하시오.
// send 메서드는 "이메일 발송: [메시지]" 형식으로 출력합니다.
class  EmailNotification implements Notification{
    public void send(String message){
        System.out.printf("이메일 발송: [메시지]"+message);
    }

}
// TODO: Notification 인터페이스를 구현하는 SmsNotification 클래스를 작성하시오.
// send 메서드는 "SMS 발송: [메시지]" 형식으로 출력합니다.
class SmsNotification implements Notification{
    public void send(String message){
        System.out.printf("SMS 발송: [메시지]"+message);
    }
}



public class Notifier {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        email.send("주문이 완료되었습니다.");

        Notification email1 =new SmsNotification();
        email1.send("배송이 시작되었습니다.");


        // TODO: EmailNotification 객체를 생성하고 "주문이 완료되었습니다." 메시지를 보내시오.
        // TODO: SmsNotification 객체를 생성하고 "배송이 시작되었습니다." 메시지를 보내시오.
    }
}
