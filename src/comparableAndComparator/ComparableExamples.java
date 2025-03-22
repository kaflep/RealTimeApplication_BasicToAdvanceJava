

package comparableAndComparator;


/*1. Comparable present in java.lang package, and it has only 1 method compareTo(Object obj)(we can say functional interface as well)
    2. comparable meant for default natural sorting order(ascending)
    3. string , wrapper classes are follow the comparable impl.
    4. return type of compareTo() is int not boolean because it has 3 options are return
    =================================================================================
    5. there are specific rules :
    6. obj1.compareTo(obj2) : i. return -ve(negative) if and only if obj1 has to come before obj2 (obj1 < oj2), no swap.
                              ii. i. return +ve(positive) if and only if obj1 has to come after obj2 (obj1 > obj2),swap occur.
                              iii. i. return 0 if  obj1 and obj2 are equals.
    7. one time you can use one logic, like id , or name or phone just 1
        if you want to change id to name you need to change in compareTo() this.name - o.name instead of this.empId -o.empId
         and compile it again.
 */


public class ComparableExamples implements Comparable<ComparableExamples>{
    private int empId;
    private String name;
    private String phone;

    @Override
    public int compareTo(ComparableExamples o) {
//        // compare to current object(this) and o.
////        return this.empId - o.empId;
//        // this.empId is greater return +ve, o.empId is greater return -ve
        if(this.empId > o.empId){
            return +1;
        }
        else if (this.empId < o.empId){
            return -1;
        }
        else{
            return 0;
        }
    }

    public ComparableExamples(int empId, String name, String phone) {
        this.empId = empId;
        this.name = name;
        this.phone = phone;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    // if I want to print details I need to Override toString() method


    @Override
    public String toString() {
        return "ComparableExamples{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


}
