public class Lab06_03 {
    public static void main(String[] args){
        int count = 0;
        int dice1, dice2, dice3;

        while(true){
            count ++;
            dice1 = (int)(Math.random()*6 + 1);
            dice2 = (int)(Math.random()*6 + 1);
            dice3 = (int)(Math.random()*6 + 1);

            if ((dice1 == dice2) && (dice2 == dice3))
                    break;
        }
        System.out.println("3개 주사위는 모두 " + dice1 + "입니다." );
        System.out.println("같은 숫자가 나올 때까지 " +count+"번 던졌습니다.");
    }
}
