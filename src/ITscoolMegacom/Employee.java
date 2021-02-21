package ITscoolMegacom;

public class Employee {
    private String name;
    private double salary;
    private Position position;
    private Division division;

    public Employee(String name, double salary, Position position, Division division) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.division = division;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }
}
