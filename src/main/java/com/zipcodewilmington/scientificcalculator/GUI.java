package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;

public class GUI {
    public static void GUI(String[] args){
        // JFrame to add component

        String operator = JOptionPane.showInputDialog("Enter an operator:");
        JOptionPane.showMessageDialog(null, "Operator"+ operator);

        //JFrame jFrame = new JFrame(); // to create a frame
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        JOptionPane.showMessageDialog(null, "Number"+number);

    }




}


