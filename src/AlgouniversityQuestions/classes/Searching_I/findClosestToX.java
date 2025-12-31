
//here we are given an array and we have to find the closest int in given array num k such that it is closest to x among all ints in nums
package AlgouniversityQuestions.classes.Searching_I;

public class findClosestToX {
    private static int[] nums = new int[]{1, 3, 5, 6, 11, 12};  
    private static int k= 9; 
    public static void main(String[] args) {
        
        
        //find the next greater and next lesser elements in input array
        int l = -1, r = nums.length;
        //1st for lesser
        while(l+1 < r){
            int m = (l+r)/2;
            if(predicate(m)==false){
                l=m;
            }
            else{
                r=m;
            }
        }
        if(k-nums[l] > nums[r]-k){ 
            System.out.println(nums[r]);
        } else {
            System.out.println(nums[l]);
        }

    }
    
    public static boolean predicate(int m) {
        return nums[m] > k; 
    }
}
