public class Person {
    private String name;
    private int age;
    private int yearOfBirth;
    private int birthMonth;
    private int birthday;
    private String address;
    private Double salary;
    private String SSN;

    public Person(String name, int age, int yearOfBirth, int birthMonth, int birthday, String address, Double salary, String SSN) {
        this.name = name;
        this.age = age;
        this.yearOfBirth = yearOfBirth;
        this.birthMonth = birthMonth;
        this.birthday = birthday;
        this.address = address;
        this.salary = salary;
        this.SSN = SSN;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getYearOfBirth() { return yearOfBirth; }
    public int getBirthMonth() { return birthMonth; }
    public int getBirthday() { return birthday; }
    public String getAddress() { return address; }
    public Double getSalary() { return salary; }
    public String getSSN() { return SSN; }
}
