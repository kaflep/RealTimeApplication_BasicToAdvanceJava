package streamApi.whyWeCallIntermedaiteOperationLazy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationLazy {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,1,4,7,10);
        Stream<Integer> numberStream = numbers.stream().filter((Integer value)-> value >=3)
                .peek((Integer value1) -> System.out.println(value1));

        //  only above line ,when I run this code nothing is printing


        //  when I write below line ,I apply terminal operation, it will print above peek() operation
        numberStream.count();

        System.out.println("======Sequence Of Stream Operation see how Excepted result vs Actual Result============== ");

        List<Integer> numbersList= Arrays.asList(2,1,4,7,10);
        Stream<Integer> numberStreamList = numbersList.stream()
                .filter((Integer value) -> value >=3)
                .peek((Integer value1)-> System.out.println("after filter: " + value1))
                .map((Integer value2)-> (value2* -1))
                .peek((Integer value3) -> System.out.println("after negating : " + value3))
                .sorted()
                .peek((Integer value4) -> System.out.println("after Sorted: " + value4));
        // see the actual result:
        List<Integer> filteredNumberStream = numberStreamList.collect(Collectors.toList());

        /*
            Excepted Result :
            after filter: 4
            after filter: 7
            after filter: 10
            after negating: -4
            after negating: -7
            after negating: -10
            after Sorted: -10
            after Sorted: -7
            after Sorted: -4
             but see the actual result


             logic is here : Generally each element processed sequence and can perform
             multiple operations, this feature helps stream to fast process the task.
         */

    }
}
