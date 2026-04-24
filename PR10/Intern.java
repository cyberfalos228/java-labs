public class Intern extends Employee {
    private double salary;

    public Intern(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public void work() {
        System.out.println(name + " навчається та виконує завдання.");
    }
}
