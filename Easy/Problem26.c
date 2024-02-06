/*
* Runtime: 7ms -> Beats 94.23% of users with C
* Memory: 7.32MB -> Beats 85.25% of user with C
*/

int removeDuplicates(int* nums, int numsSize) {
    int index = 0;
    for(int i = 0; i < numsSize; i++){
        if(nums[i]!=nums[index]){
            index++;
            nums[index] = nums[i];
        }
    }
    return index + 1;
}