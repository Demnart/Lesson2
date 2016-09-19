package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Артем on 19.09.2016.
 */
public class MyWindow extends JFrame {
    public MyWindow() throws HeadlessException {
// awt --> swing --> javaFX движки GUI
        setVisible(true);
        setSize(400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaDive");
//        JButton jButton = new JButton("learn Java");
        add(new JButton("Learn Java Center"), BorderLayout.CENTER);
        add(new JButton("Learn Java SOUTH"), BorderLayout.SOUTH);
        add(new JButton("Learn Java NORTH"), BorderLayout.NORTH);
        add(new JButton("Learn Java WEST"), BorderLayout.WEST);
        add(new JButton("Learn Java EAST"), BorderLayout.EAST);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
