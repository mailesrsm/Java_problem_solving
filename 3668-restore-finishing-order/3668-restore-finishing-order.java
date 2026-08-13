class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int k=0;
        int[] ans=new int[friends.length];
        for(int i=0;i<friends.length;i++){
            map.put(friends[i],1);
        }
        for(int x : order){
            if(map.containsKey(x)){
                ans[k]=x;
                k++;
            }
        }
        return ans;
    }
}