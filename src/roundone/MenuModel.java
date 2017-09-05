/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

import java.util.HashMap;

/**
 *
 * @author zjx5013
 */
public class MenuModel {
    private String name; //This is the current Username
    private Score[] highScores = new Score[3];
    
    public void buildGameFrame(GameView gView, GameModel gModel, GameController 
            gController) {
        System.err.println("This is a stub.");
    }
    
    public Score[] getHighScores() {
        return this.highScores;
    }
}
