public class Solution {
    public static int majorityElement(int []v) {
        int element=-1;
        int count=0;
        for(int i=0;i<v.length;i++){
            if(count == 0){
                element=v[i];
                count++;
            }
            else if(v[i]==element){
                count++;
            }
            else if(v[i]!=element){
                count--;
            }

        }
        if(count>0){
            int count1=0;
            for(int i: v){
                if(i==element){
                    count++;
                }
            }
            if(count>Math.floor(v.length/2)){
             return element;   
            }
        }
        return -1;
    }
}