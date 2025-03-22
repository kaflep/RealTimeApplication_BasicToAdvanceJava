package ThisAndSuper;


import com.sun.security.jgss.GSSUtil;

class A {
    String name;
    int age;

//    public A(){
//
//    }
    // reference to the current object  return this
    // if I use new A(), it goes to the constructor and refers to the new object
    A get(){
        return this;
    }
    public A(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display( String s){
        System.out.println("current object ::" + name + " "+ s);
        System.out.println("current object using this::" + this.name + " ");
        System.out.println("current object ::" + age);
        System.out.println("current object using this::" + this.age);
    }

    public String toString(){
        return "Name:: "+  name + "\nAge:: "+ age;
    }
}
public class ThisAndSuperImplementation {
    public static void main(String[] args) {
        A  a = new A("pratik", 29);
        System.out.println(a);
        A a10 = a.get();
        System.out.println(a10);
        //a.display("SANA");
        A a1 = new A("ABC", 10);
        System.out.println(a1);
        System.out.println(a1.get());
    }

}
