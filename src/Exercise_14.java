//Write a program to find the ASCII value of a given character.
public class Exercise_14 {

    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;

        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}