package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 어린이 키에 따른 놀이 기구 탑승 가능 여부 확인 프로그램
        // 어린이 키가 120cm 이상이면 놀이기구에 탑승 가능
        // 어린이 키가 120cm 미만이면 놀이기구에 탑승 불가능
        // 어린이 키가 120cm 이상이면 "놀이기구에 탑승 가능합니다." 출력
        // 어린이 키가 120cm 미만이면 "놀이기구에 탑승 불가능합니다." 출력
        int height = 120;
        String result = height >= 120 ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 " + height + "이므로 " + result);
    }
}
