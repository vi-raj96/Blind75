class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }else{
                 mp.put(s.charAt(i),1);
            }
        }
        int result=0;
        boolean isOddAdded = false;
        for(Character key: mp.keySet()){
            if(mp.get(key)%2==0){
                result += mp.get(key);
            }else{
                if(!isOddAdded){
                    result += mp.get(key);
                    isOddAdded = true;
                }else{
                    result += mp.get(key)-1;
                }
            }
        }
        return result;
    }
}