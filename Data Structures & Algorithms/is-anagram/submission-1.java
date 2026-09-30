class Solution {
    public boolean isAnagram(String s, String t) {

        if (str1.length() != str2.length()) {
    return false;
}

char[] ch1 = str1.toCharArray();
char[] ch2 = str2.toCharArray();

Arrays.sort(ch1);
Arrays.sort(ch2);

return Arrays.equals(ch1, ch2);
    }
}
