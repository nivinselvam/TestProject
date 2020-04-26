package com;

import javax.swing.SwingUtilities;

public class Initializer {
	
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextAreaLogProgram().setVisible(true);
            }
        });
    }

}
