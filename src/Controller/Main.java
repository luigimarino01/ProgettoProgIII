package Controller;

import Model.Damiera;
import Utility.DamieraLogica;
import Utility.PedinaLogica;
import View.DamieraGrafica;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    public static void main(String[] args) {
       DamieraGrafica damieraGrafica = new DamieraGrafica();
        DamieraLogica damieraLogica = new DamieraLogica();
        JFrame frame = new JFrame();
        frame.setTitle("DAMA");
        frame.setSize(800,800);
        frame.getContentPane().add(damieraGrafica);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
