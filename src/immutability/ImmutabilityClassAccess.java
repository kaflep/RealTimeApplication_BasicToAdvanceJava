
package immutability;

import java.util.ArrayList;
import java.util.List;

// Immutable means, once an object of a class is created we can't change its state.
/*
1. make all fields/ attributes private so that direct access is not allowed
2. do not write any setter methods for a class
3. Add all arguments' constructor for object creation
4. a class must be final so that it can not be extended
5. initialized mutable fields on a constructor by performing deep copy
6. In getter methods, return the deep copy of mutable fields

 */
    /*
    ADVANTAGES OF IMMUTABLE CLASSES
    1. Thread safe: the state of immutable class objects can not be changed once it's created. so, we can
    safely use them in multithreaded environment without worrying about locking, synchronized
    2. Caching : An immutable class objects are good candidate for caching as we do not have to worry about its state change
    3. Easier to debug: easy to debug cus we are certain that state the object doesn't change once it's
    created and more easily to track down where bugs started from.
 */
// all wrapper classes and String class, bigDecimal, bigInteger are immutable

//4.
public final class ImmutabilityClassAccess {
    //1.
    private String employeeName;
    private String employeeCode;
     private AddressOfEmployeeV1 addressOfEmployeeV1;
    private List<String> hobbies;

    //3.
    public ImmutabilityClassAccess(String employeeName, String employeeCode,AddressOfEmployeeV1 addressOfEmployeeV1, List<String> hobbies) {
        this.employeeName = employeeName;
        this.employeeCode = employeeCode;
        //5.
        this.addressOfEmployeeV1 = new AddressOfEmployeeV1(addressOfEmployeeV1.getStreetName(),addressOfEmployeeV1.getCity(),addressOfEmployeeV1.getZipcode());
        this.hobbies = new ArrayList<>(hobbies);
    }

    //2.
    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public AddressOfEmployeeV1 getAddressOfEmployeeV1() {
        return new AddressOfEmployeeV1(addressOfEmployeeV1.getStreetName(),addressOfEmployeeV1.getCity(),addressOfEmployeeV1.getZipcode());
    }

    public List<String> getHobbies() {

        return new ArrayList<>(hobbies);
    }

    @Override
    public String toString(){
        return "Employee {" +
                "employeeCode= '"+ employeeCode + '\''+
                ", name='"+employeeName+'\''+
                ", address= "+ addressOfEmployeeV1+
                ", hobbies= "+ hobbies+

                "}";
    }
}
