/* Jeremiah Snow
 * 8/2/2015
 * Split Project
*/
package Split;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class EntryPanel extends JPanel{
    public EntryPanel(){
        setBorder(BorderFactory.createTitledBorder("Enter the transaction"));
        
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        JLabel whyText = new JLabel("Why?:");
        gbc.insets = new Insets(10, 0, 0, 5); //top, left, bottom, right
        add(whyText, gbc);
        
        JTextField whyField = new JTextField(10);
        gbc.insets = new Insets(10, 0, 0, 0);
        add(whyField, gbc);
        
        JLabel amtText = new JLabel("Amount:");
        gbc.insets = new Insets(10, 0, 15, 5);
        gbc.gridy = 1;
        add(amtText, gbc);
        
        JTextField amtField = new JTextField(10);
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 0, 15, 0);
        add(amtField, gbc);
        
    }

    
}
