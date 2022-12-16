package Grafica;

import java.awt.*;
import javax.swing.JPanel;

public class DamieraGrafica extends JPanel {
    public static int SIZE_DAMIERA = 600;
    public static int SIZE_QUADRATI_DAMIERA = 75;

    public void paint(Graphics g) {
        g.drawRect(99,99,601,601);
        g.fillRect(100, 100, SIZE_DAMIERA, SIZE_DAMIERA);
        for (int i = 100; i <= SIZE_DAMIERA; i += 150) {
            for (int j = 100; j <= SIZE_DAMIERA; j += 150) {
                g.clearRect(i, j, SIZE_QUADRATI_DAMIERA, SIZE_QUADRATI_DAMIERA);
            }
        }

        for (int i = 175; i <= SIZE_DAMIERA+SIZE_QUADRATI_DAMIERA; i += 150) {
            for (int j = 175; j <= SIZE_DAMIERA+SIZE_QUADRATI_DAMIERA; j += 150) {
                g.clearRect(i, j, SIZE_QUADRATI_DAMIERA, SIZE_QUADRATI_DAMIERA);
            }
        }
    }

}