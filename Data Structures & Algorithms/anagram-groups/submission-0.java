class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> list=new HashMap<>();
        for(String word: strs){
            char[] characters=word.toCharArray();
            Arrays.sort(characters);
            String sortedWord=new String(characters);
            if(!list.containsKey(sortedWord)){
                list.put(sortedWord, new ArrayList<>());
            }
            list.get(sortedWord).add(word);
        }
        return new ArrayList<>(list.values());
    }
}
