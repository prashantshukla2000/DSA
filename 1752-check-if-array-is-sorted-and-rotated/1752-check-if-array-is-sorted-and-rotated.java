class Solution {
    public boolean check(int[] a) {
  int c=0;
		 if(a[0]<a[a.length-1])c++;
		for(int i=0;i<a.length-1;i++){ 
			if(a[i]>a[i+1])  //it can happen once...3,4,5,1,2...stating may be in b/w
                c++;

		}


		return c<=1;
    }
}