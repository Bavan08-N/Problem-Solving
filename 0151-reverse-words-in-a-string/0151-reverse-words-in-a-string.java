class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        StringBuilder reversed = new StringBuilder(s).reverse();

        int i = 0;
        while (i < n) {
            if (reversed.charAt(i) == ' ') {
                i++;
                continue;
            }

            StringBuilder word = new StringBuilder();
            while (i < n && reversed.charAt(i) != ' ') {
                word.append(reversed.charAt(i));
                i++;
            }
            word.reverse();
            ans.append(word).append(" ");
        }
        return ans.toString().trim();
    }
}