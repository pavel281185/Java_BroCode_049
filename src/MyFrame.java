import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setSize(300, 300);
        this.setTitle("Pavlíkovo okno");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        ImageIcon logo = new ImageIcon("logo.png");
        this.setIconImage(logo.getImage());
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(123,34,23));
    }
}
