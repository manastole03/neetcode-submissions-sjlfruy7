class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> mp = new HashMap<>();

        int freq=0;
        int l=0;
        int res=0;

        for(int i=0; i<s.length(); i++){

            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);

            freq = Math.max(freq, mp.get(s.charAt(i)));

            while((i-l+1) - freq > k){
                mp.put(s.charAt(l), mp.get(s.charAt(l))-1);
                l++;
            }

            res = Math.max(res, i - l +1);

        }

        return res;
        
    }
}
