import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMastery {
    public static void main(String[] args) {

      List<String> frames = Arrays.asList("Spring","Hibernate","Struts","Spark","Grails");
      List<String> processed = frames.stream()
      .filter(name -> name.startsWith("S"))
      .map(String::toUpperCase)
      .sorted()
      .collect(Collectors.toList());  
      System.out.println("processed " + processed);

      int[] numbers = {1,2,3,4,5};
      int sum = Arrays.stream(numbers).sum();
      System.out.println("Sum :" + sum);

      Optional<String> firstElement = frames.stream().findFirst();
      String result = firstElement.orElse("No Elm found");
      System.out.println(result);


      List<String> fruits = Arrays.asList("Apple","Banana","Cherry","Date","Fig");
      List<String> modifiedList = fruits.stream()
                                      .filter(fruit -> fruit.startsWith("B"))
                                      .peek(fruit -> System.out.println("Filtered Fruit: " + fruit))
                                      .map(String::toUpperCase)
                                      .peek(uppercasedFruit -> System.out.println("uppercasedFruit: " + uppercasedFruit))
                                      .collect(Collectors.toList());

         System.out.println("modifiedList: " + modifiedList);

         Stream<String> nameStream = Stream.of("Sehwag","Ishan","Shaw");
         nameStream.forEach(System.out::println);                             
      
    }
}


// processed [SPARK, SPRING, STRUTS]
// Sum :15
// Spring
// Filtered Fruit: Banana
// uppercasedFruit: BANANA
// modifiedList: [BANANA]
// Sehwag
// Ishan
// Shaw

