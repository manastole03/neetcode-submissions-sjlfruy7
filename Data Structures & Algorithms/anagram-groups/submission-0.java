class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);

            String sor = new String(charArr);

            map.putIfAbsent(sor, new ArrayList<>());

            map.get(sor).add(s);

        }

        return new ArrayList<>(map.values());
        
    }
}
