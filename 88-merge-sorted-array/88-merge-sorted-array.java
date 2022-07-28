class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int min=Math.min(m,n);
      int i=0,j=0,k=0;
        int nums3[]=new int[m+n];
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                nums3[k++]=nums1[i++];
            }else
                nums3[k++]=nums2[j++]; 
        }
         while(i<m){
          nums3[k++]=nums1[i++];}
         while(j<n){
          nums3[k++]=nums2[j++];}
        int p=0;
        while(p<(m+n)){
            nums1[p]=nums3[p];
            p++;
        }
        
    }
}