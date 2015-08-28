import javax.swing.*;
import java.awt.*;

/**
 * Created by Jay on 7/27/2015.
 */
public class ActionsPanel extends JPanel {

    public ActionsPanel(){
        Dimension size = getPreferredSize();
        size.height = 75;
        setPreferredSize(size);
        setBorder(BorderFactory.createTitledBorder("What would you like to do?"));

        JRadioButton button;
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        button = new JRadioButton("Add");
        gc.anchor = GridBagConstraints.CENTER;
        gc.weightx = 0.5;
        gc.weighty = 0.0;
        gc.gridx = 1;
        gc.gridy = 0;
        add(button, gc);

        button = new JRadioButton("Subtract");
        gc.weighty = 0.5;
        gc.gridx = 2;
        gc.gridy = 0;
        add(button, gc);

        button = new JRadioButton("Clear");
        gc.weighty = 0.5;
        gc.gridx = 3;
        gc.gridy = 0;
        add(button, gc);

    }

}
