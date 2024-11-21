/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizgrader;

/**
 *
 * @author krish
 */
public class QuizGrader {
    private double finalScore;
    private double scorePerQue;
    private int noOfQues;
    private double studentsScore;

    public QuizGrader(double finalScore, int noOfQues) {
        this.finalScore = finalScore;  //this keyword is used for assigning the values to paraeter
        this.noOfQues = noOfQues; 
        this.scorePerQue = finalScore / noOfQues; // shows the total 
        this.studentsScore = 0; // initialized as 0     
    }

    public void gradeQuiz(int correctAns) {
        this.studentsScore = calculateScore(correctAns); // gives the number of correct ans
    }

    public double calculateScore(int correctAnswers) {
        return correctAnswers * this.scorePerQue; // calculates the total marks of question.
    }

    public void resetScore() {
        this.studentsScore = 0; // this will assign student score to 0. 
    }

    public double getScore() {
        return this.studentsScore;
    }

    public void setScore(double newScore) {
        this.studentsScore = newScore;
    }

    public static void main(String[] args) {
        
        QuizGrader quizGrader = new QuizGrader(100, 20);
        quizGrader.gradeQuiz(15);
        
        double percentage = quizGrader.calculateScore(15);
        System.out.println("Calculated Score: " + percentage); // Expected output: 75.0

        quizGrader.resetScore();
        double currentScore = quizGrader.getScore();
        System.out.println("Current Score after reset: " + currentScore); // Expected output after resetting: 0.0
    }
}
