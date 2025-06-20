package Excercise1;
import Excercise1.Logger;

public class TestLogger {
  public static void main(String[] args) {
    Logger l1=Logger.getInstance();
    Logger l2=Logger.getInstance();

    l1.log("This is the first log message");
    l2.log("This is the second log message");

    if(l1==l2){
      System.out.println("both loggers refer to the same instance");
    }
    else{
      System.out.println("Both loggers refer to different instances");
    }
  }
}
