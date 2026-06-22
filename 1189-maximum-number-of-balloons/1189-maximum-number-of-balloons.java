class Solution {
    public int maxNumberOfBalloons(String text) {
        text=text.toLowerCase();
        int[] arr=new int[5];
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b'){
                arr[0]++;
            }
            else if(text.charAt(i)=='a'){
                arr[1]++;
            }
            else if(text.charAt(i)=='l'){
                arr[2]++;
            }
            else if (text.charAt(i)=='o'){
                arr[3]++;
            }
            else if (text.charAt(i)=='n'){
                arr[4]++;
            }            
        }
          int min=arr[0];
            min=Math.min(min,arr[1]);
            min=Math.min(min,arr[2]/2);
            min=Math.min(min,arr[3]/2);
            min=Math.min(min,arr[4]);
            return min;
    }
}