/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author nps5120
 */
public class MenuModel {
    private String name; //This is the current Username
    private Score[] highScores;
    
    public MenuModel()
    {
        highScores = new Score[3];
        loadScores();
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void addScore(String name, String score)
    {
        Score newScore = new Score(name, score);
        
        if(newScore.getPoints().compareTo(highScores[0].getPoints()) > 0)
        {
            highScores[2] = highScores[1];
            highScores[1] = highScores[0];
            highScores[0] = newScore;
        }
        else if(newScore.getPoints().compareTo(highScores[1].getPoints()) > 0)
        {
            highScores[2] = highScores[1];
            highScores[1] = newScore;
        }
        else if(newScore.getPoints().compareTo(highScores[2].getPoints()) > 0)
        {
            highScores[2] = newScore;
        }
        
        saveScores();
    }
    
    private boolean saveScores()
    {
        try
        {
            PrintWriter writer = new PrintWriter("leaderboard.txt");
            for(int i = 0; i < 3; i++)
            {
                writer.print(highScores[i].getName() + "\n");
                writer.print(highScores[i].getPoints() + "\n");
                
            }
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    private boolean loadScores()
    {
        try
        {
            Scanner fileIn = new Scanner("leaderboard.txt");
            fileIn.useDelimiter("\n");
            for(int i = 0; i < 3; i++)
            {
                highScores[i].setName(fileIn.nextLine());
                highScores[i].setPoints(fileIn.nextLine());
            }
            
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public void buildGameFrame(GameView gView, GameModel gModel, GameController gController) 
    {
        System.err.println("This is a stub.");
    }
    
    public Score[] getHighScores() {
        return this.highScores;
    }
    
    
}
