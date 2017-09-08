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
public abstract class Question {           
    protected HashMap<Integer,String>questions;
    protected HashMap<Integer,String>answers;
    protected HashMap<Integer,String>correctAnswer;
    protected HashMap<Integer,ArrayList<Integer>>questionAnswers;
    protected HashMap<Integer, Boolean>usedQuestions;
    private int randomIndex;
   
    public Question(){
    questions = new HashMap<>();
    answers = new HashMap<>();
    correctAnswer = new HashMap<>();
    questionAnswers = new HashMap<>();
    usedQuestions = new HashMap<>();
}
    public int ChooseQuestion(){
        do{
            randomIndex = (int)(Math.random() * questions.size()+1);  
        }while (randomIndex==0);
        return randomIndex;
    }
    public String ShowQuestion(int questionNumber){
             return questions.get(questionNumber);              
    }
    
    

   public ArrayList<String> ShowAnswers(int questionNumber){            
        ArrayList<String> theAnswers = new ArrayList<>();
        
        for (int anAnswer : questionAnswers.get(questionNumber))
           theAnswers.add(answers.get(anAnswer));
        Collections.shuffle(theAnswers);
        return theAnswers;
    }
    
   
    /*public boolean checkAnswers(int questionNumber,int answer){                   
        if (answer+(4*questionNumber-4) == correctAnswer.get(questionNumber)){
            System.out.println("Μπράβο! Απάντησες σωστά!!");
            return true;      
        }        
        else{
            System.out.println("Μπράβο ΒΛΑΚΑ!! Λάθος απάντηση!");
            return false;     
        }
    }
    
   public int pickQuestion() {
      int last = questions.size() - 1;
      int erotisi = (int)Math.random()*last;
      return erotisi;      
}*/
  
   // public abstract boolean usedQuestions(int erotisi);
}
    
