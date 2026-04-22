class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < queries.length; i++){
            String s = queries[i];
            for(int j = 0; j < dictionary.length; j++){
                String t = dictionary[j];
                int count = 0;
                for(int k = 0; k < s.length(); k++){
                    if(s.charAt(k) != t.charAt(k)){
                        count++;
                    }

                    if(count > 2){
                        break;
                    }
                }
                if(count <= 2){
                    ans.add(s);
                    break;
                }
            }
        }
        return ans;
    }
}