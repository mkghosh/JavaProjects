package com.mithun.enumpractice;

public enum GradingTest {
    GOOD, BETTER, BEST;

    public char getGrade() {
        char grade = '\u0000';
        switch (this) {
            case GOOD:
                grade = 'C';
                break;
            case BETTER:
                grade = 'B';
                break;
            case BEST:
                grade = 'A';
                break;
        }
        return grade;
    }
}