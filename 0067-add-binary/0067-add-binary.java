class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder result = new StringBuilder();
        int sum = 0;
        while(i>=0 || j>=0 || carry==1){
            sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';  //Convert char to int
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';  //Convert char to int
            }
            result.append((char)(sum%2+'0')); //append ''0'' if '1'+'1' and ''1'' if '0'+'1'
            carry=sum/2;
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}