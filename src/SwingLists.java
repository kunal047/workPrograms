/**
 * Created by rusk on 5/8/16.
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class SwingLists {

    JLabel label;
    JList list;
    String[] nycsites;

    public SwingLists(){
        label = new JLabel("");
        nycsites = new String[]{"Empire State Building", "Ground Zero",
                "Statue of Liberty", "Wall Street"};
        list = new JList(nycsites);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = list.getSelectedIndex();
                if (index != -1){
                    label.setText("Site to visit " + nycsites[index]);
                }
            }
        });

        JFrame frame = new JFrame("Using Lists ");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(list);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingLists();
            }
        });
    }
}

