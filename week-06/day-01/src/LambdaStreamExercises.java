import javax.swing.text.html.HTMLDocument;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaStreamExercises {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);


    System.out.println("Write a Stream Expression to get the even numbers from the following list:");

    numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(n -> System.out.println(n));

    System.out.println("Write a Stream Expression to get the squared value of the positive numbers from the following list:");

    numbers.stream()
            .filter(n -> n > 0)
            .map(n -> n*n)
            .forEach(System.out::println);

    System.out.println("Write a Stream Expression to find which number squared value is more then 20 from the following list:");

    List<Integer> numbersEx3 = Arrays.asList(3, 9, 2, 8, 6, 5);

    numbersEx3.stream()
            .filter(n -> n*n > 20)
            .forEach(System.out::println);

    System.out.println("Write a Stream Expression to get the average value of the odd numbers from the following list:");

    numbers.stream()
            .filter(n -> n % 2 != 0)
            .mapToDouble(n -> n)
            .average()
            .ifPresent(System.out::println);

    System.out.println("Write a Stream Expression to get the sum of the odd numbers in the following list:");

    List<Integer> numbersEx4 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

    int result = numbersEx4.stream()
            .filter(n -> n % 2 != 0)
            .mapToInt(n -> n)
            .reduce(0, (n, sum) -> n + sum);

    System.out.println(result);

    System.out.println("Write a Stream Expression to find the uppercase characters in a string!");

    String findUppercase = "AppLe";
    String resultOfFindUppercase = Arrays.stream(findUppercase.split(""))
            .filter(n -> Character.isUpperCase(n.charAt(0)))
            .collect(Collectors.joining(" "));

    System.out.println(resultOfFindUppercase);

    System.out.println("Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:");
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

    System.out.println(cityFinder("a",cities));

    System.out.println("Write a Stream Expression to concatenate a Character list to a string!");

    List<Character> charList = Arrays.asList('a','p','p','l','e');

    System.out.println(concatenateChars(charList));

    System.out.println("Write a Stream Expression to find the frequency of characters in a given string!");

    String frequency = "Apple";

    System.out.println(Arrays.stream(frequency.split(""))
            .collect(Collectors.groupingBy(ch -> ch.charAt(0), Collectors.counting()))
    );





  }

  public static String cityFinder(String letter, List<String> cities){

    String result = cities.stream()
            .filter(n -> n.startsWith(letter.toUpperCase()))
            .collect(Collectors.joining(", "));

    return result;
  }

  public static String concatenateChars(List<Character> charList){

    String result = charList.stream()
            .map(n -> String.valueOf(n))
            .collect(Collectors.joining());

    return result;
  }

//  public static HashMap<String, Integer> letterFrequency(String frequency){
//
//    HashMap<String, Integer> result = Arrays.stream(frequency.split(""))
////            //.filter(n -> n.startsWith(n))
////            .map(n -> {
////              result.containsKey(n)
////            })
//    .collect(Collectors.groupingBy())
//
//
//
//    return result;
//
//  }


}






