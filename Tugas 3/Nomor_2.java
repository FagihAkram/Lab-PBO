
// import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Untuk memanggil masing-masing class yang diinginkan
 */
public class Nomor2 {

    public void Border_Layout() {
        JFrame frame = new JFrame("setBorderLayout");
        JButton btn1 = new JButton("One");
        JButton btn2 = new JButton("Five");
        JButton btn3 = new JButton("Three");
        JButton btn4 = new JButton("Two");
        JButton btn5 = new JButton("Four");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.SOUTH);
        frame.add(btn3, BorderLayout.CENTER);
        frame.add(btn4, BorderLayout.WEST);
        frame.add(btn5, BorderLayout.EAST);

        frame.pack();
        frame.setVisible(true);
    }

    public void Flow_Layout() {
        JFrame frame = new JFrame("setFlowLayout");
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());
        frame.add(new JButton("One"));
        frame.add(new JButton("Two"));
        frame.add(new JButton("Three"));
        frame.add(new JButton("Four"));
        frame.add(new JButton("Five"));

        frame.setVisible(true);
    }

    public void Grid_Layout() {
        JFrame frame = new JFrame("set GridLayout");
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JButton("One"));
        frame.add(new JButton("Two"));
        frame.add(new JButton("Three"));
        frame.add(new JButton("Four"));
        frame.add(new JButton("Five"));

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Border_Layout();
                new Flow_Layout();
                new Grid_Layout();
            }
        });
    }
}
