package ITscoolMegacom;

import java.util.Scanner;

public class Operation {
    Company company = new Company("Megacom", "Suymbaev st. 123");
    Directorate commercialDirectorate = new Directorate("Commercial", company);

    Department serviceDepartment = new Department("Service Department", commercialDirectorate);
    Department departmentSkip = new Department("  ", commercialDirectorate);

    Division serviceDivision = new Division("Service Division", serviceDepartment);
    Division divisionSkip = new Division("  ", departmentSkip);

    Position directorPosition = new Position("Director", 200000, 220000, divisionSkip,
            departmentSkip, commercialDirectorate);
    Position departmentLeadPosition = new Position("Department Lead", 120000, 140000,
            divisionSkip, serviceDepartment, commercialDirectorate);
    Position divisionLeadPosition = new Position("Division lead", 60000, 80000,
            serviceDivision, serviceDepartment, commercialDirectorate);
    Position managerPosition = new Position("Manager", 20000, 30000,
            serviceDivision, serviceDepartment, commercialDirectorate);

    Employee directorEmployee = new Employee("Bakyt", 210000, directorPosition, divisionSkip);

    public void setCommercialDirectorate(Directorate commercialDirectorate) {
        this.commercialDirectorate = commercialDirectorate;
        commercialDirectorate.setLeader(directorEmployee);
    }

    Employee departmentLead = new Employee("Avtandil", 140000, departmentLeadPosition, divisionSkip);

    public void setServiceDepartment(Department serviceDepartment) {
        this.serviceDepartment = serviceDepartment;
        serviceDepartment.setLeader(departmentLead);
    }

    Employee divisionLead = new Employee("Barno", 80000, divisionLeadPosition, serviceDivision);

    public void setServiceDivision(Division serviceDivision) {
        this.serviceDivision = serviceDivision;
        serviceDivision.setLeader(divisionLead);
    }

    Employee manager = new Employee("Azamat", 30000, managerPosition, serviceDivision);

    void printInfo() {
        System.out.println("name: "+ manager.getName());
        System.out.println("salary: "+manager.getSalary());
        System.out.println("position: "+manager.getPosition().getName());
        System.out.println("division: "+manager.getPosition().getDivision().getName());
        System.out.println("department: "+manager.getPosition().getDepartment().getName());
        System.out.println("directorate: "+manager.getPosition().getDirectorate().getName());
        System.out.println("company: "+manager.getPosition().getDirectorate().getCompany().getName());
        System.out.println();

        System.out.println("name: "+ directorEmployee.getName());
        System.out.println("salary: "+directorEmployee.getSalary());
        System.out.println("position: "+directorEmployee.getPosition().getName());
        System.out.println("division: "+directorEmployee.getPosition().getDivision().getName());
        System.out.println("department: "+directorEmployee.getPosition().getDepartment().getName());
        System.out.println("directorate: "+directorEmployee.getPosition().getDirectorate().getName());
        System.out.println("company: "+directorEmployee.getPosition().getDirectorate().getCompany().getName());
        System.out.println();
    }
}
