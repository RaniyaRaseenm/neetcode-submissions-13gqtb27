class Solution {
    public int longestConsecutive(int[] nums) {
         HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
         }
          int result=0;
          for(int i=0;i<nums.length;i++){
            int value=nums[i];
            int length=1;
            while(set.contains(value+1)){
                value++;
                length++;
            }
            result=Math.max(result,length);
       

          }
       // System.out.println(result);
        return result;
    }
}
