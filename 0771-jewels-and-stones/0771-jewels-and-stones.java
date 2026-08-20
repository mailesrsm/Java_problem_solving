class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<jewels.length();i++){
            char character1=jewels.charAt(i);
            for(int j=0;j<stones.length();j++){
                char character2=stones.charAt(j);
                if(character1==character2){
                    count++;
                }
            }
        }
        return count;
    }
}