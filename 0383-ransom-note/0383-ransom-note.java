class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> mp1 = new HashMap<>();
        Map<Character,Integer> mp2 = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            if(mp1.containsKey(ransomNote.charAt(i))){
                mp1.put(ransomNote.charAt(i),mp1.get(ransomNote.charAt(i))+1);
            }else{
                mp1.put(ransomNote.charAt(i),1);
            }
        }
        for(int i=0;i<magazine.length();i++){
            if(mp2.containsKey(magazine.charAt(i))){
                mp2.put(magazine.charAt(i),mp2.get(magazine.charAt(i))+1);
            }else{
                mp2.put(magazine.charAt(i),1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            if(mp2.containsKey(ransomNote.charAt(i)) && (mp1.get(ransomNote.charAt(i)) <= mp2.get(ransomNote.charAt(i)))){
                continue;
            }else{
               return false;
            }
        }
        return true;
    }
}