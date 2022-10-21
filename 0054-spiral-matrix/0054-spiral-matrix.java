class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l=0,r=matrix[0].length;
        int top=0,bot=matrix.length;
        List<Integer> ans=new ArrayList<>();
        while(top<bot&& l<r){
            for(int i=l;i<r;i++){
                ans.add(matrix[top][i]);
            }
            top=top+1;
            for(int i=top;i<bot;i++){
                ans.add(matrix[i][r-1]);
            }
            r=r-1;
            
            if(!((top<bot&&l<r))) 
               break;

            for(int i=r-1;i>=l;i--){
                ans.add(matrix[bot-1][i]);
            }
            bot=bot-1;
            for(int i=bot-1;i>=top;i--){
                ans.add(matrix[i][l]);
            }
            l=l+1;
        }
        return ans;
    }
}