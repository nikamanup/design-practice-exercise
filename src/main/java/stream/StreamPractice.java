package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice {

    public static void main(String[] args) {
        // List of integers from 1 to 10
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. Even/Odd Partitioning into Map<Boolean, List<Integer>>
        Map<Boolean, List<Integer>> partitionedByEven = partitionEvenOdd(oneToTen);
        System.out.println("Partitioned by Even/Odd: " + partitionedByEven);

        // 2. Even/Odd Partitioning as Collection<List<Integer>>
        Collection<List<Integer>> evenOddLists = partitionEvenOddAsLists(oneToTen);
        System.out.println("Even/Odd as lists: " + evenOddLists);

        // 3. Remove Duplicates with toSet
        List<Integer> listWithDuplicates = List.of(1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10);
        Set<Integer> uniqueNumbers = new HashSet<>(listWithDuplicates);
        System.out.println("Unique numbers: " + uniqueNumbers);

        // 4. Character Frequency Count in String
        String testString = "This is test to calculate frequency";
        Map<Character, Long> charFrequency = charFrequency(testString);
        System.out.println("Character frequency: " + charFrequency);

        // 5. Sorting a List in Descending Order
        List<Integer> unsorted = List.of(2, 4, 1, 5, 6, 7, 3, 8, 9, 10);
        List<Integer> sortedDesc = sortDescending(unsorted);
        System.out.println("Sorted descending: " + sortedDesc);

        // 6. Joining Strings in a List
        List<String> languageList = List.of("java", "c++", "c", "C sharp", "python", "kotlin", "scala");
        String joinedLanguages = joinList(languageList);
        System.out.println("Joined languages: " + joinedLanguages);

        // 7. Joining Numbers into String
        String joinedNumbers = joinList(unsorted.stream().map(String::valueOf).collect(Collectors.toList()));
        System.out.println("Joined numbers: " + joinedNumbers);

        // 8. Max and Min in a List
        System.out.println("Max: " + Collections.max(unsorted));
        System.out.println("Min: " + Collections.min(unsorted));

        // 9. Merge Two Arrays, Sort and Deduplicate
        int[] arr1 = {12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int[] arr2 = {4, 3, 2, 5, 6, 78, 98, 53, 90};
        int[] mergedSorted = mergeAndSortArrays(arr1, arr2);
        System.out.println("Merged & sorted: " + Arrays.toString(mergedSorted));

        // 10. Get Nth Smallest/Largest Element
        List<Integer> randomNumbers2 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        int thirdSmallest = getNthSmallest(randomNumbers2, 3);
        int secondLargest = getNthLargest(randomNumbers2, 2);
        System.out.println("3rd smallest: " + thirdSmallest);
        System.out.println("2nd largest: " + secondLargest);

        // 11. Anagram Checker
        String string1 = "listen";
        String string2 = "silent";
        boolean areAnagrams = areAnagrams(string1, string2);
        System.out.println("Are anagrams: " + areAnagrams);

        // 12. Sort Strings by Length Descending
        List<String> sortedByLength = sortByLengthDescending(languageList);
        System.out.println("Sorted by length desc: " + sortedByLength);

        // 13. Average of List
        double avg = getAverage(randomNumbers2);
        System.out.println("Average: " + avg);

        // 14. First Repeated Character in a String
        String test = "anupnikam";
        String firstRepeated = firstRepeatedCharacter(test);
        System.err.println("First repeated character: " + firstRepeated);
    }

    // --- Methods with Explanations ---

    // 1. Partition numbers into even and odd
    public static Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
    }

    // 2. Partition numbers and return only the lists (even & odd)
    public static Collection<List<Integer>> partitionEvenOddAsLists(List<Integer> numbers) {
        return partitionEvenOdd(numbers).values();
    }

    // 4. Frequency of each character in a string
    public static Map<Character, Long> charFrequency(String s) {
        return s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    // 5. Sort integers in descending order
    public static List<Integer> sortDescending(List<Integer> numbers) {
        return numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    // 6 & 7. Join list of strings with commas, surrounded by brackets
    public static String joinList(List<String> list) {
        return list.stream().collect(Collectors.joining(",", "[", "]"));
    }

    // 9. Merge two arrays, remove duplicates, and sort
    public static int[] mergeAndSortArrays(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .distinct()
                .sorted()
                .toArray();
    }

    // 10a. Get nth smallest element (1-based index)
    public static int getNthSmallest(List<Integer> numbers, int n) {
        return numbers.stream()
                .sorted()
                .limit(n)
                .skip(n - 1)
                .findFirst()
                .orElseThrow();
    }

    // 10b. Get nth largest element (1-based index)
    public static int getNthLargest(List<Integer> numbers, int n) {
        return numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(n)
                .skip(n - 1)
                .findFirst()
                .orElseThrow();
    }

    // 11. Check if two strings are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        String sorted1 = Arrays.stream(s1.split("")).sorted().collect(Collectors.joining());
        String sorted2 = Arrays.stream(s2.split("")).sorted().collect(Collectors.joining());
        return sorted1.equals(sorted2);
    }

    // 12. Sort strings by length, descending
    public static List<String> sortByLengthDescending(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }

    // 13. Average of list of integers
    public static double getAverage(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
    }

    // 14. First repeated character in a string
    public static String firstRepeatedCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                return ch;
            }
        }
        return "";
    }
}