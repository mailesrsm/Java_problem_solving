class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int n=Math.min(word1.length(),word2.length());
        for(int i=0;i<n;i++){
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
        }
        if(word1.length()>word2.length()){
            for(int i=n;i<word1.length();i++){
                s.append(word1.charAt(i));
            }
        }
        else{
            for(int i=n;i<word2.length();i++){
                s.append(word2.charAt(i));
            }
        }
        return s.toString();
    }
}