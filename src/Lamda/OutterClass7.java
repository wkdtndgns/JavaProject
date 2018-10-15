package Lamda;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OutterClass7 extends JFrame {

    String message = "클릭";

    public OutterClass7() {
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JButton button = new JButton("버튼");
        button.setBounds(100, 100, 100, 30);
        getContentPane().add(button);

        button.addActionListener(e -> { JOptionPane.showMessageDialog(OutterClass7.this, message); });
    }

    public static void main(String[] args) {
        OutterClass7 window = new OutterClass7();
        window.setVisible(true);
    }
}

