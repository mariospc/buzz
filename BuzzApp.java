/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzzapp;
import java.util.Scanner;
/**
 *
 * @author Chirtoglou - AEM 2426
 * @autor Gonianaki - AEM2346
 */

public class BuzzApp {    
    
    public static void main(String[] args){
        int arithmos_gyrwn;
        Scanner sc = new Scanner(System.in);    
        Game game = new Game ();    
        System.out.println("Καλως ήρθατε στο Buzz!"); 
        System.out.println();
        do{
            System.out.println("Πόσους Γύρους θα παίξετε;");
            System.out.println("1. Έναν");
            System.out.println("2. Δύο");
            arithmos_gyrwn = sc.nextInt();
            if (arithmos_gyrwn == 1 || arithmos_gyrwn == 2)
                break;
            System.out.println("Λάθος είσοδος Προσπάθησε ξανά!");
        }while(true);
    
        game.selectPlayers();
    
        for (int i=1;i<=arithmos_gyrwn;i++) {   
          System.out.println("Γύρος: "+i+"!");
          game.chooseTypeOfRound();
          game.chooseCategory();
          game.startGame();
          System.out.println("Τέλος Γύρου "+i+" - ΑΠΟΤΕΛΕΣΜΑΤΑ");
          System.out.println(game);
        }       
    }   
}
