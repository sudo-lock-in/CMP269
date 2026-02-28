package org.example;

public class LehmanGradeBook {
    public boolean isPassing(int grade) {
        return grade >= 70;
    }
    char getLetterGrade(int score) {
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
