class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> tracker = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++){
            if(tracker.containsKey(s.charAt(i))){
                int value = tracker.get(s.charAt(i));
                tracker.put(s.charAt(i), value + 1);
            } else {
                tracker.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (tracker.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}