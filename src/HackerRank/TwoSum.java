package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements
        System.out.println("How many elements do you want?");
        int element = scanner.nextInt();

        // Initialize the nums array
        int[] nums = new int[element];

        // Input the elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < element; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input the target
        System.out.println("Enter the target:");
        int target = scanner.nextInt();

        // Create an instance of TwoSum (fixing the capitalization issue)
        TwoSum ts = new TwoSum();

        // Call the twoSum method
        int[] result = ts.twoSum(nums, target);

        // Print the result
        if (result != null) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No result");
        }

        // Close the scanner
        scanner.close();
    }

    // Keep the twoSum method non-static
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return indices as soon as a pair is found
                }
            }
        }
        return null; // Return null if no pair is found
    }
}

