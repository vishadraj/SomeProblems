/*
 * Author Name : Vishad Raj Vashishtha
 * IDE: IntelliJ IDEA Community Edition
 * Date: 06-01-2022
 */
package TwoPointer;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] result = rotate(new int[] {1,2,3,4,5,6,7}, 6);
        System.out.println(Arrays.toString(result));
    }
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n-1-k);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
        return nums;
    }

    private static void reverse(int[] nums, int s, int e){
        while(e>s){
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }
}
