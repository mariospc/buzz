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
public abstract class Round {
    protected int points;       
              
    public int getPoints(){               
         return points;
    }
    
    abstract public void calculatePoints(boolean correct);   
    abstract public void roundMechanics();
}
