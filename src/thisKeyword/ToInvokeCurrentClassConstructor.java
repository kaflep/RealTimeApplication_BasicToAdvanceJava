package thisKeyword;
// constructor call must be the first statement in constructor means  this() should be first statement in cons.
public class ToInvokeCurrentClassConstructor {
    int a;
    int b;
    int x;
    ToInvokeCurrentClassConstructor(){
      a = 10;
      b = 20;
    }
    ToInvokeCurrentClassConstructor(int p){
        // this use for current class cons.
        this();
        x = p;

    }

    public static void main(String[] args) {
        // I use this 1. for non parameterized constructor 2. for parameterized constructor but if I want to create
        // multiple cons as for client requirement then each cons I will need to create multiple object
        // to invoke that multiple constructor, so Code can lengthy, bulky, and code readability decrease
        // so, I do not need to this below 1st line when I use this() int parameterized cons .
        //ToInvokeCurrentClassConstructor t = new ToInvokeCurrentClassConstructor();
        ToInvokeCurrentClassConstructor t1 = new ToInvokeCurrentClassConstructor(30);
    }
}
