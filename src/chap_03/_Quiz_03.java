package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 주민등록 번호에서 생년월일 및 성별까지만 출력
        // 번호는 총 13자리로 구성되며 - 포함 14자리
        // 8번째 문자열까지만 출력
        String s = "990929-1010123";
        System.out.println(s.substring(0, 8)); // 0 위치부터 8위치 진전까지
        // 하이픈 위치 시둥
        System.out.println(s.substring(0, s.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 +2의 직전까지

    }
}
