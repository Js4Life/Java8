import java.util.*;

class A extends Object { // EVERY CALLS EXtends Object
    public A() {
      super();
      System.out.println("in A");
    }
    public A(int n) {
      super();
      System.out.println("in A int");
    }
}

class B extends A {
  public B() {
    super();
    System.out.println("in B");
  }

  public B(int n) {
      this(); // calls constrcutor of same calls
  //  super(n); // callss the constrcutor super class (default) and add parametised constructor in super explicitly
    System.out.println("in B int");
  }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("This and super method");
      B obj = new B(5);
    }
}
