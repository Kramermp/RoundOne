/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michael Kramer
 */
public class TimerThread extends Thread implements Runnable {
    private int timeToWait;
    private GameController theGameController;
    
    public TimerThread(GameController gameController, int timeToWait) {
        this.timeToWait = timeToWait;
        this.theGameController = gameController;
    }
    @Override
    public void run() {
        try {
            for(int i = timeToWait; i > 0; i--) {
                Thread.sleep(1000);
                System.out.println(i + " seconds remaining.");
                theGameController.updateTimer(i);
            }
            System.out.println("Timer Expired.");
            theGameController.gameOver();
        } catch (InterruptedException ex) {
            System.out.println("Timer was interuptterd.");
        }
    }
}
