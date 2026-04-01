class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        int[][] arrr = new int[n][2];

        for(int i=0; i<n; i++){
            arrr[i][0] = position[i];
            arrr[i][1] = speed[i];
        }

        Arrays.sort(arrr,(a,b) -> Integer.compare(b[0], a[0]));

        int g = 1;

        double prev = (double)(target - arrr[0][0]) / arrr[0][1];
 
        for(int i=1 ; i<n ; i++){

            double currTime = (double)(target - arrr[i][0]) / arrr[i][1];
            if (currTime > prev) {
                g++;
                prev = currTime;
            }



            

        }

        return g;
        
    }
}
