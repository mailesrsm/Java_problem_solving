class Solution {
    public int scoreOfString(String s) {
        int result=0;
        for(int i=0;i<s.length()-1;i++){
            int ch=(int)s.charAt(i);
            int next=(int)s.charAt(i+1);
            result+=Math.abs(ch-next);
        }
        return result;
    }
}