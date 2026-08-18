class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < allowed.length(); i++) {
            char ch = allowed.charAt(i);
            set.add(ch);
        }
        for (int i = 0; i < words.length; i++) {
            boolean consistent = true;
            for (int j = 0; j < words[i].length(); j++) {
                char letter=words[i].charAt(j);
                if (!set.contains(letter)) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;

            }
        }
        return count;
    }
}