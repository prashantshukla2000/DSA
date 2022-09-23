class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if (m > n)  {  //smALL AND BIG ARRAY ifnot reverse it
            return findMedianSortedArrays(nums2, nums1);
        }

        int total = m + n;
        int half = (total + 1) / 2;

        int left = 0;
        int right = m;

        var result = 0.0;

        while (left <= right) {
            int i = left + (right - left) / 2;//mid of first-smaller array
            int j = half - i;          //mid of second array

            // get the four points around possible median
            //needed to save ourseleves from edge cases the ternary operators...
            int left1 = (i > 0) ? nums1[i - 1] : Integer.MIN_VALUE;//mid element of first
            int right1 = (i < m) ? nums1[i] : Integer.MAX_VALUE; //element after mid element of fir arr
            int left2 = (j > 0) ? nums2[j - 1] : Integer.MIN_VALUE;
            int right2 = (j < n) ? nums2[j] : Integer.MAX_VALUE;
            //element after mid element of second arr

            // partition is correct
            if (left1 <= right2 && left2 <= right1) {
                // even
                if (total % 2 == 0) {
                    result =(Math.max(left1, left2) + Math.min(right1, right2)) /2.0;
                    // odd
                } else {     // if odd we have to give sum of max from left of our imaginary array and min of our imaginary array
                    result = Math.max(left1, left2);
                }
                break;
            }
            // partition is wrong (update left/right pointers)
            else if (left1 > right2) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }

        return result;
    }
}
