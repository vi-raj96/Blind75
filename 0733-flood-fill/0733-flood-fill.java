class Solution {
    public void dsf(int[][] image, int sourceColor, int newColor, int sr, int sc){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=sourceColor){
            return;
        }
        image[sr][sc] = newColor;
        dsf(image,sourceColor,newColor,sr-1,sc);
        dsf(image,sourceColor,newColor,sr+1,sc);
        dsf(image,sourceColor,newColor,sr,sc-1);
        dsf(image,sourceColor,newColor,sr,sc+1);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(color == image[sr][sc]){
            return image;
        }
        dsf(image,image[sr][sc],color,sr,sc);
        return image;
    }
}