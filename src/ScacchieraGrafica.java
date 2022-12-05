import java.awt.*;
import javax.swing.JPanel;

public class ScacchieraGrafica extends JPanel {
    public static int SIZE_SCACCHIERA = 600;
    public static int SIZE_QUADRATI_SCACCHIERA = 75;

    public void paint(Graphics g) {
        g.setColor(Color.decode("#654321"));
        g.drawRect(99,99,601,601);
        g.fillRect(100, 100, SIZE_SCACCHIERA, SIZE_SCACCHIERA);
        for (int i = 100; i <= SIZE_SCACCHIERA; i += 150) {
            for (int j = 100; j <= SIZE_SCACCHIERA; j += 150) {
                g.clearRect(i, j, SIZE_QUADRATI_SCACCHIERA, SIZE_QUADRATI_SCACCHIERA);
            }
        }

        for (int i = 175; i <= SIZE_SCACCHIERA+SIZE_QUADRATI_SCACCHIERA; i += 150) {
            for (int j = 175; j <= SIZE_SCACCHIERA+SIZE_QUADRATI_SCACCHIERA; j += 150) {
                g.clearRect(i, j, SIZE_QUADRATI_SCACCHIERA, SIZE_QUADRATI_SCACCHIERA);
            }
        }
    }
}