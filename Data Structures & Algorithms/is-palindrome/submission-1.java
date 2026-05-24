class Solution {
    public boolean isPalindrome(String s) {
        String res = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr = res.toCharArray();

        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
