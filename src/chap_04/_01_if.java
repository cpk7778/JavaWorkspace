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
        System.out.println("커피 주문 완료 #1");

        // 커피 두 잔 마실 경우 + 14시 이전인지 확인
        hour = 10; // 오전 10시
        boolean morningCoffee = false; // 모닝 커피
//        if (hour < 14 && morningCoffee == false){
        if (hour < 14 && !morningCoffee){ // And 연산자 && 추가 // boolean 앞에 ! 추가 -> 부정
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // 오후 2시 이후 또는 모닝 커피를 마신 경우
        hour = 15;
        morningCoffee = true;
//        if (hour >= 14 || morningCoffee == true) { // or 연산자 || 추가 // boolean 그냥 입력 긍정
        if (hour >= 14 || morningCoffee) { // or 연산자 || 추가 // boolean 그냥 입력 긍정
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
