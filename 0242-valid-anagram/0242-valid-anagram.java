class Solution {
    public String sortString(String str) {
        char strArray[] = str.toCharArray();
        Arrays.sort(strArray);
        return new String(strArray);
    }
    public boolean isAnagram(String s, String t) {
        s = sortString(s);
        t = sortString(t);
        System.out.println(s);
        System.out.println(t);
        if(!s.equals(t)){
            return false;
        }
        return true;
    }
}