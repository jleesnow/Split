/* Jeremiah Snow
 * 8/2/2015
 * Split Project
*/

package Split;

import javax.swing.*;

public class Split {
    public static JFrame frame;
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                frame = new GUIMain("Split");
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
    
}
