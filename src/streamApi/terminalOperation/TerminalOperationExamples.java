package streamApi.terminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperationExamples {
    public static void main(String[] args) {
        /*
        1. forEach(Consumer<T> action)  --- > perform action on each element of the stream and do not return any value
             same as peek but forEach is terminal operation
         */
        List<Integer> numbers= Arrays.asList(2,1,4,7,10);

        // 1. create/open stream
         numbers.stream()
                 //2. apply intermediate operation
                .filter((Integer value)-> value >=3)
                 // 3. apply terminal operation
                .forEach((Integer value1) -> System.out.println(value1));

         /*
            2. toArray()  --->  collects teh element of the stream into an Array.

          */

        List<Integer> numbersToArray= Arrays.asList(2,1,4,7,10);

        System.out.println("========  It will return Object array  =====================================");
        // 1. create/open stream
         Object [] filteredNumberArrayType1=  numbers.stream()
                //2. apply intermediate operation
                .filter((Integer value)-> value >=3)
                // 3. apply terminal operation
                .toArray();
        System.out.println(Arrays.toString(filteredNumberArrayType1));


        System.out.println("===== to specific  for  array (here is Integer), we can do String, Double, ans so on === ");


        Integer [] filteredNumberArrType2 = numbers.stream()
                .filter((Integer value) -> value >= 3)
                .toArray((int size) -> new Integer[size]);

        System.out.println(Arrays.toString(filteredNumberArrType2));


        /*
            3. reduce(BinaryOperation<T> accumulator) ---> it does reduction on the element of the stream perform
            associative aggregation function(2 element take do add, mult, sub, and so on and return 1 element)
         */

    }

}
