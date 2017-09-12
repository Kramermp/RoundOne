/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author zjx5013
 */
public class GameController {
    int playerX = 0;
    int playerY = 0;
    NumberPanel[][] theNumberPanelArray = new NumberPanel[7][7];
    
    int score;
    String username="";
    GameModel theGameModel;
    GameView theGameView;
    int panelNum;
    
    
    
    public GameController(){
        theGameModel=new GameModel();      
        theGameView=new GameView(this, theNumberPanelArray);
        theGameView.setVisible(true);
        theGameView.requestFocus();
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
    
    public int generateNum(){
    Random r = new Random();
    
    int Low = 1;
    int High = 100;
    int Result = r.nextInt(High-Low) + Low;
    
    return Result;
    }

    public int calculateScore(boolean m){
    score=0;
    if(m==true){
        score++;
    }
    return score;
    
    }

    void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch(keyCode) {
            case 32: // Space
                System.out.println("Space Pressed");
                this.theNumberPanelArray[playerY][playerX].setBackground(Color.gray);
                return;
            case 37: //Left
                System.out.println("Left Pressed");
                if(playerY > 0) {
                    playerY--;
                    movePlayer();
                }
                return;
            case 38: //Up
                System.out.println("Up Pressed");
                if(playerX > 0) {
                    playerX--;
                    movePlayer();
                }
                return;
            case 39: // Right
                System.out.println("Right Pressed");
                if(playerY < 6) {
                    playerY++;
                    movePlayer();
                }
                return;
            case 40: //Down
                System.out.println("Down Pressed");
                if(playerX < 6) {
                    playerX++;
                    movePlayer();
                }
                return;
            default:
                System.out.println("Unknown Key Pressed");
                return;
            
        }
    }

    private void movePlayer() {
        this.theNumberPanelArray[playerY][playerX].setBackground(Color.CYAN);
    }
    
    
}
