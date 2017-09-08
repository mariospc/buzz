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
public class GeoQuestions extends Question {
    private int [] used =  new int[7];
    int place = 1;
    
    public GeoQuestions(){
      super(); 
      
      questions.put(1,"Ποιο είναι το νόμισμα της Πολωνίας;");
      questions.put(2,"Ποιο νησί συνδέεται με πλωτή γέφυρα με την Αιτωλοακαρνανία;");
      questions.put(3,"Ποια γλώσσα ομιλείται περισσότερο στον κόσμο μετά τα κινέζικα;");
      questions.put(4,"Η Γη του Πυρός βρίσκεται στην...");
      questions.put(5,"Ποιος από τους παρακάτω ωκεανούς είναι ο βαθύτερος;");
      questions.put(6,"Ποια είναι η πρωτεύουσα της Ουγγαρίας;");
      questions.put(7,"Σε ποια πόλη της Πελοποννήσου βρίσκεται ο Μιστρας;");
      questions.put(8,"Ποια είναι η επίσημη γλώσσα της Ανγκόλας;");
      
      answers.put(1,"Ευρώ");
      answers.put(2,"Ζλότι");
      answers.put(3,"Γιεν");
      answers.put(4,"Πολωνική λίρα");
      answers.put(5,"Λευκάδα");
      answers.put(6,"Ιθάκη");
      answers.put(7,"Ζάκυνθος");
      answers.put(8,"Κέρκυρα");
      answers.put(9,"Αγγλικά");
      answers.put(10,"Αραβικά");
      answers.put(11,"Χίντι");
      answers.put(12,"Ισπανικά");
      answers.put(13,"Αφρική");
      answers.put(14,"Αμερική");
      answers.put(15,"Ευρώπη");
      answers.put(16,"Ωκεανία");            
      answers.put(17,"Ατλαντικός");            
      answers.put(18,"Ειρηνικός");            
      answers.put(19,"Βόρειος Παγωμένος");            
      answers.put(20,"Ινδικός");            
      answers.put(21,"Βαρσοβία");            
      answers.put(22,"Σόφια");            
      answers.put(23,"Βουδαπέστη");            
      answers.put(24,"Βουκουρέστι");            
      answers.put(25,"Ναύπλιο");            
      answers.put(26,"Τρίπολη");            
      answers.put(27,"Σπάρτη");            
      answers.put(28,"Πάτρα");            
      answers.put(29,"Αγγλικά");            
      answers.put(30,"Πορτογαλικά");            
      answers.put(31,"Γαλλικά");            
      answers.put(32,"Ισπανικά");            
       
      questionAnswers.put(1,new ArrayList<Integer>());
      questionAnswers.put(2,new ArrayList<Integer>());
      questionAnswers.put(3,new ArrayList<Integer>());
      questionAnswers.put(4,new ArrayList<Integer>());
      questionAnswers.put(5,new ArrayList<Integer>());
      questionAnswers.put(6,new ArrayList<Integer>());
      questionAnswers.put(7,new ArrayList<Integer>());
      questionAnswers.put(8,new ArrayList<Integer>());
      questionAnswers.get(1).add(1);
      questionAnswers.get(1).add(2);
      questionAnswers.get(1).add(3);
      questionAnswers.get(1).add(4);
      questionAnswers.get(2).add(5);
      questionAnswers.get(2).add(6);
      questionAnswers.get(2).add(7);
      questionAnswers.get(2).add(8);
      questionAnswers.get(3).add(9);
      questionAnswers.get(3).add(10);
      questionAnswers.get(3).add(11);
      questionAnswers.get(3).add(12);
      questionAnswers.get(4).add(13);
      questionAnswers.get(4).add(14);
      questionAnswers.get(4).add(15);
      questionAnswers.get(4).add(16);            
      questionAnswers.get(5).add(17);            
      questionAnswers.get(5).add(18);            
      questionAnswers.get(5).add(19);            
      questionAnswers.get(5).add(20);            
      questionAnswers.get(6).add(21);            
      questionAnswers.get(6).add(22);            
      questionAnswers.get(6).add(23);            
      questionAnswers.get(6).add(24);            
      questionAnswers.get(7).add(25);            
      questionAnswers.get(7).add(26);            
      questionAnswers.get(7).add(27);            
      questionAnswers.get(7).add(28);            
      questionAnswers.get(8).add(29);            
      questionAnswers.get(8).add(30);            
      questionAnswers.get(8).add(31);            
      questionAnswers.get(8).add(32);            
      
      correctAnswer.put(1,"Ζλότι");
      correctAnswer.put(2,"Λευκάδα");
      correctAnswer.put(3,"Ισπανικά");
      correctAnswer.put(4,"Αμερική");                    
      correctAnswer.put(5,"Ειρηνικός");                    
      correctAnswer.put(6,"Βουδαπέστη");                    
      correctAnswer.put(7,"Σπάρτη");                    
      correctAnswer.put(8,"Πορτογαλικά");    
    }
}
