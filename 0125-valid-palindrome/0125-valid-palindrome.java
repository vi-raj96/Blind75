class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l1=0,l2=s.length()-1;
        while(l1<l2){
            char ch1 = s.charAt(l1);
            char ch2 = s.charAt(l2);
            if(!((ch1>='a' && ch1<='z') || (ch1>='0' && ch1<='9'))){ //increase index if alphanumeric
                l1++;
            }else if(!((ch2>='a' && ch2<='z') || (ch2>='0' && ch2<='9'))){ //decrease index if alphanumeric
                l2--;
            }else if(ch1!=ch2){
                return false;
            }else{
                l1++;
                l2--;
            }
        }
        return true;
    }
}