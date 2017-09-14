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
        private Color defaultColor = Color.WHITE;
        private static final Color errorColor = Color.RED;
        private static final Color selectedColor = Color.BLUE;
        private static final Color correctColor = Color.GREEN;
        private int number;
        
        
        public NumberPanel(int number) {
            this.setBackground(defaultColor);
            this.number = number;
            //this.setLayout(new BorderLayout());
            this.add(new JLabel(Integer.toString(this.number)));
            /*if(isPrime())
                setBackground(Color.CYAN);*/
            
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
        
        public void setSelected(boolean isSelected) {
            if(isSelected) {
                this.setBackground(selectedColor);
            } else {
                this.setBackground(defaultColor);
            }
        }
        
        public void trigger() {
            if(isPrime()) {
                defaultColor = correctColor;
            } else {
                defaultColor = errorColor;
            }
            this.setBackground(defaultColor);
        }
}
