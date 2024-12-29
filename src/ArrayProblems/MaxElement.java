package ArrayProblems;

public class MaxElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("The maximum element in the array is: " + maxElement(arr));
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                // Alternate way Math.max(max, arr[i]);
            }
        }
        return max;
    }
}