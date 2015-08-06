/* Jeremiah Snow
 * 8/2/2015
 * Split Project
*/
package Split;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIMain extends JFrame{
    private NamePanel namePanel;
    private ActionPanel actionPanel;
    private EntryPanel entryPanel;
    
    public GUIMain(String title){
        super(title);
        
        namePanel = new NamePanel();
        actionPanel = new ActionPanel();
        entryPanel = new EntryPanel();
        
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1;
        
        add(namePanel, gbc);
        add(actionPanel, gbc);
        add(entryPanel, gbc);
        
        JButton button = new JButton("Ok");
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        gbc.insets = new Insets(10, 5, 5, 5);
        add(button, gbc);
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //this will be where I save to db
                Split.frame.dispose();
            }
        });
        
        
    
    }
    
    
}
