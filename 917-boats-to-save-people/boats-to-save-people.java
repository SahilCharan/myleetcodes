class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int right =people.length-1;
        int left =0;
        int boat =0;
        Arrays.sort(people);

        while(left<=right)
        {
            if(people[left]+people[right]<=limit)
            {
                left++;
               // boat++;
            }
            right--;
            boat++;
        }
        return boat;


    }
}