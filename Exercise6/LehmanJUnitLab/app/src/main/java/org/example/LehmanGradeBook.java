package org.example;

public class LehmanGradeBook {
    public boolean isPassing(int grade) {
        return grade >= 70;
    }
    char getLetterGrade(int score) {
        if (score > 100 || score < 0) {
            throw new IllegalArgumentException("Must be a valid score.");
        }
        if (score >= 90) {
            return 'A';
        } else if (score >= 80 ){
            return 'B';
        } else if (score >= 70 ) {
            return 'C';
        } else if ( score >= 60) {
            return 'D';
        }
        return 'F';
    }

}
