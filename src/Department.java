import java.util.ArrayList;

public abstract class Department {

    private ArrayList<Employee> EmployeesList;
    private ArrayList<Job> JobsList;


    public abstract double getTotalSalaryBudget();

    public ArrayList<Job> getJobs() {
        return JobsList;
    }

    public void add(Employee employee) {
        EmployeesList.add(employee);
    }

    public void remove(Employee employee) {
        EmployeesList.remove(employee);
    }

    public void add(Job job) {
        JobsList.add(job);
    }

    public ArrayList<Employee> getEmployees() {
        return EmployeesList;
    }



}
