package thisKeyword;
// what if I want to call one method form another method ?
// when we pass object to the method as parameter at the time of
// method calling we need to pass object but in real, we need to pass method/ reference variable, we do
// not pass object to the method call.
// One object can have multiple reference variable
public class PassAsAnArgumentInMethodCall {
    float pi =3.14f;
    // here below passing circle class object, so, we can use this circle class object
    // to get the value of diameter form Circle class.

    // calculator method received current class object that is circle class object.
    void calculator(Circle c){
        System.out.println("Circumference of circle: "+ pi * c.d  + "cm");

    }
}
class Circle {
    int d = 18;
    void m1(){
        //1. calculator(cr); is issue because cr is local variable of mein method
         /* //2. we can create new object of circle class, still we got the issue because
        // calculator(cri); calculator method is belongs to PassAsAnArgumentInMethodCall class.
        Circle cri = new Circle();
        calculator(cri);

          */
        /* //3. need to create a PassAsAnArgumentInMethodCall class object
        Circle cri = new Circle();
        PassAsAnArgumentInMethodCall pa = new PassAsAnArgumentInMethodCall();
        pa.calculator(cri);
        */

        //4. we do not have any option to call PassAsAnArgumentInMethodCall method we need to create PassAsAnArgumentInMethodCall method.
        // but we do not need to create Circle class object because circle class is our
        // current class( because m1() method inside Circle class). why do we need it? since java provides this keyword that
        // always refer or point current class object

        //Circle cri = new Circle();
        //PassAsAnArgumentInMethodCall pa = new PassAsAnArgumentInMethodCall();
        // this can be referred current class object, so at the time of
        // method call we need pass Circle class reference variable
        //pa.calculator(this);

        // above line we can do this way 1. PassAsAnArgumentInMethodCall pa = new PassAsAnArgumentInMethodCall(); 2. pa.calculator(this);
        // because I am not using this pa reference variable anywhere in this program only I have just used it
        // only call this calculator() method so we do not create it pa (reference variable)
        new PassAsAnArgumentInMethodCall().calculator(this);
    }

    public static void main(String[] args) {
        //1.calculator(); error, we will need object of circle class
        Circle cr = new Circle();
        //2. still is issue can not call calculator(cr); because
        // this method calculator(cr) belongs to PassAsAnArgumentInMethodCall class object

        //3. comment out 2 line below
        // PassAsAnArgumentInMethodCall t = new PassAsAnArgumentInMethodCall();
        //t.calculator(cr);
        // but issue is that if I call m1() thousand times ? create those 2 object a thousand times of m1() method
        // so, execution time increase and performance issue
        cr.m1();
    }
}
