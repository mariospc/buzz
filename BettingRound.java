/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzzapp;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BettingRound extends Round {
    private int bet;
    
    public BettingRound() {
        super();       
        bet = 0;
    }
    
    public void roundMechanics() {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Πληκτρολόγησε τους πόντους που θέλεις να ποντάρεις!");
            System.out.println("250 ");
            System.out.println("500");
            System.out.println("750");
            System.out.println("1000");
            bet = sc.nextInt();
            if (bet==250 || bet==500 || bet==750 || bet==1000)
                break;
            System.out.println("Λάθος είσοδο~ Προσπάθησε ξανά!");
        }while(true);        
    }
    
    public void calculatePoints(boolean correct){
        if (correct)
            points = bet;
        else
            points = -bet;        
    }           
}
