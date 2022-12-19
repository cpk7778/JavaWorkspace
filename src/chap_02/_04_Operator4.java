package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        // 논리 연산자는 두 개의 피연산자를 비교하여 true 또는 false를 반환한다.
        // 논리 연산자는 주로 조건문과 반복문의 조건식에 사용된다.
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // true // or 조건 // 김치찌개 또는 계란말이 또는 제육볶음이 참이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // true // and 조건 // 김치찌개 또는 계란말이 또는 제육볶음이 모두 참이면 true

        // And 연산 (&&)
        System.out.println((5 > 3) && (3 > 1)); // true // 괄호 안의 조건이 모두 참이면 true // 5가 3보다 크고 3이 1보다 크다.
        System.out.println((5 > 3) && (3 > 1)); // true // 괄호 안의 조건이 모두 참이면 true // 5가 3보다 크고 3이 1보다 크다.

        // Or 연산 (||)
        System.out.println((5 > 3) || (3 > 1)); // true // 괄호 안의 조건 중 하나라도 참이면 true // 5가 3보다 크거나 3이 1보다 크다.
        System.out.println((5 > 3) || (3 < 1)); // true // 괄호 안의 조건 중 하나라도 참이면 true // 5가 3보다 크거나 3이 1보다 작다.
        System.out.println((5 < 3) || (3 <1 )); // false // 괄호 안의 조건 중 하나라도 참이면 true // 5가 3보다 작거나 3이 1보다 작다.

        // Not 연산 (!)
        System.out.println(!true); // false // true가 아니면 false
        System.out.println(!false); // true // false가 아니면 true
        System.out.println(!(5 == 5)); // false // 5가 5와 같지 않으면 true
        System.out.println(!(5 == 3)); // true // 5가 3과 같지 않으면 true


    }
}
