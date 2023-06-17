package CalculatorAdvance;

public class OperationMenu {
    public static void showOperations() {
        String menu = """
                1. MIN GRADE OF SELECTED SUBJECT (command : min)
                2. MAX GRADE OF SELECTED SUBJECT (command : max)
                3. AVERAGE GRADE OF SELECTED SUBJECT (command : avg)
                4. EXIT (command : exit)""";
        System.out.println(menu);

    }
}