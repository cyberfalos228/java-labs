public class Employee {
    private String name;
    private Long id;
    private Double salary;

    public Employee(String name, Long id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() { return name; }
    public Long getId() { return id; }
    public Double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " | зарплата: " + salary;
    }
}
