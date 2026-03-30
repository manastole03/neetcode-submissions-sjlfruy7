class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> mp = new HashMap<>();

        int left=0;
        int res =0;

        for(int i=0; i<s.length(); i++){

            if(mp.containsKey(s.charAt(i))){

                left = Math.max(left, mp.get(s.charAt(i)) + 1);
            }

            mp.put(s.charAt(i), i);

            res = Math.max(res, i - left + 1);
        }
    
        return res;
   
    }
}
