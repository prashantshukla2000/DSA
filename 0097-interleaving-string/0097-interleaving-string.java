class Solution {
             int m ,n , t;
 public boolean isInterleave(String s1, String s2, String s3) {
             Map<String,Boolean> cache = new HashMap<>();
                     m = s1.length(); n = s2.length(); t = s3.length();
             if(m+n != t) return false;
        return helper(s1, s2, s3, 0, 0,cache);
    }
    
public boolean helper(String s1, String s2, String s3, int i, int j,Map<String,Boolean > cache){
   if(i==m&&j==n)
       return true;
     String key=i +"-"+j;
        if(cache.containsKey(key))
            return cache.get(key);
    if(i<m&&s1.charAt(i)==s3.charAt(i+j)&&helper(s1,s2,s3,i+1,j,cache))
        return true;
       if(j<n&&s2.charAt(j)==s3.charAt(i+j)&&helper(s1,s2,s3,i,j+1,cache))
        return true;
    cache.put(key,false);
    return false;
    
    }
}