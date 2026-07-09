import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
      System.out.println("intersection :");
      List<Integer> list1 = Arrays.asList(1,2,3,4,5);
      List<Integer> list2 = Arrays.asList(3,4,6,7);
      List<Integer> intersection = list1
                                  .stream()
                                  .filter(list2::contains)
                                  .collect(Collectors.toList());
      System.out.println(intersection);
      System.out.println("Remove duplicates : ");
      List<Integer> numbersWithDup = Arrays.asList(1,2,3,2,4,1,5,6,5);
      List<Integer> uniqueNum = numbersWithDup
                                    .stream()
                                    .distinct()
                                    .collect(Collectors.toList());
      System.out.println(uniqueNum);   
      System.out.println("Remove duplicates : ");     
      List<Transcation> transactions = Arrays.asList(
                  new Transcation("2022-01-01", 100),
                  new Transcation("2022-01-01", 200),
                  new Transcation("2022-01-02", 300),
                  new Transcation("2022-01-03", 400)
      ); 
      Map<String,Integer> sumByDay = transactions
                                    .stream()
                                    .collect(Collectors.groupingBy(Transcation::getDate,
                                             Collectors.summingInt(Transcation::getAmount)));  
      System.out.println(sumByDay);  
      System.out.println("Smallest element in an array");
      int[] array = {4,2,7,1,5,3,6};
      int k = 3;
      int kthSmallest = Arrays.stream(array).sorted()
                          .skip(k-1)
                          .findFirst()
                          .orElse(-1);
      System.out.println("k th Smallest number " +kthSmallest); 
    List<String> words = Arrays.asList("apple","banana","apple","cherry","banana","apple");
    Map<String,Long> wordFrq = words
                                .stream()
                                .collect(Collectors
                                  //   .groupingBy(Function.identity(),Collectors.counting()) orElse
                                  .groupingBy(x->x,Collectors.counting())
                                );
      System.out.println("word Frequency" + wordFrq);
      List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
      Map<Boolean,List<Integer>> partitioned = numbers
                                                  .stream()
                                                    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
       List<Integer> evenNums = partitioned.get(true);
       List<Integer> oddNums = partitioned.get(false);
       System.out.println("Even numbers: "+ evenNums);    
       System.out.println("Odd numbers: "+ oddNums);                                             



    }
}
