package CalculatorAdvance;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        GradesHandler gradesHandler = new GradesHandler(scanner);
        String userName = gradesHandler.greeting();
        Integer count = gradesHandler.subjectCount(userName);
        System.out.println(userName + " ,please enter subjects' names : ");

        for (int i = 0; i < count; i++) {
            gradesHandler.setSubjectNames(i);
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nNow time to add grades on each subject.");

        addGradesOnSubjects(gradesHandler);

        if (!gradesHandler.checkStatus()) {
            System.out.println("App closed...");
            return;
        }

        System.out.println("You are completed the adding grades to subjects.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Now you can select the operations from menu.");
        TimeUnit.SECONDS.sleep(1);

        getAvailableOperations(gradesHandler);


    }

    private static void getAvailableOperations(GradesHandler gradesHandler) throws InterruptedException {
        while (true) {
            gradesHandler.showSubjects();
            System.out.print("Select subject to perform operations, (enter number of index) or enter '0' for exit : ");
            Scanner scanner2 = new Scanner(System.in);
            int index = scanner2.nextInt();
            if (index == 0) {
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println("Application closed ... ");
                break;
            } else {
                while (true) {
                    System.out.println("Available operations ->");
                    OperationMenu.showOperations();
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter operation name: ");
                    String opName = sc.nextLine();
                    opName = opName.toLowerCase();
                    if (opName.equals("exit")) break;
                    switch (opName) {
                        case "min" -> {
                            int minGrade = gradesHandler.getMinGrade(index);
                            System.out.println("---------------------------------------------");
                            System.out.println("Minimum grade on this subject : " + minGrade);
                            System.out.println("---------------------------------------------");
                        }
                        case "max" -> {
                            System.out.println("---------------------------------------------");
                            int minGrade = gradesHandler.getMaxGrade(index);
                            System.out.println("Maximum grade on this subject : " + minGrade);
                            System.out.println("---------------------------------------------");
                        }
                        case "avg" -> {
                            System.out.println("---------------------------------------------");
                            double minGrade = gradesHandler.getAvgGrade(index);
                            System.out.println("Average grade on this subject : " + minGrade);
                            System.out.println("---------------------------------------------");
                        }
                        default -> System.out.println("Operation command is false, try again please");
                    }
                }

            }
        }
    }

    private static void addGradesOnSubjects(GradesHandler gradesHandler) {
        boolean addGrades = true;
        while (addGrades) {
            System.out.println("Enter '0' to exit from adding grades.");
            System.out.println("Subjects that you enter to program: ");
            gradesHandler.showSubjects();
            System.out.print("Select to add grades, (enter number of index) or '0' to exit : ");
            Scanner scanner2 = new Scanner(System.in);
            int index = scanner2.nextInt();
            if (index == 0) addGrades = false;
            else {
                gradesHandler.subjectSelector(index);
                System.out.println();
                while (true) {
                    System.out.println("Enter '0' to return previous menu");
                    int grade = gradesHandler.setGrades(index);
                    if (grade == 0) break;
                }
            }
        }
    }
}