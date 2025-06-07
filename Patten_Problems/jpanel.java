public class jpanel {
    import java.lang.Override;
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JFrame {
    private JPanel canvas;
    private int x = 50;
    private int y = 50;
    private int xSpeed = 2;
    private int ySpeed = 2;
    private final int diameter = 20;

    public BouncingBall() {
        setTitle("Bouncing Ball");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillOval(x, y, diameter, diameter);
            }
        };

        add(canvas);

        // Timer to update the ball's position
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveBall();
                repaint();
            }
        });
        timer.start();
    }

    private void moveBall() {
        x += xSpeed;
        y += ySpeed;

        if (x <= 0 || x >= canvas.getWidth() - diameter) {
            xSpeed = -xSpeed;
        }
        if (y <= 0 || y >= canvas.getHeight() - diameter) {
            ySpeed = -ySpeed;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BouncingBall().setVisible(true);
            }
        });
    }
}

}
