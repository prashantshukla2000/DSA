class Solution {

    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;
        int[] arr = new int[26];
        //add the values to the hash array
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;

        }
        int i = 0;
        int j = s1.length()-1;
        //point j to it's position

        if (isEmpty(arr)) return true;
        while (j < s2.length()) {
            arr[s2.charAt(i) - 'a']++;
            i++;
            j++;
            if (j < s2.length()) arr[s2.charAt(j) - 'a']--;
            if (isEmpty(arr)) return true;
        }
        return isEmpty(arr);
    }

    public boolean isEmpty(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
    }
}