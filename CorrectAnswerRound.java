/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzzapp;

/**
 *
 * @author Administrator
 */
public class CorrectAnswerRound extends Round {
    
    public CorrectAnswerRound() {
        super();
        points = 0;        
    }
    
    public void roundMechanics() {
        // NO operation here
    }
    
    public void calculatePoints(boolean correct){
        if (correct)
            points = 1000;
        else
            points = 0;        
    }           
}
