import java.util.*;

// method overriding

class Calc {
  
  public int add(int n1, int n2) {
   return n1 + n2;
  }
  public void config() {
    System.out.println("in A config");
  }


}

class AdvCalc extends Calc  {

    public int add(int n1,int n2,int n3) {
      return n1 + n2 + n3;
    }


}

public class Main {
    public static void main(String[] args) {
          AdvCalc obj = new AdvCalc();
          int r1 =  obj.add(3,4,1);
           System.out.println(r1);

    }
}

// 8
