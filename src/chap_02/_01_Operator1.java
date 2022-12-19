package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2 (정수 / 정수 = 정수)
        System.out.println(5 / 2); // 2 (정수 / 정수 = 정수)
        System.out.println(2 / 4); // 0 (정수 / 정수 = 정수)
        System.out.println(4 % 2); // 0 (나머지)
        System.out.println(5 % 2); // 1 (나머지)

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6 (2 + (2 * 2))
        System.out.println((2 + 2) * 2); // 8 ((2 + 2) * 2) 괄호 우선
        System.out.println(2 + (2 * 2)); // 6 (2 + (2 * 2))

        // 변수 이용 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산자 ++, --
        // 앞에 붙는 경우
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 (전위 연산자)
        System.out.println(val); // 11 (후위 연산자)
        // 뒤에 붙는 경우
        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 (후위 연산자)
        System.out.println(val); // 11 (전위 연산자)
        // 앞에 붙는 경우
        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9 (전위 연산자)
        System.out.println(val); // 9 (후위 연산자)
        // 뒤에 붙는 경우
        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10 (후위 연산자)
        System.out.println(val); // 9 (전위 연산자)

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 0
        System.out.println("대기 인원 : " + waiting++); // 1
        System.out.println("대기 인원 : " + waiting++); // 2
        System.out.println("총 대기 인원 : " + waiting); // 3
    }
}
