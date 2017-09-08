/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzzapp;
import java.util.Scanner;
/**
 *
 * @author GONIANAKIA
 */
public class Player {
    private String name;
    private int score;               

    public Player(String aname) {
        this.name = aname;
        this.score = 0;
    }
    
    public void setName(String aname){        
        this.name = aname;
    }
    
    public String getName(){
        return name;
    }            
        
    public void setScore(int points){       
            score += points;
        }
    
    public int getScore(){
        return score;    
    }

       
}
