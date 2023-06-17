package CalculatorAdvance;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class GradesHandler {
    private final Scanner scanner;
    private String[] subjects;

    private SubjectGrades[] subjectGrades;


    public GradesHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public String greeting() {
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "!");
        return name;
    }

    public Integer subjectCount(String name) {
        System.out.print(name + " ,please " + "enter number of subjects : ");
        int size = scanner.nextInt();
        subjects = new String[size];
        subjectGrades = new SubjectGrades[size];
        return size;
    }

    public void setSubjectNames(Integer index) {
        Scanner sc = new Scanner(System.in);
        System.out.print(index + 1 + ". ");
        String subject = sc.nextLine();
        subjects[index] = subject.toUpperCase();
        SubjectGrades sg = new SubjectGrades();
        subjectGrades[index] = sg;
        subjectGrades[index].setSubjectName(subject.toUpperCase());
    }

    public void showSubjects() {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println((i + 1) + ". " + subjects[i]);
        }
    }

    public void subjectSelector(int index) {

        if (index > subjects.length) {
            System.out.println("Entered subject not exists.");
            return;
        }
        String subject = subjects[index - 1];
        System.out.println("You are adding grades to " + subject);
    }

    public int setGrades(int index) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int grade = sc.nextInt();
        if (grade == 0) return grade;

        subjectGrades[index - 1].addGrade2(grade);
        return grade;
    }


    public int getMinGrade(int index) {
        if (!checkSubjectExt(index - 1, subjectGrades)) return 0;
        SubjectGrades grades = subjectGrades[index - 1];
        return Arrays.stream(grades.getGrades()).min().orElse(0);
    }

    public int getMaxGrade(int index) {
        if (!checkSubjectExt(index - 1, subjectGrades)) return 0;
        SubjectGrades grades = subjectGrades[index - 1];
        return Arrays.stream(grades.getGrades()).max().orElse(0);
    }

    public double getAvgGrade(int index) {

        if (!checkSubjectExt(index - 1, subjectGrades)) return 0;
        SubjectGrades grades = subjectGrades[index - 1];
        OptionalDouble average = Arrays.stream(grades.getGrades()).average();
        double value = average.orElse(0.0);
        return Math.round(value);
    }

    private boolean checkSubjectExt(int index, SubjectGrades[] subjectGrades) {
        if (index > subjectGrades.length) {
            System.out.println("Entered subject not exits");
            return false;
        }
        return true;
    }

    public boolean checkStatus() {
        return Arrays.stream(subjectGrades).noneMatch(x -> x.getGrades().length == 0);
    }
}