package chap_03;

public class _03_StringSompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals("Java")); // true // 문자열이 같으면 true 다르면 false
        System.out.println(s2.equals("python")); // false // 대소문자 구분 필요
        System.out.println(s2.equalsIgnoreCase("python")); // true // 대소문자 구분 안함

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 비밀번호
        s2 = "1234";

        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // true (참조)

        s1 = new String("1234"); // 별도 다른 메모
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false // new 연산자로 생성한 문자열은 다른 객체이므로 false
    }
}