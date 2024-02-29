class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        int result=0;
        for(Integer x : mp.keySet()){
            if(mp.get(x)>(nums.length/2)){
                result = x;
                break;
            }
        }
        return result;
    }
}