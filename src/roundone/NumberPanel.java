/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author zjx5013
 */
public class NumberPanel extends JPanel {
        Random rng = new Random();
        private int number;
        
        
        public NumberPanel(int number) {
            this.setBackground(new Color(rng.nextInt(255), rng.nextInt(255), rng.nextInt(255)));
            this.number = number;
            //this.setLayout(new BorderLayout());
            this.add(new JLabel(Integer.toString(this.number)));
            isPrime();
        }
        
        public boolean isPrime() {
            int i;
            for (i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            System.out.println(number + " is prime.");
            return true;
        }
    
}
