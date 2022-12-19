package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 삼항 연산자는 조건식 ? 식1 : 식2의 형태로 사용된다.
        // 결과 = (조건) ? (참) : (거짓)
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y; // x가 y보다 크면 x를 max에 대입하고, 그렇지 않으면 y를 max에 대입한다.
        System.out.println(max); // 5

        int min = (x < y) ? x : y; // x가 y보다 작으면 x를 min에 대입하고, 그렇지 않으면 y를 min에 대입한다.
        System.out.println(min); // 3

        boolean b = (x == y) ? true : false; // x와 y가 같으면 true를 b에 대입하고, 그렇지 않으면 false를 b에 대입한다.
        System.out.println(b); // false

        String s = (x != y) ? "달라요" : "같아요"; // x와 y가 같지 않으면 "달라요"를 s에 대입하고, 그렇지 않으면 "같아요"를 s에 대입한다.
        System.out.println(s); // 달라요

    }
}
