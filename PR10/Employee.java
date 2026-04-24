public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    /**
     * Розраховує зарплату співробітника.
     */
    public abstract double calculateSalary();

    /**
     * Виконує роботу співробітника.
     */
    public abstract void work();
}
