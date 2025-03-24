package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamPractice {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Even Odd separation in map
        Map<Boolean,List<Integer>>evenAndOddSeparation=oneToTen.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println(evenAndOddSeparation);
        //Even odd separation in list
        Collection<List<Integer>>evenAndOddList=oneToTen.stream().collect(Collectors.collectingAndThen(Collectors.partitioningBy(i->i%2==0),Map::values));
        System.out.println(evenAndOddList);

        oneToTen = List.of(1, 2, 2,3, 4, 4,5, 6, 7,7, 8, 9, 10);
        System.out.println(oneToTen.stream().collect(Collectors.toSet()));
        String testString="This is test to calculate frequency";
        System.out.println(testString.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
 
        oneToTen = List.of( 2, 4,1, 5, 6, 7,3 ,8, 9, 10);
        System.out.println("Sorting numbers: "+oneToTen.stream().sorted((x2,x1)->Integer.compare(x1, x2)).collect(Collectors.toList()));

        List<String> languageList = List.of("java", "c++", "c", "C sharp", "python", "kotlin", "scala");
        String joinedString=languageList.stream().collect(Collectors.joining(",","[","]"));
        System.out.println("Joining List of element in to single String:"+joinedString);

        String joinednumber=oneToTen.stream().map(String::valueOf).collect(Collectors.joining(",","[","]"));
        System.out.println("Joining numbers: "+joinednumber);
        System.out.println("Max Number from List: "+oneToTen.stream().max((x1,x2)->Integer.compare(x1,x2)).get());
        System.out.println("Minimum number from List: "+oneToTen.stream().min((x1,x2)->Integer.compare(x1,x2)).get());

        int [] randomNumbers ={12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int [] randomNumber2 = {4, 3, 2, 5, 6, 78, 98, 53, 90};

        int[] mergedSortedArray = Stream.of(randomNumbers, randomNumber2)
        .flatMapToInt(Arrays::stream).distinct()  // Flatten the stream of arrays into a single IntStream
        .sorted()  // Sort the stream
        .toArray();
        System.out.println("Merge using flatmap:"+Arrays.toString(mergedSortedArray));
      List<Integer> randomNumbers2 = List.of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
      System.out.println(randomNumbers2.stream().sorted(Integer::compare).limit(3).collect(Collectors.toList()).get(2));
      System.out.println(randomNumbers2.stream().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList()).get(1));
      int[] sortedArrayByMergingTwoArray=IntStream.concat(Arrays.stream(randomNumbers),Arrays.stream(randomNumber2)).distinct().sorted().toArray();
      System.out.println("merge new"+Arrays.toString(sortedArrayByMergingTwoArray));
      //Anagram
      String string1 = "listen";
      String string2 = "silent";
      String s1=Arrays.stream(string1.split("")).sorted().collect(Collectors.joining(""));
      String s2=Arrays.stream(string2.split("")).sorted().collect(Collectors.joining(""));
     
      System.out.println(s1.equals(s2));


      System.out.println(languageList.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList()));
      System.out.println(randomNumbers2.stream().mapToInt(Integer::valueOf).average().getAsDouble());
    //  Set<Integer> set=Arrays.stream(randomNumber2).map(Integer::intValue).collect(Collectors.toSet());
     // System.out.println(Arrays.stream(randomNumbers).filter(set::contains).collect(Collectors.toList()));
    String test="anupnikam";
    System.err.println(Arrays.stream(test.split("")).filter(str->test.indexOf(str)!=test.lastIndexOf(str)).findFirst().orElse(""));

    }
}
