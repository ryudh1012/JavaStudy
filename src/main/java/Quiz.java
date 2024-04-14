import java.util.Scanner;

public class Quiz {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in); //숫자를 입력 받기 위한 Scanner 사용
        int a, b; //정수 변수 a, b 선언
        int i; // 반복 변수 i 선언
        int hap = 0; //합계를 누적할 변수 hap을 선언하고 0으로 초기화

        a = s.nextInt(); //a에 값을 입력 받음
        b = s.nextInt(); //b에 값을 입력 받음

        for (i = a; i <= b; i++) { //a부터 b까지 1씩 증가시키며 반복
            if (i % 2 != 0) { //만약 i를 2로 나누었을 때 나머지가 0이 아니라면(홀수라면)
                hap = hap + i; //위가 참이면 실행, hap 변수에 a부터 b까지 반복해 누적
            }
        }
        System.out.println(a + "부터 " + b + "까지의 홀수의 합 : " + hap); //결과를 출력
    }
}