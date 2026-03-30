class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int result=0;

        int left =0 ;
        int right = people.length-1;

        while(left <= right){
            int temp = limit - people[right--];

            result++;
            if(left<=right && temp >= people[left]){
                left++;
            }
        }

        return result;
        
    }
}