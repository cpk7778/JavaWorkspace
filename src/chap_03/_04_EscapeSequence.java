package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수 문자 (Escape Sequence)

        // \n : 줄바꿈
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");
        System.out.println("자바가\n너무\n재밌어요"); // \n : 줄바꿈

        // \t : 탭
        System.out.println("해물파전\t9000원"); // \t : 탭 (4칸 띄우기)
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // \는 자바에서 특수한 의미를 가지므로 \를 출력하고 싶으면 \\로 출력
        System.out.println("C:\\Program Files\\Java\\jdk-11.0.8"); // \를 출력하고 싶으면 \\를 사용 필요

        // "를 출력하고 싶으면 \"를 사용
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // '를 출력하고 싶으면 \'를 사용
        System.out.println("단비가 \'뭘 봐\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐' 라는 표정을 지었어요");

        char  c = 'A';
        c = '\'';
        System.out.println(c);

        // \b : 백스페이스
        System.out.println("123\b");


    }
}
