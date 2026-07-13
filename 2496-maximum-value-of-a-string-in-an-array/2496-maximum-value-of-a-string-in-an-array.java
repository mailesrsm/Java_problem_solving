class Solution {
    public int maximumValue(String[] strs) {
        int n=strs.length;
        int max=0;
        for(int i=0;i<n;i++){
            boolean isNumber=true;
        
        for(int j=0;j<strs[i].length();j++){
            if(!Character.isDigit(strs[i].charAt(j))){
                isNumber=false;
                break;
            }            
            
        }
        if(isNumber){
            max=Math.max(max,Integer.parseInt(strs[i]));
        }else{
            max=Math.max(max,strs[i].length());
        }
        }
        return max;
    }
}