public class Problem1 {
    public static void main(String[] args){
        for (int i=1; i<=4; i++){//4단만큼 반복하기 위한 반복문 //4줄 생성 (2번째 값 i가 반복 횟수)
            for (int j=0; j<4-i; j++){//해당 행에서의 공백을 위한 반복문 //공백 생성 (2번째 값 처음에 왼쪽 공백 갯수 - 1, 초기에는 0이므로 그값이 그대로 나옴)
                System.out.print(" ");
            }
            for (int j=0; j<2*i-1; j++){ //해당 행에서의 별을 찍기 위한 반복문//2번째 공식 : 2의배수 증가*반복횟수 + 1(홀수배열) 별찍기
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }
