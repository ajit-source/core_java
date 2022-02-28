/*
Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator 

old35(3)=true
old35(10)=true
old35(15)=false
*/
class Exercise_19{
	public boolean old35(int n) {

	    return n % 3 == 0 ^ n % 5 == 0;

	}
	public static void main(String[] args) {
		Exercise_19 obj = new Exercise_19();
		System.out.println(obj.old35(3));
		System.out.println(obj.old35(10));
		System.out.println(obj.old35(15));
	}

}  