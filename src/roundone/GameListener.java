/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author zjx5013
 */
public class GameListener implements KeyListener {
    GameController parentController;
    
    GameListener(GameController parentController) {
        super();
        this.parentController = parentController;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println("Key Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed");
        parentController.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("Key Released");
    }
    
}
