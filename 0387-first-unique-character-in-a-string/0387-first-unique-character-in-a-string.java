class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> arr=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(arr.containsKey(ch)){
                arr.put(ch,arr.get(ch)+1);
            }else{
                arr.put(ch,1);
            }
        }


        for(int i=0;i<s.length();i++ ){
            char ch=s.charAt(i);
            if(arr.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}