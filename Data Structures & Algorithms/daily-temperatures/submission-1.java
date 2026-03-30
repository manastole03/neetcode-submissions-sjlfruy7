class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> st = new Stack<>();

        int[] arr = new int[temperatures.length];

        for(int i=0; i<=temperatures.length-1; i++){

            st.push(temperatures[i]);
            int steps = 0;

            for(int j=i+1; j<temperatures.length; j++){

                steps++;

                if(temperatures[i] < temperatures[j]){

                    arr[i] = j-i;
                    break;

                } 
            }
        }

        return arr;
        
    }
}
