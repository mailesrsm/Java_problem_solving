class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            sum1+=t.charAt(j);
        }
        int diff=sum1-sum;
        return (char)diff;
    }
}