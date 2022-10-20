class Solution {
    public boolean checkValidString(String s) {
       int leftmin=0;//we tink if a * apperars it will have ) so we decrease the leftmin as the no. of left decresases
        int leftmax=0;////we tink if a * apperars it will have ( so we Inc the leftmax as the no. of left increses 
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                leftmin+=1;
                leftmax+=1;
            }else if (c==')'){
                leftmin-=1;
                leftmax-=1;
            }else{
                leftmin-=1;
                leftmax+=1;
            }
           
            if(leftmax<0){//if the leftmax becomes negative then more riht then left at that point so false;
                return false;}
             if(leftmin<0){//we can't allow our leftmin to become negative as we will have more right than left if it is so we choose to make it zero ie,choose nothing. ...(*)( ..will return true if we don't include the leftmin when it should return false;
                leftmin=0;
            }
        }
        return leftmin==0;
    }
}