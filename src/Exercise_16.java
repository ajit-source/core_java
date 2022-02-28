/*
:Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
Sample input/output
noTriples([1, 1, 2, 2, 1])=true
noTriples([1, 1, 2, 2, 2, 1])=false
noTriples([1, 1, 1, 2, 2, 2, 1])=false
*/
class Exercise_16 {
	public boolean noTriples(int[] nums) {

		  int count = 0;

		  for (int i = 0 ; i < nums.length - 1;i++) {

		    if (i+2 <= nums.length -1) {

		      if (nums[i] == nums[i+1] && nums[i] == nums[i+2])

		        return false;  

		    }

		  } return true;

		}
	public static void main(String[] args) {
		Exercise_16 obj = new Exercise_16();
		int [] a = {1,1,2,2,1};
		int [] b = {1,1,2,2,2,1};
		int [] c = {1,1,1,2,2,2,1};
		
		System.out.println(obj.noTriples(a));
		System.out.println(obj.noTriples(b));
		System.out.println(obj.noTriples(c));
	}
}