//Write a program to reverse a 6 digit number using while or for loop.
class Exercise_3 {
  public static void main(String[] args) {

    int num = 123456, reversed = 0;
    
    System.out.println("Original Number: " + num);


    while(num != 0) {
    
      
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}