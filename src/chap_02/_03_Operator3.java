package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자
        // 비교 연산자는 두 개의 피연산자를 비교하여 true 또는 false를 반환한다.
        // 비교 연산자는 주로 조건문과 반복문의 조건식에 사용된다.
        System.out.println(5 > 3); // true // 5가 3보다 크다. (참이면 true 거짓이면 false)
        System.out.println(5 >= 3); // true // 5가 3보다 크거나 같다.
        System.out.println(5 >= 5); // true // 5가 5보다 크거나 같다.
        System.out.println(5 >= 7); // false // 5가 7보다 크거나 같다.

        System.out.println(5 < 3); // false // 5가 3보다 작다.
        System.out.println(5 <= 3); // false // 5가 3보다 작거나 같다.

        System.out.println(5 == 5); // true // 5와 5가 같다.
        System.out.println(5 == 3); // false // 5와 3이 같다.
        System.out.println(5 != 5); // false // 5와 5가 같지 않다.
        System.out.println(5 != 3); // true // 5와 3이 같지 않다.
    }
}
