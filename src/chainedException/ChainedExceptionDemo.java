package chainedException;

public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try{
            method1();
        }
        catch(Exception exception1){
            // to see the all added message
            //System.out.println("solved "+ exception1);
            // to print which one caused by who
            exception1.printStackTrace();
        }
    }
     public static void method1() throws Exception{
        try{
            method2();
        }
        catch (Exception exception2) {
            throw new Exception("Exception throw in method 1 !!! " + exception2);
        }
     }
      public static void method2() throws Exception {
        try {
            method3();
        }
        // so, back from method3 , and method2 handle exception to method3 using try, and catch block
        //but again throw exception, and "merging Exception throw in method 2" + "Exception throw in method 3"
        // + exception3 --->  is the object which is having this message (exception3) which is throne by method3
        //("Exception throw in method 3"), now 2 string are merged here and new object throw using throw keyword to caller(method1)
        catch(Exception exception3){
            throw new Exception("Exception throw in method 2 ??? " + exception3);
        }
    }
     public static void method3() throws Exception {
        // 1.this (method3) will throw an object of exception class using throw keyword
         // this (method3) is called by method2 so, this exception will handle by method2.
        throw new Exception("Exception throw in method 3 ### ");
     }
}

