import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("This is my epic frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280, 720);
        this.setResizable(true);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(80,0,255));
    }
}
