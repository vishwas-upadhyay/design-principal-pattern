package com.vishwas.design.principle.openclose.inheritance;

public class InterviewProcessor {
    static  void execute(InterviewQuestion questions)
    {
        // When you think about class then think in terms of data and behavior.
        // Open Close principal deals with behavior hence think from behavior perspective.
        // Inheritance basically use to save memory by utilizing the variables for sub class from parent class.
        // Inheritance do not allow multiple inheritance hence using interface for method abstraction make
        // sense as this is primary object in open/close principle to provide abstraction.
        questions.execute();
        System.out.println(questions.interviewQuestionId);
    }
}
