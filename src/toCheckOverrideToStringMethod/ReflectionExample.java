package toCheckOverrideToStringMethod;

/*
When I mention using Java reflection to check if a class has overridden the toString() method,
 I mean that you can use the reflection API in Java to inspect a class at runtime and see if
 the toString() method has been explicitly overridden in that class.

Reflection allows you to inspect the structure of classes, methods, fields, and constructors
 dynamically. Using reflection, you can check the methods of a class to see if it has a custom
  implementation of the toString() method.
 */

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;


public class ReflectionExample {

        public static void main(String[] args) throws NoSuchMethodException {

            System.out.println("====================================================");
            // ============ HOW TO GET ALL METHODS OF ANY CLASS OR INTERFACES IN JAVA =================================
            // get the list class object
            Class<?> listClass = Class.class;
            // get all methods of the list interface
             Method[] methods = listClass.getDeclaredMethods();

            // Print class name and number of methods
            System.out.println("Class: " + listClass.getName());
            System.out.println("Number of methods: " + methods.length);

            // Sort methods by name
            Arrays.sort(methods, (m1, m2) -> m1.getName().compareTo(m2.getName()));
             //print all the method names
            for(Method method: methods){
                System.out.println(method.getName());
            }

            System.out.println("====================================================");
            // ============ HOW TO FIND PACKAGE OF  ANY CLASS OR INTERFACES IN JAVA =================================
                // List of classes or interfaces you want to check
                Class<?>[] classes = {String.class, List.class, ArrayList.class, Object.class, Collections.class, Map.class,
                Class.class}; // Add more classes/interfaces here

                for (Class<?> clazz1 : classes) {
                    // Get the package of the class
                    Package pkg = clazz1.getPackage();

                    // Print class/interface name and package
                    System.out.println("Class: " + clazz1.getName());
                    System.out.println("Package: " + (pkg != null ? pkg.getName() : "No package (default package)"));
                    System.out.println();
                }

                // ===================ANOTHER WAY TO GET PACKAGE NAME ==========================
                System.out.println(String.class.getPackage());


            System.out.println("====================================================");
            // ============ IF I NEED TO KNOW WHERE TOSTRING() METHOD DECLARED(DO ONLY FOR CLASS NOT INTERFACE=====
            Method method = ArrayList.class.getMethod("toString");
            System.out.println(method.getDeclaringClass().getName());

        }

    }


