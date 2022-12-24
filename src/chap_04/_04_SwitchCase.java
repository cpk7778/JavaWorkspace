package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 석차에 따은 장학금 지급
        // 1등 전액 장학금
        // 2등 반액 장학금
        // 3등 1/3 장학금
        // 그 외 : 장학금 대상 아님

        // if else 문을 이용 // 여러 조건 또는 범위를 비교할 때
        int rank = 1;
        if (rank == 1) {
            System.out.println("전액 장학금");
        } else if (rank == 2) {
            System.out.println("반액 장학금");
        } else if (rank == 3) {
            System.out.println("1/3 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }

        // switch case 문을 이용 // 단일 조건을 비교할 때 // 명확한 케이스에 사용
        rank = 2;
        switch (rank) {
            case 1: // rank == 1
                System.out.println("전액 장학금");
                break;
            case 2: // rank == 2
            case 3: // rank == 3
                System.out.println("반액 장학금");
                break;
            default: // rank == 1, 2, 3 이외의 값
                System.out.println("장학금 대상 아님");
        }
        System.out.println("#2 장학금 지급 완료 #2\n");

        // 중고 상품 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 1; // 등급
        int price = 7000;// 기본 가격
        switch (grade) {
            case 1:
                price += 1000; // price = price + 1000;
            case 2:
                price += 1000; // price = price + 1000;
            case 3:
                price += 1000; // price = price + 1000;
                break;
        }
        System.out.println("상품 가격 : " + price);

        // 중고 상품 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int score = 85;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
