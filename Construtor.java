import java.util.*;

class Mobile { // CamelCase - ClassName/Interface , variable/methods - small case, const - UpperCase,Constructor - startswithUpperCase
  String brand;
  int price;
  static String name;
  public Mobile() {
    brand = "1";
    price = 200;
    name = "Santosh";
    System.out.println("in constructor");
  }
  static {
    name = "iPhone"; // calls first and only once
    System.out.println("in static");
  }
  public void show() {
    System.out.println(brand +" : " + price + " : "+ name);
  }

}

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
      
      Mobile M;
      M = new Mobile();
      M.show();

     // Class.forName("Mobile"); // to load class
      // Mobile myMobile = new Mobile();
      // myMobile.brand = "Apple";
      // myMobile.price = 1500;
      // myMobile.name = "SmartPhone";
      // myMobile.show();
    }
}
