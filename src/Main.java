import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("DAMA");
        frame.setSize(800,800);
        frame.getContentPane().add(new ScacchieraGrafica());
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}