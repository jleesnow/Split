import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jay on 7/28/2015.
 */
public class EntryPanel extends JPanel{

    public static String purchase;
    public static double transAmt;


    public EntryPanel(){
        Dimension size = getPreferredSize();
        size.height = 150;
        setPreferredSize(size);
        setBorder(BorderFactory.createTitledBorder("Enter the transaction"));
// textfield
        JLabel why = new JLabel("Why?: ");
        JLabel amount = new JLabel("Amount: ");
        JButton okBtn = new JButton("Ok");
        JButton cancel = new JButton("Cancel");

        JTextField transName = new JTextField(15);
        JTextField amtField = new JTextField(5);


        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();


// why?
        gc.anchor = GridBagConstraints.LINE_END;

        gc.weightx = 0.5;
        gc.weighty = 0.0;
        gc.gridx = 0;
        gc.gridy = 0;
        add(why, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        add(amount, gc);


//text box
        gc.anchor = GridBagConstraints.LINE_START;

        gc.gridx = 1;
        gc.gridy = 0;
        add(transName, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        add(amtField, gc);



        //buttons
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weighty = 1.0; // sets into corner
        gc.anchor = GridBagConstraints.PAGE_END;

        gc.gridx = 1;
        gc.gridwidth = 1;
        gc.gridy = 2;
        add(cancel, gc);

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weighty = 0.5; // sets into corner
        gc.anchor = GridBagConstraints.PAGE_END;
        gc.insets = new Insets(10, 5, 0, 0);

        gc.gridx = 2;
        gc.gridy = 2;
        add(okBtn, gc);


        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //this will be where I save to db
                Split.frame.dispose();
            }
        });

        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //this will be where I save to db
                purchase = transName.getText();
                transAmt = Double.parseDouble(amtField.getText());
                TransactionData transactions = new TransactionData();
                Split.frame.dispose();
            }
        });
    }

}
