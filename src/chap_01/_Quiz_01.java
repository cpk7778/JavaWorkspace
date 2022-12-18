package chap_01;
/*
[ 실행 결과 ]
상암08번 버스
약 3분 후 도착
낭은 거리 1.2km
 */
public class _Quiz_01 {
    public static void main(String[] args) {
        // 변수 정의
        String busNo = "상암08"; // 버스 번호
        int remainTime = 3; // 남은 시간(분)
        double remainDist = 1.5; // 남은 거리(km)
        // 출력
        System.out.println(busNo + "번 버스가");
        System.out.println("약 " + remainTime + "분 후 도착");
        System.out.println("남은 거리는 " + remainDist + "km");
    }
}
