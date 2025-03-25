package thisKeyword;



public class ThisAndTRefersSameObject {
    void m1(){
        /*
        in main method call t.m1() t automatically replace by compiler with "this" inside m1()
        because "this" always refers to the current instance of the class on which the method is invoked.
        t == "this" since t is reference variable of current class(ThisAndTRefersSameObject) object,
        when I call t.m1() , t is local/scope reference variable of main method, so t must pass "this" for current object
         */
        System.out.println(this);
    }
    public static void main(String[] args) {
       ThisAndTRefersSameObject t = new ThisAndTRefersSameObject();
       /*this reference variable t println(t) and  reference variable this
        println(this) refers to same ThisAndTRefersSameObject class object
        that is current class object
        */
        System.out.println(t);
        t.m1();
        // ===========  output ==================
        // thisKeyword.ThisAndTRefersSameObject@58372a00
        // thisKeyword.ThisAndTRefersSameObject@58372a00

        //Answer of Question #3: why compiler error ? because implicitly "this"
        // or by default final we can not change value of this, means we can not reassign
        // value of "this" in java.
        //this = new ThisAndTRefersSameObject();
    }
}
