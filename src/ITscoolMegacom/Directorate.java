package ITscoolMegacom;

public class Directorate {
    private String name;
    private Company company;
    private Employee leader;

    public Directorate(String name, Company company) {
        this.name = name;
        this.company = company;
        this.leader = leader;
    }

    public Directorate(Employee leader) {
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employee getLeader() {
        return leader;
    }

    public void setLeader(Employee leader) {
        this.leader = leader;
    }

}
