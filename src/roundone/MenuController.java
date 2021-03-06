/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author zjx5013
 */
public class MenuController {
    private MenuView theMenuView;
    private MenuModel theMenuModel;
    private GameController theGameController;
    
    //Changes were made here that still need to be discussed with the design team
    public MenuController() {
        theMenuView = new MenuView(this);
        theMenuModel = new MenuModel(); //Load
        this.theMenuView.populateLeaderboard(theMenuModel.getHighScores());
        this.theMenuView.setVisible(true);
    }
    
    public void setName(String username) {
        theMenuModel.setName(username);
    } 

    public void updateScoreboard() {
       theMenuView.populateLeaderboard(theMenuModel.getHighScores());
    }
    
    
    public void exitGame() {
        System.exit(0);
    }
    
    private class StartListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            startGame();
        } 
    }
    
    public void startGame() {
        theMenuModel.setName(theMenuView.getNameField().getText());
        theGameController = new GameController(this.theMenuModel, this);
    }
}
