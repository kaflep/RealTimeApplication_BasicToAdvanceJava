package immutability.nonImmutiblity;

import java.util.ArrayList;
import java.util.List;

public class TestOfEmployee {
    public static void main(String[] args) {

        /*
        // this one apply for 2. I need to remove setter form Employee class
       AddressOfEmployee addEmp = new AddressOfEmployee("Winthrop","Chicago",60660);

       List<String> hobbies = new ArrayList<>();
       hobbies.add("cricket");

       Employee emp = new Employee("1234","pratik kafle",addEmp,hobbies);
        System.out.println(emp);
       emp.setEmployeeCode("6789");
       emp.setEmployeeName("Sukriti Acharya");
        System.out.println(emp);



         */


/*
        // this one apply for inheritance(HelperClass) way to break the immutability, so it's value get changed
       AddressOfEmployee addEmp = new AddressOfEmployee("Winthrop","Chicago",60660);

       List<String> hobbies = new ArrayList<>();
       hobbies.add("cricket");

       HelperClass helpCls = new HelperClass("1234","pratik kafle",addEmp,hobbies);
       Employee emp = (Employee)helpCls;
       System.out.println(emp.getEmployeeName()); // print pratik kafle
       helpCls.setName("Fred");
        System.out.println(emp.getEmployeeName());// print Fred



 */
/*
        // this one apply for 5. initialized mutable fields on a constructor by performing deep copy
        // but still can break immutability
       AddressOfEmployee addEmp = new AddressOfEmployee("Winthrop","Chicago",60660);

       List<String> hobbies = new ArrayList<>();
       hobbies.add("cricket");

       Employee emp = new Employee("1234","pratik kafle",addEmp,hobbies);
        System.out.println(emp);

       addEmp.setCity("MA");
       addEmp.setZipcode(6543);
       hobbies.add("basketball");
       System.out.println(emp);

 */
        // above 5. we can break immutability
        // then I utilize 6.In getter methods, return the deep copy of mutable fields, in getter of Employee class
        // now we can not break it

        AddressOfEmployee addEmp = new AddressOfEmployee("Winthrop","Chicago",60660);

        List<String> hobbies = new ArrayList<>();
        hobbies.add("cricket");

        Employee emp = new Employee("1234","pratik kafle",addEmp,hobbies);
        System.out.println(emp);
        AddressOfEmployee newAddress = emp.getAddressOfEmployee();
        newAddress.setCity("MA");
        newAddress.setZipcode(3333);
        List<String> newHobbies = emp.getHobbies();
        newHobbies.add("basketball");
        System.out.println(emp);





    }
}
