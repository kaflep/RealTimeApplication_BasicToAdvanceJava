package assignmentTwo.inheritance;

public class Employee {

    private String name;
    private int employeeId;

    public Employee() {
    }

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // calculate salary
    public void calculateSalary(){
        System.out.println("please provide the salary for full time and part time employee ");
    }
}
 class FullTime extends Employee {

    public FullTime(String name, int employeeId){
        super(name, employeeId);
    }

    @Override
     public void calculateSalary(){
        System.out.println("Employee Id: "+ this.getEmployeeId()+ "\nEmployee Name : "+  this.getName()
                +" your salary for this full time position is 120K annually" );
    }
 }
class PartTime extends Employee {

    public PartTime(String name, int employeeId){
        super(name, employeeId);
    }

    @Override
    public void calculateSalary(){
        System.out.println("Employee Id: "+ this.getEmployeeId()+ "\nEmployee Name : "+  this.getName()
                +" your salary for this part time position is 70K annually" );
    }
}
class ManagementOffice {
    public static void main(String[] args) {
        Employee employee = new FullTime("pratik", 6789);
        employee.calculateSalary();

        Employee employee1 = new PartTime("mahesh" , 4567);
        employee1.calculateSalary();

    }

}
