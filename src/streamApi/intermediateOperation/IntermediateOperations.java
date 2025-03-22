package streamApi.intermediateOperation;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// it requires 0 or more intermediate operation
public class IntermediateOperations {

    public static void main(String[] args) {
        /*
           1. filter(Predicate<T> predicate) -----> filter the element, take 1 parameter and return boolean (true /false)
                    if true, pass the element to another intermediate operations(if applicable) or terminal operations
                    if false, discard that element
        */
        // ================ ANOTHER WAY WE CAN DO ===============================

        System.out.println("============= (Step 3)Filtering elements based on length ============");
        //i. create a stream
        Stream<String> nameStreamForFilter  = Stream.of("hello", "Everyone", "how");
        //ii. intermediate operation
        Stream<String> filterStream = nameStreamForFilter.filter((String name) -> name.length()>3);
        //iii. terminal operation
        List<String> filterNameFromList = filterStream.collect(Collectors.toList());

       System.out.println(filterNameFromList);

        // ================ ANOTHER WAY WE CAN DO AS WELL  ===============================

        System.out.println("============= (Step 2) Another way filtering elements based on length ============");
        //i. create a stream
        Stream<String> nameStreamForFilter1  = Stream.of("hello", "Everyone", "how").filter((String name) -> name.length()>3);
        //iii. terminal operation
        List<String> filterNameListFromFilter1 = nameStreamForFilter1.collect(Collectors.toList());
        System.out.println(filterNameListFromFilter1);

        //==============================ANOTHER WAY TO WE CAN DO AS WELL=============================

        System.out.println("========================(Step 1)Another way filtering elements based on length =========== ");

        List<String> filterNameListFromFilter2 = Stream.of("hello", "Everyone", "how").filter((String name) -> name.length()>3)
                        .collect(Collectors.toList());
        System.out.println(filterNameListFromFilter1);


        /*
        2. map(Function<T,R> mapper)  ---->  used to transform(original value to change/update but size remains same)
         each element individually
          ---> accept 1 parameter and updated value will return
         */

        //========================== WE CAN DO THIS WAY =============
        System.out.println("===============(Step 3)Mapping each elements and returning for updating the elements =============");

        //i. create a stream
        Stream<String> nameStreamForMapping  = Stream.of("hello", "Everyone", "how");
        //ii. intermediate operation
        Stream<String> filterStream1 = nameStreamForMapping.map((String name) -> name.toUpperCase());
        //iii. terminal operation
        List<String> mappingNameListFromMap = filterStream1.collect(Collectors.toList());
        System.out.println(mappingNameListFromMap);


        // =============== WE CAN DO TWO LINE  ======
        System.out.println("=============== (Step 2) Another Way Mapping each elements and returning for updating the elements =============");
        Stream<String> filterStream2 =  Stream.of("hello", "Everyone", "how").map((String name) -> name.toUpperCase());
        List<String> filterNameList3 =filterStream2.collect(Collectors.toList());
        System.out.println(filterNameList3);

        // =============== WE CAN SINGLE TWO LINE  ======
        System.out.println("=============== (Step 1)Another Way Mapping each elements and returning for updating the elements =============");

        List<String> filterNameList2 = Stream.of("hello", "Everyone", "how").map((String name) -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(filterNameList2);

        /*
            3. flatMap(Function<T, Stream<R>>mapper)   ---> if you have a list of list, it will go to flat (straight)
                ---> used to iterate over each element of the complex collection, and helps to flatten it.

         */
        System.out.println("==================converting flat map to single map =================");

        // 1. creating a lis of list
        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I","LOVE"," JAVA"),
                Arrays.asList("CONCEPTS","ARE","CLEAR"),
                Arrays.asList("ITS","VERY","EASY")
        );

        //2. create/ open a stream form the list of list (sentenceList.stream()),
        //  .flatMap , each element of this list pass to Function where accept 1 parameter and returns it
        //  with single list (keep adding on top of it ) not nested list
        //  I made a single list and, I convert in just a stream (sentence.stream())
        Stream<String> wordsStream1 = sentenceList.stream().flatMap((List<String> sentence)-> sentence.stream());

        // 3. flatMap converted nested list to single list, and collecting as list.
        List<String> singleList = wordsStream1.collect(Collectors.toList());
        System.out.println(singleList);


        System.out.println("============ converting flat map to single map and updating single map's element as well ======");
        // Another use of flatMap:::::::::::::, we can modify, the element
        //2. create/ open a stream form the list of list (sentenceList.stream())
        Stream<String> wordsStream2 = sentenceList.stream().
        // intermediate operation to make single list(flatmap), converted in a stream (sentence1.stream())
        // I did again intermediate operation .map and perform on single list with change lower case.
        flatMap((List<String> sentence1) -> sentence1.stream().map((String value)-> value.toLowerCase()));

        //3. collecting as list
        List<String> singleList1 = wordsStream2.collect(Collectors.toList());
        System.out.println(singleList1);


        /*
            4. distinct()  ---> remove duplicate from the list
         */
        System.out.println("===============removed duplicate ========================");
        Integer [] numArray = {1,5,2,7,7,4,5,2,9,0,4,8};
        // 1.create a stream from the array
        Stream<Integer> arrayStream = Arrays.stream(numArray);

        // 2.use intermediate operation
        Stream<Integer> getDistinctElement = arrayStream.distinct();


        //3. collecting as list
        List<Integer> distinctNumber = getDistinctElement.collect(Collectors.toList());
        System.out.println(distinctNumber);


        // ===================== WE CAN DO TWO LINE AS WELL ===================
        //Integer [] numArray = {1,5,2,7,7,4,5,2,9,0,4,8};

        Stream<Integer> arrayStream1 = Arrays.stream(numArray).distinct();
        // collecting as list
        List<Integer> distinctNumber1 = arrayStream1.collect(Collectors.toList());

        System.out.println(distinctNumber1);
        //============= WE CAN DO SINGLE LINE AS WELL ==================
        //Integer [] numArray = {1,5,2,7,7,4,5,2,9,0,4,8};
        List<Integer> distinctNumber2 = Arrays.stream(numArray).distinct().collect(Collectors.toList());
        System.out.println(distinctNumber2);


        /*
            5. sorted()  -----> sorts the element
         */
        System.out.println("====================(Step 3) sorted array =====================");
        Integer[] numberArrays = {1,5,2,7,4,4,2,0,9};
        // 1.create a stream from the array
        Stream<Integer> numStream = Arrays.stream(numberArrays);

        // 2.use intermediate operation
        Stream<Integer> streamForSorted = numStream.sorted();

        //3. collecting as list
        List<Integer> sortedList = streamForSorted.collect(Collectors.toList());
        System.out.println(sortedList);


        // ===================== WE CAN DO TWO LINE AS WELL ===================
        //Integer[] numberArrays = {1,5,2,7,4,4,2,0,9};
        System.out.println("==============(Step 2) Another way to sorted array==================");
        Stream<Integer> arrayStreamSorted = Arrays.stream(numberArrays).sorted();
        // collecting as list
        List<Integer> sortedListValue = arrayStreamSorted.collect(Collectors.toList());
        System.out.println(sortedListValue);

        //============= WE CAN DO SINGLE LINE AS WELL ==================
        //Integer[] numberArrays = {1,5,2,7,4,4,2,0,9};
        System.out.println("============(Step 1) Another way to sorted array ====================================");
        List<Integer> sortedListValue2 = Arrays.stream(numberArrays).sorted().collect(Collectors.toList());
        System.out.println(sortedListValue2);

        // ====================== sorts the String elements ========================
        System.out.println("=============== Sorts reverse order  =======================");
            // =========== ONE APPROACH IS THIS WAY ===========================
        Integer[] numberArrays1 = {1,5,2,7,4,4,2,0,9};
        // 1.create a stream from the array
        Stream<Integer> numStream1 = Arrays.stream(numberArrays);

        // 2.use intermediate operation
        Stream<Integer> streamForSorted1 = numStream1.sorted(Comparator.reverseOrder());

        //3. collecting as list
        List<Integer> sortedList1 = streamForSorted1.collect(Collectors.toList());
        System.out.println(sortedList1);


        System.out.println("===============  Another way to sort reverse/ descending  order  =======================");
        // =========== ONE APPROACH IS THIS WAY ===========================
        Integer[] numberArrays2 = {1,5,2,7,4,4,2,0,9};
        // 1.create a stream from the array
        Stream<Integer> numStream2 = Arrays.stream(numberArrays);
        // 2.use intermediate operation
        Stream<Integer> streamForSorted2 = numStream2.sorted((Integer val1, Integer val2)-> val2 -val1);

        //3. collecting as list
        List<Integer> sortedList2 = streamForSorted2.collect(Collectors.toList());
        System.out.println(sortedList2);

        // ===================== SORTED ARRAY WITH STRING =====================
        System.out.println("=================Sorted array ascending with String ================");
        String [] stringArray = {"hello","hey","there","please"};
        // 1.create a stream from the array
        Stream<String> stringStream = Arrays.stream(stringArray);
        // 2.use intermediate operation
        Stream<String> streamForSortedString = stringStream.sorted();

        //3. collecting as list
        List<String> StringSortedList = streamForSortedString.collect(Collectors.toList());
        System.out.println(StringSortedList);

        System.out.println("=================Sorted array reverse/descending with String ================");
        //String [] stringArray = {"hello","hey","there","please"};
        // 1.create a stream from the array
        Stream<String> stringStream1 = Arrays.stream(stringArray);
        // 2.use intermediate operation
        Stream<String> streamForSortedString1 = stringStream1.sorted(Comparator.reverseOrder());
        //3. collecting as list
        List<String> StringSortedList1 = streamForSortedString1.collect(Collectors.toList());
        System.out.println(StringSortedList1);


        /*
               6. peek() -----> takes 1 parameter, and it will print each value because there is no return type
               (which is  functional interface is (consumer)).
               --->  we use peek() basically debuting purpose, to see what/ how many element back there before
               applying intermediate operation , and how many element come after intermediate operation.
         */

        System.out.println("============================ peek() prints value before and after intermediate operation=========== ");
        List<Integer> numberList = Arrays.asList(2,1,3,4,6,7,11,17,12,13);

        //1. create/ open  a stream
        Stream<Integer> numberStream = numberList.stream();
        //2. intermediate operation, let's see how many element before applying intermediate operation(this is optional)
        Stream<Integer> numberStream1 = numberStream.peek((Integer value)-> System.out.println(value));
        //3. applying the intermediate operation and see how many element that we have come after operation
        // ,but it comes 1st peek with result mixed ---->  2,1,3,4,4,6,6,7,7,11,17,17,12,12,13,13
        Stream<Integer> numberStream2 = numberStream1.filter((Integer value1)->value1 >3)
                .peek((Integer value2)-> System.out.println(value2));

        //4. collecting as list
        List<Integer> outputAfterFilter = numberStream2.collect(Collectors.toList());
        System.out.println(outputAfterFilter);
    // =============ANOTHER WAY TO USE PEEK()================

        System.out.println("============== another way to use peek operation with many intermediate operation ================");
        //1. create/ open  a stream
        Stream<Integer> numberStreams2 = numberList.stream();
        //3. applying the intermediate operation and see how many element that we have come after operation
        Stream<Integer> numberStream3 = numberStreams2.filter((Integer value1)->value1 >3)
                .peek((Integer value2)-> System.out.println(value2))
                // after the filtering value, it will apply on map , it means, filter's true statements take out by map, is not
                // doing from beginning.
                .map((Integer value3) -> 2* value3);

        //4. collecting as list
        List<Integer> outputAfterFilter1 = numberStream3.collect(Collectors.toList());
        System.out.println(outputAfterFilter1);



        /*
          7. limit(Long maxSize) ---> how much stream need it, Truncate(shorter)the stream, to have no longer then given maxSize.
         */
     System.out.println("================applying limit with max value is 3 =========================================");

     List<Integer> numberForLimit = Arrays.asList(2,1,3,4,6,5,7);
     //1. create/open a stream and apply intermediate operation
     Stream<Integer> numberStreamForLimit =numberForLimit.stream().limit(3);
     //2. collecting into the list
     List<Integer> numberListForLimit = numberStreamForLimit.collect(Collectors.toList());
     System.out.println(numberListForLimit);


     /*
        8. skip(Long n) ----> skip the first n elements of the stream.
      */

     System.out.println("========skip the first (n = 3 then (first 3 number skip) )element from stream ==========");
     List<Integer> numberForSkip = Arrays.asList(2,1,3,4,6,5,7);
     //1. create/open a stream and apply intermediate operation
     Stream<Integer> numberStreamForSkip =numberForSkip.stream().skip(3);
     //2. collecting into the list
     List<Integer> numberListForSkip = numberStreamForSkip.collect(Collectors.toList());
     System.out.println(numberListForSkip);


     /*
        9. mapToInt(ToIntFunction<T> mapper) ----> helps to work with primitive "int" data types
         mapToInt calls the toIntFunction functional interface where, it takes 1 parameter, and returns int type.
      */
     System.out.println("=======especial method that helps to work with primitive data types==============");

     int[] numberArray = {2,1,4,7};

     //1. create a stream for int[] (Arrays.stream(numberArray), it will return IntStream(IntStream numbersStream)
     // , not the Stream be careful
     IntStream numberStreamForIntToMap = Arrays.stream(numberArray);

     //2. apply for intermediate filter with primitive data type
     IntStream filterNumberStreamForIntToMap = numberStreamForIntToMap.filter((int value)-> value >2);

     // convert back to the int array
     int[] filteredArrayForInt = filterNumberStreamForIntToMap.toArray();

     System.out.println(Arrays.toString(filteredArrayForInt));

     System.out.println("============Another way (reducing line) to we can do ==========================");

     //1. create a stream for int[] (Arrays.stream(numberArray), it will return IntStream(IntStream numbersStream)
     // , not the Stream be careful
      int[] numberStreamForIntToMap1 = Arrays.stream(numberArray).filter((int value)-> value >2).toArray();
     System.out.println(Arrays.toString(numberStreamForIntToMap1));

     System.out.println("=========Converting from string to int =====================");

     List<String> numberOfArray = Arrays.asList("2","1","4","7");
     // create an IntStream
     IntStream numberStreamOfArray = numberOfArray.stream().mapToInt((String value)-> Integer.parseInt(value));
     // convert back to the int array
     int[] numberAfterConverting = numberStreamOfArray.toArray();
     System.out.println(Arrays.toString(numberAfterConverting));


     /*
       10. mapToLong (ToLongFunction<T> mapper)   ---> helps to work with primitive "long data types
        we can do  double as well as
      */

     System.out.println("==============especial method that helps to work with primitive data (long) types============");
     //1. create a stream for int[] (Arrays.stream(numberArray), it will return IntStream(IntStream numbersStream)
     // , not the Stream be careful

     long[] numberLongArray = {2,1,4,7};
     long[] numberStreamForLongToMap = Arrays.stream(numberLongArray).filter((long value)-> value >2).toArray();
     System.out.println(Arrays.toString(numberStreamForLongToMap));

     System.out.println("=== find or print forth highest salary ======");
      List<Integer> salary  = Arrays.asList(10000,20000,150000,30000,90000,10000,60000,120000,180000, 5000);

      Integer getFourthHighestSalary = salary.stream().distinct().sorted(Comparator.reverseOrder()).skip(3).findFirst().orElse(null);
     // this will give forth the highest salary
     System.out.println("Find the forth highest Element: " + getFourthHighestSalary);

     System.out.println("=============== After removing forth highest salary and printing back to list ====================");
     // now remove 4th highest salary from the list
     List<Integer> updateSalary  = salary.stream().filter(sal ->!sal.equals(getFourthHighestSalary)).collect(Collectors.toList());
     System.out.println(updateSalary);






     System.out.println("========== Removing duplicate and return the length of distinct element from string");

     List<String> list = Arrays.asList("aaryanna","aayanna","airianna","alassandra","allanna","allanah","allessandra","allianna",
             "allyanna","anastaisa","anastasia","annablella","annabelle","annebelle");

     // convert to IntStream of character -----> ((int) s.chars())
     //.distinct() --->  Remove duplicate characters
     // .count()) --> Count unique characters and cast long to int
      List<Integer> lengthOfString = list.stream().map((s ->(int) s.chars().distinct().count())).collect(Collectors.toList());
     System.out.println(lengthOfString);
    }

}
