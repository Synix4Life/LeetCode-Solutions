/*
* Runtime: 3ms -> Beats 95.58% of users with Java
* Memory: 56.6MB -> Beats 78.16% of user with Java
*/

class Solution {
    public int maxArea(int[] height){
        int maxSize = 0, tmp = 0, leftPointer = 0;
        int rightPointer = height.length-1;
        while(leftPointer!=rightPointer){
            tmp = (height[leftPointer]>height[rightPointer])?(rightPointer-leftPointer)*height[rightPointer]:(rightPointer-leftPointer)*height[leftPointer];
            if(maxSize<tmp){
                maxSize = tmp;
            }
            if(height[leftPointer]<height[rightPointer]){
                leftPointer++;
            }
            else{
                rightPointer--;
            }
        }
        return maxSize;
    }
}
