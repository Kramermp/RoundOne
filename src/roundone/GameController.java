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
    int timeToWait = 180;
    int playerX = 0;
    int playerY = 0;
    NumberPanel[][] theNumberPanelArray = new NumberPanel[7][7];
    int numberOfAnswers = 0;
    int numberOfCorrectResponses = 0;
    TimerThread timerThread;
            
    int score;
    String username="";
    MenuModel theMenuModel;
    MenuController theMenuController;
    GameView theGameView;
    int panelNum;
    
    
    
    public GameController(MenuModel theMenuModel, MenuController theMenuController){
        this.theMenuModel= theMenuModel;
        populateNumberPanels();
        this.theMenuController = theMenuController;
        theGameView=new GameView(this, theNumberPanelArray, timeToWait);
        timerThread = new TimerThread(this, timeToWait);
        timerThread.start();
        theGameView.setVisible(true);
        theGameView.requestFocus();
    }
    
    public boolean isPrime(int n) {
    int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int generateNumber(){
        Random r = new Random();

        int low = 1;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        if(isPrime(result)) {
            numberOfAnswers++;
        }

        return result;
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
            case 10: // Enter
                System.out.println("Enter Pressed");
                this.theNumberPanelArray[playerY][playerX].trigger();
                if(this.theNumberPanelArray[playerY][playerX].isPrime()) {
                    //IncreaseScore
                    score += 10;
                    numberOfCorrectResponses++;
                    //Check If finished
                    if(numberOfCorrectResponses >= numberOfAnswers) {
                        gameOver();
                    }
                } else {
                    //DescreaseScore
                    score -= 10;
                }
                System.out.println(score);
                updateScore();
                return;
            case 37: //Left
                System.out.println("Left Pressed");
                if(playerY > 0) {
                    this.theNumberPanelArray[playerY][playerX].setSelected(false);
                    playerY--;
                    movePlayer();
                }
                return;
            case 38: //Up
                System.out.println("Up Pressed");
                if(playerX > 0) {
                    this.theNumberPanelArray[playerY][playerX].setSelected(false);
                    playerX--;
                    movePlayer();
                }
                return;
            case 39: // Right
                System.out.println("Right Pressed");
                if(playerY < 6) {
                    this.theNumberPanelArray[playerY][playerX].setSelected(false);
                    playerY++;
                    movePlayer();
                }
                return;
            case 40: //Down
                System.out.println("Down Pressed");
                if(playerX < 6) {
                    this.theNumberPanelArray[playerY][playerX].setSelected(false);
                    playerX++;
                    movePlayer();
                }
                return;
            default:
                System.out.println("Unknown Key Pressed");
                System.out.println(e.getKeyCode());
                return;
            
        }
    }

    private void movePlayer() {
        this.theNumberPanelArray[playerY][playerX].setSelected(true);
    }
    
    private void populateNumberPanels() {
        for(int i =0; i < 7; i++) {
            for(int j =0; j < 7; j++) {
                int theNumber = generateNumber();
                theNumberPanelArray[i][j] = new NumberPanel(theNumber);
            }
        }
    }
    
    public int getScore() {
        return this.score;
    }
    
    public void updateScore() {
        theGameView.updateScore(score);
    }
    
    public void updateTimer(int timeLeft) {
        theGameView.updateTimer(timeLeft);
    }
    
    public void gameOver() {
        System.out.println("Game is finished.");
        theMenuModel.addScore(score);
        theGameView.dispose();
        new MessageWindow(new Score(theMenuModel.getName(), score));
        if(timerThread.isAlive()) 
            timerThread.interrupt();
        
        theMenuController.updateScoreboard();
    }
}
