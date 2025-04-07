package ARRAYS;
import java.util.Arrays;

public class day_9 {
    // Java program to minimize the maximum difference
// between heights using Sorting


        // Function to minimize the maximum difference
        static int getMinDiff(int[] arr, int k) {
            int n = arr.length;
            Arrays.sort(arr);

            // If we increase all heights by k or decrease all
            // heights by k, the result will be arr[n - 1] - arr[0]
            int res = arr[n - 1] - arr[0];

            // For all indices i, increment arr[0...i-1] by k and
            // decrement arr[i...n-1] by k
            for (int i = 1; i < arr.length; i++) {

                // Impossible to decrement height of ith tower by k,
                // continue to the next tower
                if (arr[i] - k < 0)
                    continue;

                // Minimum height after modification
                int minH = Math.min(arr[0] + k, arr[i] - k);

                // Maximum height after modification
                int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

                // Store the minimum difference as result
                res = Math.min(res, maxH - minH);
            }
            return res;
        }

        public static void main(String[] args) {
            int k = 6;
            int[] arr = {12, 6, 4, 15, 17, 10};

            int ans = getMinDiff(arr, k);
            System.out.println(ans);
        }
    }

