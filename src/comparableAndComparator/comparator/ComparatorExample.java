package comparableAndComparator.comparator;

public class ComparatorExample {
/*1. Comparable present in java.util package, and it has 2 method compare(Object obj2, Object obj2), and equals()
-----> whenever we are implement comparator interface compulsory we should provide implements only for
    compare method & we are not required to provide implement for equals method(because it is already available to our
    class from Object class Through inheritance) here,......ComparatorExample by default extends Object class......
    2. comparable meant customized sorting order
    3. return type of compare() is int not boolean because it has 3 options are return
    =================================================================================
    4. there are specific rules :
    5. obj1.compare(obj2) : i. return -ve(negative) if and only if obj1 has to come before obj2 (obj1 < oj2), no swap.
                              ii. i. return +ve(positive) if and only if obj1 has to come after obj2 (obj1 > obj2),swap occur.
                              iii. i. return 0 if  obj1 and obj2 are equals.
    6. we are using for multiple sorting logic whatever logic you want to write you can create individual class for sorting logic.

    */
    private int empId;
        private String name;
        private String phone;


        public ComparatorExample(int empId, String name, String phone) {
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

