/*
package immutability.nonImmutiblity;

import java.util.List;

//  by using inheritance ue can break the immutability even there is no setter method in Employee
// so to solve this need to use final keyword in Employee class  so that we can not extend
public class HelperClass extends Employee{
    private String name;
    public HelperClass(String employeeCode, String employeeName, AddressOfEmployee addressOfEmployee, List<String> hobbies){
        super(employeeCode,employeeName,addressOfEmployee,hobbies);
        this.name = employeeName;

    }
    @Override
    public String getEmployeeName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

 */
