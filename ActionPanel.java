/* Jeremiah Snow
 * 8/2/2015
 * Split Project
*/
package Split;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ActionPanel extends JPanel{
    
    public ActionPanel(){
        setBorder(BorderFactory.createTitledBorder("What would you like to do?"));
        
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Create radio buttons
        JRadioButton addButton = new JRadioButton("Add");
        gbc.insets = new Insets(10, 20, 10, 5);
        add(addButton, gbc);
        
        JRadioButton subButton = new JRadioButton("Subtract");
        gbc.insets = new Insets(10, 10, 10, 10);
        add(subButton, gbc);
        
        JRadioButton clearButton = new JRadioButton("Clear");
        gbc.insets = new Insets(10, 5, 10, 20);
        add(clearButton, gbc);
        
        
        // Actions
        addButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //adds to current total
            }
        });
        subButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //subtracts from current total
            }
        });
        clearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //clears current total
            }
        });
    }
    
}
