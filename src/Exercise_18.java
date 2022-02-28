/*
Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.
Sample input/output
scoresIncreasing([1, 3, 4])=true
scoresIncreasing([1, 3, 2])=false
scoresIncreasing([1, 1, 4])=true
*/
class Exercise_18{
	public boolean scoresIncreasing(int[] scores) {

		  boolean match = false;

		  for (int i = 0; i < scores.length-1; i++) {

		    if (scores[i+1] >= scores[i])

		      match = true;

		    else

		      return false;

		  }

		  return match;

		}

	public static void main(String[] args) {
		Exercise_18 obj = new Exercise_18();
		int [] a = {1,3,4};
		int [] b = {1,3,2};
		int [] c = {1,1,4};
		System.out.println(obj.scoresIncreasing(a));
		System.out.println(obj.scoresIncreasing(b));
		System.out.println(obj.scoresIncreasing(c));
	}
}
