package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Артем on 19.09.2016.
 */
public class MyWindow1 extends JFrame {
    static  JTextArea textArea;
    public MyWindow1() throws HeadlessException {
// awt --> swing --> javaFX движки GUI
        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaDive");

        textArea = new JTextArea();
        add(textArea);
        for (int i = 0; i < 20; i++) {
            textArea.append(" just do it\n");

        }

        setVisible(true);

    }


}
