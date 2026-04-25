public class Student extends Person {
    private String group;

    public Student() {
        super();
        this.group = "Невідома група";
    }

    public Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    /**
     * Виводить інформацію про студента.
     */
    public void printInfo() {
        System.out.println("Студент: " + getName() + " | Вік: " + getAge() + " | Група: " + group);
    }
}
