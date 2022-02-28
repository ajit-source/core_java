/*Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square.
*/
class Exercise_26 {
	
		  public static void printArea(int x,int y){
		    System.out.println(x*y);
		  }
		  public static void printArea(int x){
		    System.out.println(x*x);
		  }
		  public static void main(String[] args) {
			Exercise_26 obj = new Exercise_26();
			obj.printArea(4, 6);
			obj.printArea(8);
		}
		}
