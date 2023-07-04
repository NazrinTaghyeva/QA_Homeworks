package Task_2;

public class Main {
    public static void main(String[] args) {
        Person person[] = {new Student(5), new Teacher("Programming")};
        for (int i = 0; i<person.length;i++){
            Person p = person[i];
            p.displayInfo();
        }
    }
}
