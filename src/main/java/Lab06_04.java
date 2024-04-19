import java.util.Scanner;

public class Lab06_04 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int computer, user;

        for (int i=1; i<=10; i++) {
            computer = (int)(Math.random()*5 + 1);
            System.out.println("게임 " + i + "회");
            System.out.print("컴퓨터가 생각한 숫자는? : ");
            user = s.nextInt();

            if (computer == user) {
                System.out.println("맞혔네요. 축하합니다!");
                break;
            } else {
                System.out.println("아까워요 " + computer + "였는데요. 다시 해보세요.");
                continue;
            }
        }
        System.out.println("게임을 마칩니다.");
        s.close();
    }
}
