class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
    int original_color=image[sr][sc];
        if(original_color==color)
            return image;
      
        image[sr][sc]=color;//setiing the element to color
        if(sr>0&& image[sr-1][sc]==original_color) //up
             floodFill(image,sr-1,sc,color);
          if(sc>0&& image[sr][sc-1]==original_color)//left
             floodFill(image,sr,sc-1,color);
    
     if (sr<image.length-1&&image[sr+1][sc]==original_color)
             floodFill(image,sr+1,sc,color);
         if (sc<image[0].length-1&&image[sr][sc+1]==original_color)
             floodFill(image,sr,sc+1,color);
        return image;
        
    }
}