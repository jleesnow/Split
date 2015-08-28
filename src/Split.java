/**
 * Created by Jay on 7/8/2015.
 */

import javax.swing.*;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Split {
    public static JFrame frame;

    public static void main(String[] args) {

        // Beginning UI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new GUIMain("Split");
                frame.setSize(400, 450);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });

    }

}
