import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class keypad {
    public static void main(String[] args) {
        JPanel grid = new JPanel(new GridLayout(4, 3, 10, 10));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("*");
        JButton b11 = new JButton("0");
        JButton b12 = new JButton("#");
        b1.setPreferredSize(new Dimension(50, 50));
        b2.setPreferredSize(new Dimension(50, 50));
        b3.setPreferredSize(new Dimension(50, 50));
        b4.setPreferredSize(new Dimension(50, 50));
        b5.setPreferredSize(new Dimension(50, 50));
        b6.setPreferredSize(new Dimension(50, 50));
        b7.setPreferredSize(new Dimension(50, 50));
        b8.setPreferredSize(new Dimension(50, 50));
        b9.setPreferredSize(new Dimension(50, 50));
        b10.setPreferredSize(new Dimension(50, 50));
        b11.setPreferredSize(new Dimension(50, 50));
        b12.setPreferredSize(new Dimension(50, 50));
        grid.add(b1);
        grid.add(b2);
        grid.add(b3);
        grid.add(b4);
        grid.add(b5);
        grid.add(b6);
        grid.add(b7);
        grid.add(b8);
        grid.add(b9);
        grid.add(b10);
        grid.add(b11);
        grid.add(b12);
        JPanel border = new JPanel(new BorderLayout());
        border.add(grid, BorderLayout.CENTER);
        border.setPreferredSize(new Dimension(500, 300));
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(border);
        f.setSize(550, 400);
        f.setVisible(true);
    }
}
