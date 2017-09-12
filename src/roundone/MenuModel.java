/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author nps5120
 */
public class MenuModel {
    private String name; //This is the current Username
    private Score[] highScores = new Score[3];
    
    public MenuModel()
    {
        for(int i = 0; i < 3; i++)
        {
            highScores[i] = new Score("", "");
        }
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
    
    public void addScore(String score)
    {
        Score newScore = new Score(this.name, score);
        
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
    
    private void saveScores()
    {
        try
        {
            PrintWriter writer = new PrintWriter("src/roundone/leaderboard.txt");
            for(int i = 0; i < 3; i++)
            {
                writer.print(highScores[i].getName() + "\n");
                writer.print(highScores[i].getPoints() + "\n");           
                
            }
            writer.flush();
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
    }
    
    private void loadScores()
    {
        try
        {
            File leaderboard = new File("src/roundone/leaderboard.txt");
            Scanner fileIn = new Scanner(leaderboard);
            for(Score s: highScores)
            {
                s.setName(fileIn.nextLine());
                s.setPoints(fileIn.nextLine());
            }
           
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
            //Make Files
            try {
                PrintWriter out = new PrintWriter("src/roundone/leaderboard.txt");
                out.println("AAA");
                out.println("0");
                out.println("AAA");
                out.println("0");
                out.println("AAA");
                out.println("0");
                out.flush();
                out.close();
            } catch (IOException exception) {
                System.out.println("IO Exception");
            }
            

        }
        catch(NullPointerException n)
        {
            System.out.println("Null pointer exception");
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
