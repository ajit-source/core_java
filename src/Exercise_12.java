// Write a program to print the Fibonacci series based on user input. Fibonacci series of first 6 numbers is  0,1,1,2,3,5
class Exercise_12 {
  public static void main(String[] args) {

    int n = 6, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

     
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}