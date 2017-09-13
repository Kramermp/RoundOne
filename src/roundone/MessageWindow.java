/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Michael Kramer
 */
public class MessageWindow extends JFrame {
    private Score playerScore;
    
    public MessageWindow(Score playerScore) {
        this.playerScore = playerScore;
        buildWindow();
        addComponents();
    }
    
    private void buildWindow() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
    }
    
    private void addComponents() {
        JLabel message = new JLabel("Congratulations, " + playerScore.getName()
            + "! You achieved a score of " + playerScore.getPoints() + ".");
        this.add(message, BorderLayout.CENTER);
        JButton okBtn = new JButton("Ok");
        okBtn.addActionListener((ActionEvent ae) -> {
            this.dispose();
        });
        
        this.add(okBtn, BorderLayout.SOUTH);
        this.pack();
    }
}
