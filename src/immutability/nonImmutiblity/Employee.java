package immutability.nonImmutiblity;

import immutability.AddressOfEmployeeV1;

import java.util.ArrayList;
import java.util.List;

// all this immutability applies on here except 6
public final class Employee {

    private String employeeCode;
    private String employeeName;
    //mutable attribute
    private AddressOfEmployee addressOfEmployee;
    private List<String> hobbies;

    public Employee() {
    }

    public Employee(String employeeCode, String employeeName, AddressOfEmployee addressOfEmployee, List<String> hobbies) {
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        // this one is we are passing object by reference
//        this.addressOfEmployee = addressOfEmployee;
        // this one we are doing deep copy
        this.addressOfEmployee = new AddressOfEmployee(addressOfEmployee.getStreetName(),addressOfEmployee.getCity(),addressOfEmployee.getZipcode());
        // we need to change this hobby as well  as: new ArrayList<>(hobbies);
        // this.hobbies = hobbies;
        this.hobbies = new ArrayList<>(hobbies);
    }

    public String getEmployeeCode() {


        return employeeCode;
    }



    public String getEmployeeName() {

        return employeeName;
    }


    //  we need to use 6. In getter methods, return the deep copy of mutable fields
    // as return new AddressOfEmployee(addressOfEmployee.getStreetName(),addressOfEmployee.getCity(),addressOfEmployee.getZipcode());
//    public AddressOfEmployee getAddressOfEmployee() {
//
//        return addressOfEmployee;
//    }


    public AddressOfEmployee getAddressOfEmployee() {

        return new AddressOfEmployee(addressOfEmployee.getStreetName(),addressOfEmployee.getCity(),addressOfEmployee.getZipcode());
    }


//  we need to use 6. In getter methods, return the deep copy of mutable fields
    // as return new ArrayList<>(hobbies)
//    public List<String> getHobbies() {
//
//        return hobbies;
//    }
        public List<String> getHobbies() {

        return new ArrayList<>(hobbies);
    }

    // apply for 2. remove setter and can not change value
/*
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

        public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

        public void setAddressOfEmployee(AddressOfEmployee addressOfEmployee) {
        this.addressOfEmployee = addressOfEmployee;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

 */

    @Override
    public String toString(){
       return "Employee {" +
               "employeeCode= '"+ employeeCode + '\''+
               ", name='"+employeeName+'\''+
               ", address= "+ addressOfEmployee+
               ", hobbies= "+ hobbies+

               "}";
    }


}
