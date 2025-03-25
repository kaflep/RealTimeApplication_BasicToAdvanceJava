package thisKeyword;
// use case _1:::
public class ThisKeywordWithInstanceVariable {
    private int empId;
    private String empName;
    private int empAge;

    public int getEmpId(){
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }
    // let's modify it
    public void setEmpId(int empId){
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpAge(int empAge) {
        /* 1. this(empAge) may be local and assign itself.
         because first giving access local
        empAge = empAge;
         */
        /* // 2.let's do another way, obj1.empAge is instance variable
        // still problem, when executing setEmpAge() method, we are
        // creating a new object means creating new address which not assign empAge.
        ThisKeywordWithInstanceVariable obj1 = new ThisKeywordWithInstanceVariable();
        obj1.empAge = empAge;

         */
         /*//3. passing the reference of old object, means the passing object itself.
        // public void setEmpAge(int empAge, ThisKeywordWithInstanceVariable obj)
        ThisKeywordWithInstanceVariable obj1 = obj;
        obj1.empAge = empAge;

          */
        //4. java says, do not pass object itself, by default
        // I will give this obj (ThisKeywordWithInstanceVariable obj)
        // this is represents current object( the object which is calling the method) emp.setEmpAge(30);
        // emp is current object means this is(emp) .
        this.empAge = empAge;
    }

    public static void main(String[] args) {
        ThisKeywordWithInstanceVariable emp = new ThisKeywordWithInstanceVariable();
        // this below lines means executing !!!
        //emp.setEmpAge(30);
        // 3. issue is that, passing object itself
        //emp.setEmpAge(30, emp);
        //4. emp is current object because it is calling the method.
        emp.setEmpAge(30);



        System.out.println("get Age:" + emp.getEmpAge());

    }
}
