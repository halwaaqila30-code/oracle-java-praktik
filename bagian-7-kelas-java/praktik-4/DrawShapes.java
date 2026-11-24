import java.awt.*;
import javax.swing.*;

public class DrawShapes extends JPanel {
    private final Font font;
    private final Color darkGrayColor;
    private final Color lightGrayColor;
    private final Color backgroundColor;

    public DrawShapes() {
        font = new Font("Arial", Font.ITALIC, 18);
        darkGrayColor = Color.DARK_GRAY;
        lightGrayColor = Color.LIGHT_GRAY;
        backgroundColor = Color.WHITE;
        setBackground(backgroundColor);
    }

    @Override
    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph);

        graph.setFont(font);
        graph.setColor(Color.BLACK);
        graph.drawString("Draw Shapes", 90, 20);

        graph.setColor(darkGrayColor);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);

        graph.setColor(Color.GRAY);
        graph.fillArc(110, 110, 50, 50, 0, 360);

        graph.setColor(Color.BLACK);
        graph.drawRect(50, 50, 50, 50);

        graph.setColor(lightGrayColor);
        graph.fillRect(50, 50, 60, 60);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Draw Shapes - Hitam Putih Abu");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(320, 300);
            frame.add(new DrawShapes());
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}