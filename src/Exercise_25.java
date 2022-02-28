/* Write a program  to check whether a number can be Expressed as Sum of Two Prime Numbers  .Sample input/output
Enter number : 34   
34 = 3 + 31
34 = 5 + 29
34 = 11 + 23
34 = 17 + 17*/
public class Exercise_25 {

  public static void main(String[] args) {
    int number = 34;
    boolean flag = false;
    for (int i = 2; i <= number / 2; ++i) {

      
      if (checkPrime(i)) {

       
        if (checkPrime(number - i)) {

          
          System.out.printf("%d = %d + %d\n", number, i, number - i);
          flag = true;
        }

      }
    }

    if (!flag)
      System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
  }

 
  static boolean checkPrime(int num) {
    boolean isPrime = true;

    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }

    return isPrime;
  }
}
