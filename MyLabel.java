import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;
public class MyLabel extends JLabel {
    MyLabel(){
        ImageIcon lblPic = new ImageIcon("hacker.png");
        Border border = BorderFactory.createLineBorder(new Color(0xFFFFFF),3);
        this.setText("Good Morning Brother"); //Set text of label
        this.setIcon(lblPic);
        this.setHorizontalTextPosition(JLabel.RIGHT);
        this.setVerticalTextPosition(JLabel.CENTER);
        this.setForeground(new Color(200,125,100)); //Set Text Color
        this.setFont(new Font("MV Boli", Font.BOLD, 20));
        this.setIconTextGap(230);
        this.setBackground(new Color(0x112122));
        this.setOpaque(true);
        this.setBorder(border);
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.CENTER);
    }
}
