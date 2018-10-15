package Lamda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OutterClass6 extends JFrame {

    String message = "클릭";

    public OutterClass6() {
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JButton button = new JButton("버튼");
        button.setBounds(100, 100, 100, 30);
        getContentPane().add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(OutterClass6.this, message);
            }
        });
    }

    public static void main(String[] args) {
        OutterClass6 window = new OutterClass6();
        window.setVisible(true);
    }
}

