package com.vishwas.design.principle.openclose;

public class InterviewProcessor {
    static  void execute(IInterviewQuestion questions)
    {
        // Without open/close principal you have to keep changing below code for each new question class
//        if (questions instanceof  DSAInterviewQuestions){
//            System.out.println("DSA Interview questions");
//        }
//        else if(questions instanceof AIInterviewQuestions){
//            System.out.println("AI Interview questions");
//        }

        // COMPLETE ABSTRACTION
        // THIS CLASS DOESN'T KNOW ABOUT WHAT ARE OTHER CLASSES FOR INTERVIEWS QUESTIONS
        questions.execute();
    }
}
