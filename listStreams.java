import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Java Program 1 : Print even numbers");

      // Print even numbers
      List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,32);
      list.stream().filter(n -> n%2 == 0).forEach(System.out::println);

    System.out.println("Java Programs 2 print which starts from '1' ");
     // print which starts from '1'
 
      list.stream()
      .map(s -> s + "") //  converting integer to number
      .filter(s -> s.startsWith("1")).forEach(System.out::println);

      System.out.println("Java Programs 3 print repeated number");
     
      Set<Integer> set = new HashSet();
      list.stream().filter(n -> !set.add(n)).forEach(System.out::println);

    System.out.println("Java Program 4 remove dups");
    
     // Remove Dups in list 
     list.stream().distinct().forEach(n-> System.out.println(n));

    }
}
