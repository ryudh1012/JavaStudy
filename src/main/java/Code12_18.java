import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Code12_18 {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("툴바");
        frame.setLayout(new FlowLayout());

        JToolBar toolBar = new JToolBar();
        JButton newItem = new JButton("새 문서");
        JButton openItem = new JButton("열기");
        JButton closeItem = new JButton(new ImageIcon("c:/FisrtJava/images/exit.png"));

        frame.add(toolBar, BorderLayout.NORTH);
        toolBar.add(newItem);
        toolBar.add(openItem);
        toolBar.addSeparator(new Dimension(20, 10));
        toolBar.add(closeItem);

        JLabel label = new JLabel("여기 글자가 바뀝니다.");
        frame.add(label);

        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("[새 문서]를 선택했어요.");
            }
        });

        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("[열기]를 선택했어요.");
            }
        });

        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
