package edu.smg;

import javax.swing.JOptionPane;

public class input02 {
    public static void main(String[] args) {
        
//        JOptionPane.showMessageDialog(null,
//                "There's no input here, just a message",
//                "Title",
//                0);
//
//        
//        String input1 = (String)JOptionPane.showInputDialog(null,
//                "Is this a question?",
//                "Dialog Title",
//                2,
//                null,
//                null,
//                "Type something here.");
        
        
        String[] acceptableValues = {"Bayern", "The bundesliga winners (Bayern)", "The champions league winners (Bayern)"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Which is the best team in the world?",
                "??????????",
                3,
                null,
                acceptableValues,
                acceptableValues[0]);
                
    }
}