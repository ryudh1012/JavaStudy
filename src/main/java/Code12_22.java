import javax.swing.*;

public class Code12_22 {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("사용자 정의");
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);

        String[] strAry = {"뉴진스", "블랙핑크", "트와이스", "(여자)아이들" };
        int result = JOptionPane.showOptionDialog(frame, "좋아하는 가수는?", "제목",
                JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, strAry, null);

        JOptionPane.showMessageDialog(frame, strAry[result] + " 선택함 ");
    }
}
