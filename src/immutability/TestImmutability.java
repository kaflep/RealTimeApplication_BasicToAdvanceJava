package immutability;

import immutability.nonImmutiblity.AddressOfEmployee;
import immutability.nonImmutiblity.Employee;

import java.util.ArrayList;
import java.util.List;

public class TestImmutability {
         public static void main(String[] args) {
            AddressOfEmployeeV1 addEmp = new AddressOfEmployeeV1("Winthrop","Chicago",60660);

            List<String> hobbies = new ArrayList<>();
            hobbies.add("cricket");

            ImmutabilityClassAccess emp = new ImmutabilityClassAccess("1234","pratik kafle",addEmp,hobbies);
            System.out.println(emp);
            addEmp.setCity("MA");
            addEmp.setZipcode(2345);
            hobbies.add("basketball");
            System.out.println(emp);

        }
}


