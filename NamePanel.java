/* Jeremiah Snow
 * 8/2/2015
 * Split Project
*/
package Split;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class NamePanel extends JPanel{
    public NamePanel(){
        setBorder(BorderFactory.createTitledBorder("Who owes who money?"));
        
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        JRadioButton bobButton = new JRadioButton("Bob");
        gbc.insets = new Insets(10, 10, 10, 10);
        add(bobButton,gbc);
        
        JRadioButton sueButton = new JRadioButton("Sue");
        gbc.insets = new Insets(10, 10, 10, 10);
        add(sueButton, gbc);
        
        
        
        
        bobButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //sets to bob
            }
        });
        
        sueButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //sets to sue
            }
        });
    }
        
    
}
