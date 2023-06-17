package CalculatorAdvance;

import java.util.Arrays;

public class SubjectGrades {
    private String subjectName;

    private int[] grades;

    public SubjectGrades(String subjectName) {
        this.subjectName = subjectName;
    }

    public SubjectGrades() {
        this.grades = new int[0];
    }

    public void addGrade2(int grade) {
        if (grades.length == 0) {
            grades = new int[grades.length + 1];
            grades[0] = grade;
        } else {
            int[] previousGrades = grades;
            grades = new int[grades.length + 1];
            System.arraycopy(previousGrades, 0, grades, 0, previousGrades.length);
            grades[grades.length - 1] = grade;
        }
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


    public int[] getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "SubjectGrades{" +
                "subjectName='" + subjectName + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}