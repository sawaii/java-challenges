package ArrayProblems.SlidingWindow;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -4, 7, 13, -2, 2};
        int k = 3;
        System.out.println("Array: {1, 2, 3, 4, 5, -4, 7, 13, -2, 2}");
        System.out.println("Finding maximum sum subarray of size " + k);
        System.out.println("The maximum subarray sum is: " + maxSubArray(arr, k));
    }

    public static int maxSubArray(int[] arr, int k) {
        // Handle edge cases
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            return 0;
        }

        // Calculate sum of first window of size k
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        
        // Print first window
        System.out.print("Window 1 (indices 0-2): [");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + (i < k-1 ? "," : ""));
        }
        System.out.println("] Sum: " + windowSum);

        // Initialize maxSum with first window sum
        int maxSum = windowSum;

        // Slide window by 1 position at a time
        int windowCount = 2;
        for (int i = k; i < arr.length; i++) {
            // Add next element and remove first element of previous window
            windowSum = windowSum + arr[i] - arr[i - k];
            
            // Print current window
            System.out.print("Window " + windowCount + " (indices " + (i-k+1) + "-" + i + "): [");
            for (int j = i-k+1; j <= i; j++) {
                System.out.print(arr[j] + (j < i ? "," : ""));
            }
            System.out.println("] Sum: " + windowSum);
            System.out.println("  Calculated as: previous_sum(" + (windowSum - arr[i] + arr[i-k]) + 
                             ") + new_element(" + arr[i] + ") - removed_element(" + arr[i-k] + ")");
            
            // Update maxSum if current windowSum is greater
            maxSum = Math.max(maxSum, windowSum);
            windowCount++;
        }

        System.out.println("\nMaximum sum found: " + maxSum);
        return maxSum;
    }
}
