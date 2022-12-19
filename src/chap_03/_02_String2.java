package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        // and를 ,로 바꾸기
        System.out.println(s.replace(" and",  ",")); // I like Java, Python, C.
        // 문자열 자르기 (substring)
        System.out.println(s.substring(7)); // Java and Python and C. // 7번 인덱스부터 끝까지
        System.out.println(s.substring(s.indexOf("Java"))); // Java and Python and C. // Java의 시작 인덱스부터 끝까지
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // Java and Python and C // Java의 시작 인덱스부터 .의 인덱스 전까지

        // 공백 제거
        s = "       I love Java.";
        System.out.println(s); //        I love Java.
        System.out.println(s.trim()); // I love Java. // 앞뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java,Python
        System.out.println(s1.concat(",").concat(s2)); // Java,Python // concat() 메소드 사용
    }
}
