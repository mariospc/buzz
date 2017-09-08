/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzzapp;

import java.util.*;
/**
 *
 * @author GONIANAKIA
 */
public class Game {            
    private ArrayList<Player> players;    
    private Round rnd;
    private Question qu;
    private int number_players;  
    private int [] historyUsed =  new int[9];
    private int [] geoUsed =  new int[9];
    private int [] sportUsed =  new int[9];
    private int hplace = 0;
    private int gplace = 0;
    private int splace = 0;
    private boolean correct = false;
    private int category;

    
    public Game() {
        
        players = new ArrayList<>();
        number_players = 0;
    }
    
    public void selectPlayers() {        
        String aname;
        Scanner sc = new Scanner(System.in);
        
        do{
        System.out.println("Πληκτολογήστε τον αριθμό των παικτών που θα παίξουν σε αυτό το παιχνίδι");
        System.out.println("1. Ένας");
        number_players = sc.nextInt();
        sc.nextLine(); // Το βάζω εδώ γιατι παρακάτω η nextLine() παίρνει ΑΥΤΟ το Enter που πατάω και προσπερνάει το διάβασμα του ονόματος.
        }while (number_players != 1);
        
       for (int i=1;i<=number_players;i++)
       {
           System.out.println("Παίκτη " + i + " πως σε λένε;");
           aname=sc.nextLine();
           players.add(new Player(aname));                   
       }
       
    }
    
    public void chooseCategory(){
        Scanner sc = new Scanner(System.in);
        qu = null; // Αρχικοποίηση σε κάθε εκτέλεση για καταχώρηση επόμενου αντικειμένου
        do{
            System.out.println("Διάλεξε την κατηγορία ερωτήσεων πληκτρολογώντας τον αντίστοιχο αριθμό");
            System.out.println("1. Ιστορία");
            System.out.println("2. Γεωγραφία");
            System.out.println("3. Αθλητισμός");
            category = sc.nextInt();
            if (category == 1 || category == 2 || category == 3) 
                break;
            System.out.println("Λάθος είσοδος Προσπάθησε ξανά!");
        }while (true);
        switch (category) {
            case 1:
                qu = new HistoryQuestions();
                break;
            case 2: 
                qu = new GeoQuestions();
                break;
            case 3:
                qu = new SportQuestions();
                break;               
        }
    }
    
    public void chooseTypeOfRound(){
        int type;
        Scanner sc = new Scanner(System.in);
        rnd = null; // Αρχικοποίηση σε κάθε εκτέλεση για καταχώρηση επόμενου αντικειμένου
         do{
            System.out.println("Διάλεξε είδος γύρου πληκτρολογώντας τον αντίστοιχο αριθμό");
            System.out.println("1. Σωστή απάντηση");
            System.out.println("2. Ποντάρισμα\n");
            type = sc.nextInt();  
            if (type == 1 || type == 2)
                break;
            System.out.println("Λάθος είσοδος Προσπάθησε ξανά!");
            }while(true);
            switch(type) {
               case 1:
                rnd = new CorrectAnswerRound();
                System.out.println("Κάθε παίχτης που απαντάει σωστά κερδίζει 1000 πόντους.");
                break;
               case 2:
                rnd = new BettingRound();
                System.out.println("\nΣε αυτόν τον γύρο ποντάρεις πόντους, τους οποιους θα κερδίσεις εάν απαντήσεις σωστά στην ερώτηση, \n "
                        + "         ή θα χάσεις εάν απαντήσεις λανθασμένα!");
                break;
            }
    }        
    
    
    public void startGame() {
        int current_player;
        int erotisi; 
        int answer;
        boolean correct;
        boolean used;
        Scanner sc = new Scanner(System.in);
        Random r1 = new Random();
        
    //Ο κάθε παίκετης παίζει την κατηγορία που επιλέχθηκε:
        current_player = 0;
        while (current_player < players.size()){
            System.out.println("\n**** "+players.get(current_player).getName()+" Παίζεις εσύ τώρα! ****\n");
            // αριθμός ερωτήσεων
            for (int i=0 ; i<4 ; i++){ 
                    int correctAswr = 0;
                    rnd.roundMechanics();
                    // Διάφοροι μηχανισμοί που γίνονται ανάλογα με το γύρο
                   
                    do{
                        erotisi = qu.ChooseQuestion();
                        used = usedQuestions(erotisi,category);
                    }while(used);
                    System.out.println(qu.ShowQuestion(erotisi));
                    do{
                        System.out.println("Διάλεξε την απάντηση πληκτρολογώντας τον αντίστοιχο αριθμό");
                        int j=1;                       
                        for (String theAnswer : qu.ShowAnswers(erotisi)){                           
                            System.out.println(j+ ". "+ theAnswer); 
                            if (theAnswer.equals(qu.correctAnswer.get(erotisi)))
                                    correctAswr = j;
                            j++;
                        }                     
                        answer = sc.nextInt();
                        if(answer==1 || answer==2 || answer==3 || answer==4)
                            break;  
                        System.out.println("Λάθος είσοδος Προσπάθησε ξανά!");
                    }while(true);
                    if (answer == correctAswr){
                        System.out.println("Μπράβο! Απάντησες σωστά!!");
                        correct = true;  
                    }
                    else{ 
                        System.out.println("Μπράβο ΒΛΑΚΑ!! Λάθος απάντηση!");
                        correct = false;
                    }
                    rnd.calculatePoints(correct);                                        
                    players.get(current_player).setScore(rnd.getPoints());
                    System.out.println("Μέχρι τώρα η βαθμολογία σου είναι: "+ players.get(current_player).getScore()+ "\n");
                    } // ΤΕΛΟΣ ΕΡΩΤΗΣΕΩΝ                
                current_player++;
        } // ΤΕΛΟΣ - Επόμενος Παίκτης
    } // ΤΕΛΟΣ Παιχνιδιού     
    
    
    public String toString(){
        String output="";        
        for (Player aplayer: players)
            output += aplayer.getName() + ": "+aplayer.getScore()+" πόντοι"+"\n";        
        return output;
    }
    
    public boolean usedQuestions(int erotisi, int category){
        switch (category){
            case 1:
                correct = false;
                for(int i=0 ; i<=8 ; i++){  
                    if (historyUsed[i]== erotisi){
                        correct = true;
                        break;
                    }
                }
                if(!correct){
                    historyUsed [hplace] = erotisi;
                     hplace ++;
                }
            case 2:
                correct = false;
                for(int i=0 ; i<=8 ; i++){  
                    if (geoUsed[i]== erotisi){
                        correct = true;
                        break;
                    }
                }
                if(!correct){
                    geoUsed [gplace] = erotisi;
                    gplace ++;
                }
            case 3:
                correct = false;
                for(int i=0 ; i<=8 ; i++){  
                    if (sportUsed[i]== erotisi){
                        correct = true;
                        break;
                    }
                }
                if(!correct){
                    sportUsed [splace] = erotisi;
                    splace ++;
                }
                
        }
    return correct;
    }
}  

    
