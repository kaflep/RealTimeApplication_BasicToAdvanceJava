package thisKeyword;
// if method has object / class type as return type then method return object type value.
// eg : Test m3() { Test c = new Test(); return c;
// here Test class is our current class, then it returns current class instance since t.m3()-> I called it from main method.
public class ToReturnCurrentClassInstance {

    ToReturnCurrentClassInstance m3(){
        // what if I called m3() method a thousand times, I create new Object each time
        // and return what ? that thousand times each object, overcome this" this " keyword play it
        // this below program also returning current class object (means inside same class method, I am creating same class
        // object ?) so, this keyword is for you without creating new object !!

        //ToReturnCurrentClassInstance t1 = new ToReturnCurrentClassInstance();
        //return t1;

        // just return this instead of above two line
         return this;
    }
    // IMPORTANT: you can use this keyword to return from method only when if method is
    // going to return current object  not another class object because HelperToReturnCurrentClassInstance is another class
    // beacuse I am writing this method inside what class?? so, this refers only current class object.
//    HelperToReturnCurrentClassInstance m4() {
//        return this;
//    }

    public static void main(String[] args) {
        ToReturnCurrentClassInstance t = new ToReturnCurrentClassInstance();
        System.out.println(t.m3());
        System.out.println(t.m3());
    }
}
 class HelperToReturnCurrentClassInstance {

 }
