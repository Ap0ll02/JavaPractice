import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
public class Practice {
    public static void main(String[] args) {
        //JFrame Practice
        MyFrame myFrame = new MyFrame(); //Frame Tutorial Found in MyFrame.java
        
       
        //JLabel Tests
        MyLabel label = new MyLabel(); //Create a label
        myFrame.add(label);

        //JPanel For Sectioning Parts of a Frame
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel(null, false);
        JPanel panel3 = new JPanel(null, false);
        panel1.setBackground(new Color(255, 120, 100));
        panel2.setBackground(Color.green);
        panel3.setBackground(new Color(0,0,120));
        panel1.setBounds(50, 0, 50, 110);
        panel2.setBounds(520, 0, 250, 250);
        panel3.setBounds(0, 800, 400, 33);
        panel1.add(label);
        panel1.setLayout(new BorderLayout(5, 5));
        myFrame.add(panel1);
        myFrame.add(panel2);
        myFrame.add(panel3);
    }
}
