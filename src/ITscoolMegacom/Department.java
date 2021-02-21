package ITscoolMegacom;

public class Department {
    private String name;
    private Directorate directorate;
    private Employee leader;

    public Department(String name, Directorate directorate) {
        this.name = name;
        this.directorate = directorate;
    }

    public Department(Employee leader) {
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directorate getDirectorate() {
        return directorate;
    }

    public void setDirectorate(Directorate directorate) {
        this.directorate = directorate;
    }

    public Employee getLeader() {
        return leader;
    }

    public void setLeader(Employee leader) {
        this.leader = leader;
    }

}
