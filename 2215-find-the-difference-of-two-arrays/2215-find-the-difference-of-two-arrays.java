class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> setf1=new HashSet<>();
        HashSet<Integer> setf2=new HashSet<>();

        for(int x : nums1){
            set1.add(x);
        }
        for(int x : nums2){
            set2.add(x);
        }

        for(int x : nums1){
            if(!set2.contains(x)){
                setf1.add(x);
            }
        }
        for(int x : nums2){
            if(!set1.contains(x)){
                setf2.add(x);
            }
        }
        for(int x : setf1){
            l1.add(x);
        }
        for(int x : setf2){
            l2.add(x);
        }

        ans.add(l1);
        ans.add(l2);
        
        return ans;
    }
}