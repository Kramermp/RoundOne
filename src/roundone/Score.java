/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

/**
 *
 * @author nps5120
 */
class Score {
    private String name;
    private int points = 0;
    
    public Score(String name, int points)
    {
        this.name = name;
        this.points = points;
        if(this.name.isEmpty())
            this.name = "BLANK";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
    }
}
