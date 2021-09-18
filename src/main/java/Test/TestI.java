package Test;

public interface TestI {
     int num = 5;

     default void print(){
          System.out.println("TestI");
     }
}
