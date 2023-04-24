import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    MyFrame(){
        ImageIcon icon = new ImageIcon("medusa.png");
        button = new JButton();
        button.setBounds(200,100,500,500);
        button.addActionListener(e -> System.out.println("Epicness!"));
        button.setText("Press Me Please!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        button.setForeground(new Color(250, 0, 0, 0));
        button.setIconTextGap(50);
        this.setTitle("Microsoft Word");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setLayout(null);
        this.setVisible(true);
        
        this.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
