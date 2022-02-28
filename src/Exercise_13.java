// Write a program to swap two integers without using a temporary variable.
import java.io.*;
 
class Exercise_13 {
 
    public static void main(String a[])
    {
        int x = 10;
        int y = 5;
        System.out.println("Before swapping x:"+x+" y: "+y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                           + " x = " + x + ", y = " + y);
    }
}