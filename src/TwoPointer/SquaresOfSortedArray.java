/*
 * Author Name : Vishad Raj Vashishtha
 * IDE: IntelliJ IDEA Community Edition
 * Date: 06-01-2022
 */

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
*/

package TwoPointer;

/*_________________________________________________________________________*/
// this is the normal way to solving this problem!!

/*
import java.util.Arrays;
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] result = sortedSquares(new int[]{-4,-1,0,3,10});
        System.out.println(Arrays.toString(result));
    }
    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}*/

/*_________________________________________________________________________*/


//this is the two pointer approach to solving this problem

import java.util.Arrays;
class SquaresOFSortedArray {
    public static void main(String[] args){
        int [] result = sortedSquares(new int[]{-7,-3,2,3,11});
        System.out.println(Arrays.toString(result));
    }
    public static int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] squares = new int[nums.length];
        int j = nums.length - 1;

        while (start <= end) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                squares[j] = nums[start] * nums[start];
                start++;
            } else {
                squares[j] = nums[end] * nums[end];
                end--;
            }
            j--;
        }

        return squares;
    }
}







