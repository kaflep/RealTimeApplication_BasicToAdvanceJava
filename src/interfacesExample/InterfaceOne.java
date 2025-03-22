package interfacesExample;

public interface InterfaceOne {
    void show(String a);
}
interface InterfaceTwo {
    void show(String a);
    void display();
}
class Helper implements  InterfaceOne, InterfaceTwo {


    @Override
    public void show(String a) {

    }


    @Override
    public void display() {

    }
}
 class Test {
     public static void main(String[] args) {
         Helper hel = new Helper();
         hel.show("10");
     }
 }
