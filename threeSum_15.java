import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> bob = new ArrayList<>();
        HashMap<ArrayList, Integer> book = new HashMap<ArrayList, Integer>();
        for (int i=0;i<nums.length-2;i++){
            int left=i+1,right=nums.length-1;
            while (left < right) {
                if (nums[i]+nums[left]+nums[right]==0){
                    ArrayList<Integer> hen=new ArrayList<Integer>();
                    hen.add(nums[i]);
                    hen.add(nums[left]);
                    hen.add(nums[right]);
                    if (book.containsKey(hen)==false){
                        bob.add(hen);
                        book.put(hen,0);
                    }
                }
                if (nums[i]+nums[left]+nums[right] <0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return(bob);
    }
}