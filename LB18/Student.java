public class Student {
    private String name;
    private int age;
    private String group;
    private double avrGrade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, String group, double avrGrade) {
        this.name = name;
        this.group = group;
        this.avrGrade = avrGrade;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGroup() { return group; }
    public double getAvrGrade() { return avrGrade; }

    @Override
    public String toString() {
        return name + " (вік: " + age + ")";
    }
}
