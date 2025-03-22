package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateAStream {

    /*
    1. Collection
    2.Array
    3.static
    4.string.builder
    5. iterator

     */

    public static void main(String[] args) {
        /*.................  1. from Collection, ...........*/
        //i. we can create a list from subclasses of list plus Arrays.asList, List.of
        List<Integer> createAList = List.of(3000,4000,5000,600,2000);
        //ii. create a Stream from collection
        Stream<Integer> streamFromCollection = createAList.stream();

        /*...................2. from Array  ...........*/
        //i. we can create Array
        Integer [] array = {2000,3000,4000,5000,6000};
        //ii. create a Stream from array
        Stream<Integer> streamFromArray = Arrays.stream(array);


        /*....................3. from Static ............*/
        //i. we are creating stream from static
        Stream<Integer> streamFromStatic = Stream.of(1000,2000,3000,4000);


        /* ................4. Stream Builder .............*/
        //i. create a stream builder method using Stream.builder() that gives Stream.Builder object
        Stream.Builder<Integer> streamFromBuilder = Stream.builder();
        //ii. and we can add (.add() method


        streamFromBuilder.add(2000).add(4000).add(60000);
        //iii. .build() method that builds stream
        Stream<Integer> streamFromStreamBuilder = streamFromBuilder.build();

        /*...................... 5. from Stream iterator ...... */
        //i. 1000 is here (starting point) must require , every time increase by 5000 up to  must require (limit). here limit is(5).
        Stream<Integer> streamFromIterator = Stream.iterate(1000,(Integer n) -> n + 500).limit(5);
    }
}
