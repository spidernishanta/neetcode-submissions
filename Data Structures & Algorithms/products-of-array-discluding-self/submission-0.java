class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int currentProd=1;
        for(int i=0; i<nums.length; i++){
            result[i]=currentProd;
            currentProd*=nums[i];
        }
        currentProd=1;
        for(int i=nums.length-1; i>=0; i--){
            result[i]*=currentProd;
            currentProd*=nums[i];
        }
        return result;
    }
}  
