/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

import java.util.ArrayList;

/**
 *
 * @author zjx5013
 */
public class GameController {
    int score;
    String username="";
    GameModel theGameModel=new GameModel();
    GameView theGameView=new GameView();
    int panelNum;
    
    
    public GameController(){
    
    
    
    }
    
    public boolean isPrime(int n) {
    int i;
    for (i = 2; i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}
    public int calculateScore(boolean m){
    score=0;
    if(m==true){
        score++;
    }
    return score;
    
    }
    
    
}
