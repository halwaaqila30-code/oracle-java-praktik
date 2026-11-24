import java.awt.*;
import javax.swing.*;

public class DrawTriangles extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Segitiga 1 (Biru)
        int[] x1 = {70, 30, 110};
        int[] y1 = {40, 130, 130};
        g.setColor(Color.BLUE);
        g.fillPolygon(x1, y1, 3);

        // Segitiga 2 (Merah)
        int[] x2 = {210, 170, 250};
        int[] y2 = {40, 130, 130};
        g.setColor(Color.RED);
        g.fillPolygon(x2, y2, 3);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Two Triangles");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.add(new DrawTriangles());
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}