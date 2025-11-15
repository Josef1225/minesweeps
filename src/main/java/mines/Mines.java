package mines;

import javax.swing.*;
import java.awt.*;

public class Mines extends JFrame {
    private static final long serialVersionUID = 4772165125287256837L;

    public static final int FRAME_WIDTH = 250;
    public static final int FRAME_HEIGHT = 290;

    public JLabel statusbar;

    public Mines() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Minesweeper");

        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);

        add(new Board(statusbar));

        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Mines();
    }
}
