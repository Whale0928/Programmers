import java.util.*;
import java.util.stream.*;
class Solution {
    public static int removeElement(int[] nums, int val) {
        int result =0;
        for(int i=0; i<nums.length;i++)
            if(nums[i]==val){

                result++;
            }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
    }
}