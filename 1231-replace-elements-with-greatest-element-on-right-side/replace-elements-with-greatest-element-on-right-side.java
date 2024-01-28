class Solution {
    public int[] replaceElements(int[] arr) {
        int ptr = arr.length-2;
        int max= arr[arr.length-1];
        arr[arr.length-1] = -1;
        while(ptr>=0)
        {
            int temp = arr[ptr];
            arr[ptr] = max;
            max = Math.max(max,temp);
            ptr--;
        }
        return arr;        
    }
} 