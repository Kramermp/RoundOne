/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 *
 * @author zjx5013
 */
public class MenuController {
    private MenuView theMenuView;
    private MenuModel theMenuModel;
    
    //Changes were made here that still need to be discussed with the design team
    public MenuController() {
        theMenuView = new MenuView();
        theMenuModel = new MenuModel();
        this.theMenuView.setVisible(true);
    }
    
    //Hashmaps require Reference Types need to modify the score hashmap to store
    public Score[] getScores() {
        return theMenuModel.getHighScores();
    }
    
    public void displayScores(HashMap<String, Integer> highScores) {
        
    }
    
    private class ExitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.err.println("This is a stub.");
        }
        
    }
    
    private class StartListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.err.println("This is a stub.");
        }
        
    }
}