class Solution {
    public boolean isPalindrome(String s) {
        String np=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] arr= np.toCharArray();
        int left= 0;
        int right=arr.length-1;
        while(left<right){
           if(arr[left]!=arr[right]){
                return false;

            }
            left++;
            right--;
        }

        
        return true;   
    }
}
