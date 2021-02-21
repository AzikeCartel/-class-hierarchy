package ITscoolMegacom;

public class Position {
    private String name;
    private double minSalary;
    private double maxSalary;
    private Division division;
    private Department department;
    private Directorate directorate;

    public Position(String name, double minSalary, double maxSalary, Division division, Department department, Directorate directorate) {
        this.name = name;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.division = division;
        this.department = department;
        this.directorate = directorate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Directorate getDirectorate() {
        return directorate;
    }

    public void setDirectorate(Directorate directorate) {
        this.directorate = directorate;
    }

}
