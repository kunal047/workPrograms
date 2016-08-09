/**
 * Created by rusk on 5/8/16.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TextField {
    JLabel label;
    JTextField textField;

    public TextField(){

        label = new JLabel("");
        textField = new JTextField("Type text here...");
        JFrame frame = new JFrame("Using TextFields");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                label.setText(textField.getText());
            }
        });

        frame.add(textField);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextField();
            }
        });
    }
}
