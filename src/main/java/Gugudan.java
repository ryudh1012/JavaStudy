public class Gugudan {
    public static void main(String[] args) {
        for (int i = 1; i <= 72; i++) { // 2*1부터 9*9까지 i를 72번 반복
            int row = (i - 1) / 8 + 1; // 현재 반복 횟수를 8로 나눈 몫을 구한 뒤 1을 더해주면 1부터 9까지의 행 값을 얻을 수 있음.
            int col = (i - 1) % 8 + 2; // 현재 반복 횟수를 8로 나눈 나머지를 구한 뒤 2를 더하면 2부터 9까지의 열 값을 얻을 수 있음.

            System.out.printf("%d * %d = %2d\t", col, row, col * row); //printf를 사용하여 col * row = 결과의 형식으로 출력, 결과값이 두 자리 수일 때 자리 맞춤을 위해 %2d 사용.

            if (col == 9) { //col이 9일 때(한 행의 마지막 단의 곱셈 결과를 출력한 후)에는 줄을 바꿈.
                System.out.println();
            }
        }
    }
}
