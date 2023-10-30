package com.zipcodewilmington.scientificcalculator;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public static void main(String[] args) {
        // Create an array of button labels
//        String[] buttons = {
//                "7", "8", "9", "/",
//                "4", "5", "6", "*",
//                "1", "2", "3", "-",
//                "0", ".", "=", "+",
//                "sin", "cos", "tan", "asin",
//                "acos", "atan", "sqrt", "mod",
//                "log", "ln", "!", "%"
//        };

        // Create the JOptionPane with grid layout
        JOptionPane optionPane = new JOptionPane();
        optionPane.setLayout(new java.awt.GridLayout(5, 5));

        // Create and add buttons to the JOptionPane
//        for (String button : buttons) {
//            JButton btn = new JButton(button);
//            btn.addActionListener(new ButtonClickListener(button));
//            optionPane.add(btn);
//        }

        // Show the JOptionPane
        JOptionPane.showMessageDialog(null, optionPane, "Demoiselle Calculator", JOptionPane.PLAIN_MESSAGE);
    }

    // ActionListener for button clicks
    private static class ButtonClickListener implements ActionListener {
        private String buttonText;

        public ButtonClickListener(String buttonText) {
            this.buttonText = buttonText;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            if (buttonText.equals("sin")) {
//                Console.sine();
//            }
//            else if (buttonText.equals("cos")) {
//                Console.cosine();
//            }
        }
    }
}
