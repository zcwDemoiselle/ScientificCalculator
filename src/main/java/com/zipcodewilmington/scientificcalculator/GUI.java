package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;

public class GUI {
    public static void GUI(String[] args){
        // JFrame to add component

        String operator = JOptionPane.showInputDialog("Choose the operator: +, -, *, /, x2, √x, 1/x, switchsign, Sine, Cosine, Tangent,Inverse Inverse Sine, Inverse Cosine,Inverse Tangent ");
        JOptionPane.showMessageDialog(null, "Operator"+ operator);

        //JFrame jFrame = new JFrame(); // to create a frame
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        JOptionPane.showMessageDialog(null, "Number"+number);

    }




}


