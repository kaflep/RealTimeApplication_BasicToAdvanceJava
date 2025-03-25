package thisKeyword;
// what if? If I invoke non-static method from another non-static method
public class ThisKeywordInvokeCurrentMethod {

    void m(){

        System.out.println("this is m method");
    }
    void m1(){
        // does this valid ? how ? how we can call non-static method without any object ?
        // to call instance method/ object method / non-static method we need to use object or
        // reference variable, but I did not use any reference variable  m1() method
        // how compiler understand that m() method belongs to which object ?
        // so compiler implicitly/ internally use this keyword as reference variable
        // so, it adds this.m()  it means this.m() == m();, this can call current class method

        m(); // or this.m(); // compiler adds
        System.out.println("This is m1 method");
    }

    public static void main(String[] args) {
        ThisKeywordInvokeCurrentMethod t = new ThisKeywordInvokeCurrentMethod();
        // we can invoke non-static method / block/ variable from static method /block
        t.m1();
    }
}
