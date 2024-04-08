import java.util.Scanner;
public class Study1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a, b;

        System.out.print("첫번째 : ");
        a = s.nextInt();
        System.out.print("두번째 : ");
        b = s.nextInt();

        if (a > b) {
            System.out.println("a가 b보다 큽니다");
        } else if (a == b) {
            System.out.println("a와 b는 같습니다.");
        } else if (a < b) {
            System.out.println("a가 b보다 작습니다");
        }
    }
}
