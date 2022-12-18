package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "홍길동";
        int hour = 15;
        System.out.println(name + "님. 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님. 배송이 완료되었습니다."); //변수 재사용

        double score = 90.5; //실수
        char grade = 'A'; //문자
        name = "강백호"; // 문자열 변경
        System.out.println(name + "님의 평균 점수는 " + score + "입니다."); //연산 더하기
        System.out.println(name + "님의 학점은 " + grade + "입니다."); //연산 더하기

        boolean pass = true; //논리
        System.out.println("합격 여부: " + pass); //연산 더하기

        double d = 3.24123456789; //실수
        float f = 3.14123456789F; //실수 + F
        System.out.println(d); //실수 출력
        System.out.println(f); //실수 출력

        long l = 1000000000000L;//정수 + L -> 21억 이상일 경우
        l = 1_000_000_000_000l;//정수 자리 구분자
        System.out.println(l); //정수 출력
    }
}
