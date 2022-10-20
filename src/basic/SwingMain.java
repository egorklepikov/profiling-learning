package basic;

import javax.swing.*;

public class SwingMain {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(400,400);
        jFrame.setTitle("Swing Test");
        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel("Some Label1"));
        jPanel.add(new JLabel("Some Label2"));
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
