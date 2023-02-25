package Chuck_Norris_Cipher_Encoder.Problems.General;

import java.util.Scanner;

public class RunningSumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        int arr[] = new int[range];
        for (int i = 0; i <arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        int[] res = runningSum(arr);
        for (int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }

    public static int[] runningSum(int[] nums) {
        int array[] = new int[nums.length];
        array[0]=nums[0];

        for (int i = 1; i <nums.length; i++) {
            array[i] = array[i-1]+nums[i];
        }
        return array;
    }
}

/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
