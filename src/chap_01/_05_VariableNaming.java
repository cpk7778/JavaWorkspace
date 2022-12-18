package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어는 사용 불가 (public, statis, void, int, double, float, ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "현성"; // 이름
        String lastName = "김"; // 성
        String datOfBirth = "1978-07-11"; // 생년월일
        String residentialAddress = "서울시 강남구 역삼동"; // 거주지 주소
        String purposeOfVisit = "관광"; // 방문 목적
        String flightNo = "KE657"; // 항공편 번호
        String _flightNo = "KE657"; // 항공편 번호
        String flight_no_2 = "KE6567"; // 항공편 번호
//        String -flightNo = "KE657"; // 항공편 번호

        int accompany = 2; // 동행인 수
        int lengthOfStay = 7; // 체류 기간

        String item1 = "시계";
        String item2 = "가방";
//        String 3item = "컴퓨터";

        // 프로그램의 흐름을 위해 사용되는 경우 등
        int i = 0;
        String s = "Hello";
        String str = "Hello";

        // 상수
        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
//        CODE = "US"; // 에러 발생

    }
}
