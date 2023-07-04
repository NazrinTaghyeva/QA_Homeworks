package Task_2;

public class Teacher extends Person{
    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println("Subject:" + subject);
    }
}
