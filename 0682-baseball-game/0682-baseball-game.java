class Solution {
    public int calPoints(String[] operations){
        int size=0;
        int sum=0;
        int[] result=new int[operations.length];
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                size--;
            }
            else if(operations[i].equals("D")){
                result[size]=result[size-1]*2;
                size++;
            }
            else if(operations[i].equals("+")){
                result[size]=result[size-1]+result[size-2];
                size++;
            }
            else{
                result[size]=Integer.parseInt(operations[i]);
                size++;
            }
        }
        for(int i=0;i<size;i++){
            sum+=result[i];
        }
        return sum;
    }
}