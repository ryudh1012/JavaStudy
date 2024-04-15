import java.util.Scanner;

public class Quiz2 {
    public static void main(String[ ] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        int i;
        int hap = 0;

        System.out.print("첫 번째 : ");
        a = s.nextInt();
        System.out.print("두 번째 : ");
        b = s.nextInt();

        if (a > b) {
            for (i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    hap = hap + i;
                }
            }
            System.out.println(hap);
        }
        if (a < b) {
            for (i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    hap = hap + i;
                }
            }
            System.out.println(hap);
        }
        s.close();
    }
}
