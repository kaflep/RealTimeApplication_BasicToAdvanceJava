package thisKeyword;
// cons call need because when you will start coding on real time application, you might have to perform some task
// at the time of object creation before executing any method
public class ToPassAsAnArgumentInConstructorCall {
    int p = 10;
    ToPassAsAnArgumentInConstructorCall(){
        //ToPassAsAnArgumentInConstructorCall aa = new ToPassAsAnArgumentInConstructorCall();
        // we can pass "this " because ToPassAsAnArgumentInConstructorCall is our current class, see in main I created object of this class
        // and above line not need it aa == this
        HelperToPassAsAnArgumentInConstructorCall bb = new HelperToPassAsAnArgumentInConstructorCall(this);

        // let's call the HelperTo method
        bb.add();
    }

    public static void main(String[] args) {
        ToPassAsAnArgumentInConstructorCall a = new ToPassAsAnArgumentInConstructorCall();
        System.out.println(a); // if same as HelperTo same obj2 that means same object referring


    }
}
 class HelperToPassAsAnArgumentInConstructorCall {
    int q = 20;
    // why q is getting error because  value of p is available in another class
     // to get the value of p from class ToPassAsAnArgumentInConstructorCall we need object of that class
     //1. is passing argument in method call
        //void add(ToPassAsAnArgumentInConstructorCall t){
        //System.out.println("sum: "+ t.p +q);
        //}
     //2. is passing argument in cons call.
        // this need because above this has hold reference of class ToPass Object and to store that reference we need
     // class ToPass.. types variables
      ToPassAsAnArgumentInConstructorCall obj2;

     // need to create cons matching above Class (ToPass....) and pass argument same as ToP types of variable because
     // I am using this keyword in that cons (ToPass...)
      HelperToPassAsAnArgumentInConstructorCall(ToPassAsAnArgumentInConstructorCall obj1) {
        obj2 = obj1;
          System.out.println(obj2);
      }
    void add(){
        System.out.println("sum: "+ (obj2.p +q));
    }
 }
