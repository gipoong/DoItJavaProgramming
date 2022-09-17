package chapter8;

public class OverridingTest2 {
    public static void main(String[] args) {
        Customer vc = new VIPCustomer(10030, "나몰라", 2000); // VIP 고객 생성
        vc.bonusPoint = 1000;

        System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원 입니다.");
        // 나몰라 님이 지불해야 하는 금액은 9000원 입니다.

        VIPCustomer vipC = new VIPCustomer(10030, "hello", 2000);

        vipC.helloWorld();

        // vc.helloWorld(); 는 실행되지 않음 부모 객체에 VIPCustomer 인스턴스 이므로..!
        // 하지만 부모 객체에 자식 인스턴스 일 때 Override 한 메소드를 호출하면 자식 메소드로 호출

    }
}
