import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by Jay on 7/27/2015.
 */
public class NamePanel extends JPanel{

    public NamePanel(){
        Dimension size = getPreferredSize();
        size.height = 140;
        setPreferredSize(size);
        setBorder(BorderFactory.createTitledBorder("Who owes who money?"));

        JRadioButton button;
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        button = new JRadioButton("Bob");
        gc.anchor = GridBagConstraints.CENTER;
        gc.weightx = 0.5;
        gc.weighty = 0.0;
        gc.gridx = 1;
        gc.gridy = 0;
        add(button, gc);

        button = new JRadioButton("Sue");
        gc.weighty = 0.5;
        gc.gridx = 3;
        gc.gridy = 0;
        add(button, gc);
    }
}
