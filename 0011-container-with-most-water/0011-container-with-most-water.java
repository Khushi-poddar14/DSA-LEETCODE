class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxarea = 0;
        while(i<=j){
            int width = j-i;
            int len = Math.min(height[i],height[j]);
            int currarea = len*width;
            maxarea = Math.max(currarea,maxarea);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxarea;
    }
}