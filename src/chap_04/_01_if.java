package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 If
        // 오후 2시 이후 커피 주문 X
        int hour = 13; // 오전 10시
        if (hour < 14) { // If 조건 복수 적용 시 중괄호
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료");
    }
}
