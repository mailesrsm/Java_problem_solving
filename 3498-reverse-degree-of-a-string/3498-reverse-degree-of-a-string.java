class Solution {
    public int reverseDegree(String s) {
        int val=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int pos=('z'-ch+1);
            val+=(i+1)*pos;

        }
        return val;
    }
}