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
public class HistoryQuestions extends Question {
    private int [] used =  new int[7];
    int place = 1;
   
        
    public HistoryQuestions(){
      super(); 
      
      questions.put(1,"Πότε έγινε η Ναυμαχία της Σαλαμίνας;");
      questions.put(2,"Που βρίσκονται οι Θερμοπύλες, όπου πραγματοποιήθηκεη περίφημη μάχη;");
      questions.put(3,"Με τη συνθήκη των Σεβρών (10 Αυγούστου 1920): ");
      questions.put(4,"Πότε έγινε η μάχη στα Γαυγάμηλα; (μια από τις σπουδαιότερες νίκες του Μ. Αλεξάνδρου)");
      questions.put(5,"Το δικαίωμα του Ρωμαίου Πολίτη αποδόθηκε στους υπηκόους της Ρωμαϊκής Αυτοκρατορίας από τον :");
      questions.put(6,"Ποιος αυτοκράτορας κατήργησε τους Ολυμπιακούς αγώνες;");
      questions.put(7,"Η αφορμή της έκρηξης του Α’ Παγκοσμίου πολέμου συνδέεται: ");
      questions.put(8,"Με τη συνθήκη του Νεϊγύ (14-11-1919):");
            
      answers.put(1,"480π.Χ.");
      answers.put(2,"470π.Χ.");
      answers.put(3,"490π.Χ.");
      answers.put(4,"453π.Χ.");
      answers.put(5,"Ν.Λακωνίας");
      answers.put(6,"Ν.Τρικάλων");
      answers.put(7,"Ν.Φθιώτιδας");
      answers.put(8,"Ν.Αττικής");
      answers.put(9,"356-323 π.Χ.");
      answers.put(10,"350-323 π.Χ.");
      answers.put(11,"350-323 π.Χ.");
      answers.put(12,"346-303 π.Χ.");
      answers.put(13,"323 π.Χ.");
      answers.put(14,"331π.Χ.");
      answers.put(15,"327π.Χ.");
      answers.put(16,"319π.Χ.");            
      answers.put(17,"Μέγα Κωνσταντίνο");            
      answers.put(18,"Μάρκο Αυρήλιο");            
      answers.put(19,"Iούλιο Καίσαρα");            
      answers.put(20,"Καρακάλλα");            
      answers.put(21,"Κωνσταντίνος Ζ’ (Πορφυρογέννητος)");            
      answers.put(22,"Αλέξιος Α’ (Κομνηνός)");            
      answers.put(23,"Νικηφόρος Β’ (Φωκάς)");            
      answers.put(24,"Θεοδόσιος");            
      answers.put(25,"με τη φιλοπόλεμη πολιτική του Κάιζερ της Γερμανίας Γουλιέλμου Β’");            
      answers.put(26,"με τη σερβοαυστριακή διαφορά, που ήταν επακόλουθο της δολοφονίας του Φραγκίσκου Φερδινάνδου");            
      answers.put(27,"με τις εδαφικές βλέψεις της Δανίας");            
      answers.put(28,"με τις επιδιώξεις των Γάλλων για ανακατάληψη των περιοχών Αλσατίας και Λορραίνης ");            
      answers.put(29,"η Ελλάδα προσαρτά όλη σχεδόν την Ανατολική Θράκη");            
      answers.put(30,"η Βουλγαρία χάνει την έξοδό της προς το Αιγαίο");            
      answers.put(31,"ο ελληνικός στρατός λαμβάνει την άδεια να καταλάβει μια συγκεκριμένη και ορισμένη εδαφική ζώνη γύρω από τη Σμύρνη");            
      answers.put(32,"ο Κεμάλ αποσπά απο τους Μπολσεβίκους του Λένιν το πολεμικό τους υλικό");            
            
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
      
      correctAnswer.put(1,"480π.Χ.");
      correctAnswer.put(2,"Ν.Φθιώτιδας");
      correctAnswer.put(3,"356-323 π.Χ.");
      correctAnswer.put(4,"331π.Χ.");                    
      correctAnswer.put(5,"Καρακάλλα");                    
      correctAnswer.put(6,"Θεοδόσιος");                    
      correctAnswer.put(7,"με τη σερβοαυστριακή διαφορά, που ήταν επακόλουθο της δολοφονίας του Φραγκίσκου Φερδινάνδου");                    
      correctAnswer.put(8,"η Βουλγαρία χάνει την έξοδό της προς το Αιγαίο"); 
      
    }  
  
}

