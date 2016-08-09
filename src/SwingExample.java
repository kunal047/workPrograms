/**
 * Created by rusk on 5/8/16.
 */

import javax.swing.*;

public class SwingExample {

    SwingExample(){
        JFrame frame = new JFrame("Hello, World! Application");
        frame.setSize(100, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello, World! ");
        frame.add(label);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingExample();
            }
        });
    }
}
