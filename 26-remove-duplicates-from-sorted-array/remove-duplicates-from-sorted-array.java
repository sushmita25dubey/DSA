class Solution {
    public int removeDuplicates(int[] nums) {
        // 1 2 3 4 3 3 4 -> 1 2 3 4...
        // . . .       j (1st pointer start from index 1 bez 0 index is always unique)
        // . . . . k (2nd pointer storing unique element)
        int k=1;
        for(int j = 1; j < nums.length; j++){
            if(nums[j]!=nums[j-1]){
                nums[k]=nums[j];
                k++;
            }
        }
        return k;
    }
}
     