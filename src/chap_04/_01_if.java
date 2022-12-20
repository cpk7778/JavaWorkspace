package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 (If)
        // 오후 2시 이후 커피 주문 X
        int hour = 13; // 오전 10시
        if (hour < 14) { // If 조건 복수 적용 시 중괄호 {} 추가
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료");

        // 커피 두 잔 마실 경우 + 14시 이전인지 확인
        hour = 10; // 오전 10시
        boolean morningCoffee = true; // 모닝 커피
        if (hour < 14 && morningCoffee == false){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");
    }
}
