package ITscoolMegacom;

public class Division {

    private String name;
    private Employee leader;
    private Department department;

    public Division(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Division(Employee leader) {
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getLeader() {
        return leader;
    }

    public void setLeader(Employee leader) {
        this.leader = leader;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
