import java.util.List;

public class Teacher extends Person {
    private List<String> subjects;

    public Teacher() {
        super();
        this.subjects = List.of();
    }

    public Teacher(String name, int age, List<String> subjects) {
        super(name, age);
        this.subjects = subjects;
    }

    public List<String> getSubjects() { return subjects; }
    public void setSubjects(List<String> subjects) { this.subjects = subjects; }

    /**
     * Виводить інформацію про викладача.
     */
    public void printInfo() {
        System.out.println("Викладач: " + getName() + " | Вік: " + getAge() + " | Предмети: " + subjects);
    }
}
