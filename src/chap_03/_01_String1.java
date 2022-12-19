package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s); // 문자열 출력 (I like Java and Python and C.)

        // 문자열 길이 출력
        System.out.println(s.length()); // 27

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // I LIKE JAVA AND PYTHON AND C.
        System.out.println(s.toLowerCase()); // i like java and python and c.

        // 포함 관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#")); // false
        System.out.println(s.indexOf("Java")); // 7 // Java의 시작 인덱스 // 0부터 시작 // 없으면 -1
        System.out.println(s.lastIndexOf("and")); // 20 // and의 마지막 인덱스 // 0부터 시작 // 없으면 -1
        System.out.println(s.startsWith("I")); // true // I로 시작하는지 // 대소문자 구분
        System.out.println(s.endsWith("C.")); // true // C.로 끝나는지 // 대소문자 구분

    }
}
