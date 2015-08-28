import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jay on 7/27/2015.
 */
public class GUIMain extends JFrame{

    private NamePanel namePanel;
    private ActionsPanel actionsPanel;
    private EntryPanel entryPanel;

    public GUIMain(String title){
        super(title);

        // Set layout manager
        setLayout(new BorderLayout());

        // Create swing componenets
        namePanel = new NamePanel();
        actionsPanel = new ActionsPanel();
        entryPanel = new EntryPanel();


        // Add Swing components to content pane
        Container c = getContentPane();

        c.add(namePanel, BorderLayout.NORTH);
        c.add(actionsPanel, BorderLayout.CENTER);
        c.add(entryPanel, BorderLayout.SOUTH);
    }
}

