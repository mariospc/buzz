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
public class SportQuestions extends Question{
   
    
    public SportQuestions(){
      super(); 
      
      questions.put(1,"Πόσα Χρυσά μετάλλια έχει κερδίσει ο Πύρρος Δήμας σε Ολυμπιακούς αγώνες;");
      questions.put(2,"Ποιος είναι ο αρχιτέκτονας του στεγάστρου του Ολυμπιακού Σταδίου της Αθήνας;");
      questions.put(3,"Ποιος από τους παρακάτω βαθμούς έχει την μικτρότερη αξία σε ένα αγώνα judo;");
      questions.put(4,"Ποια ομάδα αναδείχθηκε Κυπελλούχος Ελλάδας στο ποδόσφαιρο την αγωνιστική περίοδο 2012-2013;");
      questions.put(5,"Ποια ομάδα αναδείχθηκε πρωταθήτρια Ισπανίας την αγωνιστική περίοδο 2012-2013;");
      questions.put(6,"Το Ολυμπιακό Στάδιο της Αθήνας έχει το όνομα του...");
      questions.put(7,"Ποιο στάδιο αποτελεί έδρα της Ρεάλ Μαδρίτης;");
      questions.put(8,"Το Μουντιάλ του 2010 πραγματοποιήθηκε στη(ν)...");
            
      answers.put(1,"2");
      answers.put(2,"4");
      answers.put(3,"3");
      answers.put(4,"6");
      answers.put(5,"Α.Γκαουντί");
      answers.put(6,"Σ.καλατράβα");
      answers.put(7,"Λε Κορμπιζιέ");
      answers.put(8,"Ο.Νιμάγιερ");
      answers.put(9,"ippon");
      answers.put(10,"koka");
      answers.put(11,"waza-ari");
      answers.put(12,"yuko");
      answers.put(13,"Παναθηναϊκός");
      answers.put(14,"Ολυμπιακός");
      answers.put(15,"ΠΑΟΚ");
      answers.put(16,"ΑΕΚ");            
      answers.put(17,"Ατλέτικο Μαδρίτης");            
      answers.put(18,"Ρεάλ Μαδρίτης");            
      answers.put(19,"Σεβίλλη");            
      answers.put(20,"Μπαρτσελόνα");            
      answers.put(21,"Σ.Λούη");            
      answers.put(22,"Πύρρου Δήμα");            
      answers.put(23,"Κ.Τσικλητήρα");            
      answers.put(24,"Διαγόρα");            
      answers.put(25,"Βιθέντε Καλντερόν");            
      answers.put(26,"Καμπ Νου");            
      answers.put(27,"Σαν Μαμές");            
      answers.put(28,"Μπερναμπέου");            
      answers.put(29,"Νότια Αφρική");            
      answers.put(30,"Ιταλία");            
      answers.put(31,"Γαλλία");            
      answers.put(32,"Βραζιλία");            
      
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
      
      correctAnswer.put(1,"3");
      correctAnswer.put(2,"Σ.καλατράβα");
      correctAnswer.put(3,"koka");
      correctAnswer.put(4,"Ολυμπιακός");                    
      correctAnswer.put(5,"Μπαρτσελόνα");                    
      correctAnswer.put(6,"Σ.Λούη");                    
      correctAnswer.put(7,"Μπερναμπέου");                    
      correctAnswer.put(8,"Νότια Αφρική"); 
    }
}
