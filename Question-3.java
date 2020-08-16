import java.util.ArrayList;

class Employee{
    private int empId;
    private String empName;
    private String empDesignation;
    private int empSalary;
    private String empLocation;

    public Employee(int empId, String empName, String empDesignation, int empSalary, String empLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary=" + empSalary +
                ", empLocation='" + empLocation + '\'' +
                '}';
    }
}

public class abhi {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Abhishek","Janitor",9034,"Buffalo"));
        employees.add(new Employee(2,"Bhanu","Senior Executive",67000,"Lockport"));
        employees.add(new Employee(3,"Cherry","CEO",17567,"Middletown"));
        employees.add(new Employee(4,"Daneil","COO",154545,"Ithaca"));
        employees.add(new Employee(5,"shivam","COT",15455,"Mount Vernon"));
        employees.add(new Employee(6,"Germain","Assistant Manager",6546,"Geneva"));
        employees.add(new Employee(7,"Jennet","Tech Support Manager",45567,"Newburgh"));
        employees.add(new Employee(8,"Hulk","Finance",56547,"Rochester"));
        employees.add(new Employee(9,"Jack","Project Manager",67657,"Watertown"));
        employees.add(new Employee(10,"Kelvin","Assistant",57674,"Columbia"));

        System.out.println(" All names of employees: \n");
        employees.stream().forEach(e->System.out.println(e.getEmpName()));

        System.out.println("\n All salaries greater than 50,000: \n");
        employees.stream().filter(e->e.getEmpSalary()>50000).forEach(e->System.out.println("Name : " + e.getEmpName() + " , Salary : " + e.getEmpSalary()));

        System.out.println("\n All locations starting with letter \'M\' : \n");
        employees.stream().filter(e->e.getEmpLocation().startsWith("M")).forEach(e->System.out.println("Name : " + e.getEmpName() + " , Location : " + e.getEmpLocation()));

        System.out.println("\n All designations ending with \'E\'");
        employees.stream().filter(e->e.getEmpDesignation().endsWith("e")).forEach(e-> System.out.println("Name : " + e.getEmpName() + " , Designation : " + e.getEmpDesignation()));

    }
}
