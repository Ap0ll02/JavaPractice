import javax.swing.*;
import java.awt.*;
public class Practice {
    public static int buttonStat = 0;
    public static void main(String[] args) {

        //TODO: Figure out what is going on what's going on with the button scaling!

        //Create JFrame and call method to setup basics
        JFrame frame = new JFrame("The Window");
        Practice p = new Practice();
        p.createFrame(frame);
        frame.setVisible(true);
        
        //Create JLabel title and call method to fill in info
        JLabel title = new JLabel("Welcome to our adventure!");
        p.createLabel(title); //Method sets title and other chracteristics.
        frame.add(title); 

        //Create and run button creation method.
        JButton button = new JButton();
        p.createButton(button);
        frame.add(button);

        //Button Listener Changes The scene of everything via Lambda function ->. 
        button.addActionListener(e -> p.SceneRunner(button, title, frame));
    }

    //FRAME STUFF
    void createFrame(JFrame frame){
        frame.setResizable(false);
        frame.setSize(1280, 720);
        frame.setBackground(new Color(50, 80, 50));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //LABEL STUFF
    void createLabel(JLabel title){
        title.setHorizontalTextPosition(JLabel.CENTER);
        title.setVerticalTextPosition(JLabel.TOP);
        //title.setHorizontalAlignment(JLabel.CENTER);
        //title.setVerticalAlignment(JLabel.TOP);
        title.setBounds(340, 80, 850, 100);
        title.setFont(new Font("Phosphate", Font.ITALIC, 48));
    }
    
    //BUTTON STUFF
    void createButton(JButton button){
        button.setText("Begin Adventure");
        button.setFont(new Font("Phosphate", Font.BOLD, 36));
        button.setForeground(new Color(0, 50, 200));
        button.setBounds(440, 450, 450, 150);
        button.setFocusable(true);
    }

    //Attempting to remake the scene.
    void SceneRunner(JButton button, JLabel label, JFrame frame){
        if(buttonStat == 0){
            label.setText("Quien es tu persona favorita");
            button.setText("Micaela");
            button.setBounds(440, 450, 450, 150);
            button.setFocusable(true);
        }
        else if(buttonStat == 1){
            label.setText("You made it farther!");
            button.setText("Great!");
            button.setBounds(440, 450, 450, 150);
            button.setFocusable(true);
        }
        buttonStat++;
    }
}
