
public class Leetcode26 {

	public static void main(String[] args) {
		

	}
	public static int removeDuplicates(int[] nums) {
	       int lastPos = 0;
	        for(int i=1; i<nums.length; i++){
	            if(nums[i] != nums[lastPos]){
	                lastPos++;
	                nums[lastPos] = nums[i];
	            }
	        }
	        return lastPos+1;
	}

}
