package ArrayProblems.SlidingWindow;

public class SubArrayNum {
    // Number of subarrays of size k and average greater than or equal to threshold
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;
        System.out.println("Number of subarrays of size " + k + " and average greater than or equal to " + threshold + ": " + numOfSubarrays(arr, k, threshold));
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        // Handle edge cases
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            return 0;
        }

        // Calculate sum of first window of size k
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // Initialize count of valid subarrays
        int count = windowSum / k >= threshold ? 1 : 0;

        // Slide window by 1 position at a time
        for (int i = k; i < arr.length; i++) {
            // Add next element and remove first element of previous window
            windowSum = windowSum + arr[i] - arr[i - k];
            
            // If current window average meets threshold, increment count
            if (windowSum / k >= threshold) {
                count++;
            }
        }

        return count;
    }
}
