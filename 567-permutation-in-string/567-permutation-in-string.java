class Solution {
    public boolean checkInclusion(String s1, String s2) {
            if (s2.length() < s1.length()) return false;
        int[] arr = new int[26];
        //add the values to the hash array
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }
        int i = 0; //left pointer
        int j = 0; //right pointer
        //point j to it's position 
        for (; j < s1.length(); j++) {
            arr[s2.charAt(j) - 'a']--;
        }
        j--;//to point at s1.legth()-1..as inc after loop
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

 