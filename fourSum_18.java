import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> bob = new ArrayList<>();
        HashMap<ArrayList, Integer> book = new HashMap<ArrayList, Integer>();
        for (int i=0;i<nums.length-3;i++){
            for (int b=i+1;b<nums.length-2;b++){
                int left=b+1;
                int right=nums.length-1;
                while (left<right){
                    if (nums[i]+nums[b]+nums[left]+nums[right]==target){
                        ArrayList<Integer> hen=new ArrayList<Integer>();
                        hen.add(nums[i]);
                        hen.add(nums[b]);
                        hen.add(nums[left]);
                        hen.add(nums[right]);
                        if (book.containsKey(hen)==false){
                            book.put(hen,0);
                            bob.add(hen);
                        }
                    }
                    if (nums[i]+nums[b]+nums[left]+nums[right]<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return bob;
    }
}