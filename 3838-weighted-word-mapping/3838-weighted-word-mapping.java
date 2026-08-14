class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                int index=ch-'a';
                sum+=weights[index];
            }
               int res=sum%26;
               char ch=(char)('z'-res);
               s.append(ch);
        }
        return s.toString();
    }
}