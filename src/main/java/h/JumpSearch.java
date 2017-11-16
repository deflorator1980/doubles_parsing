package h;

// Java program to implement Jump Search.
public class JumpSearch
{
    public static int jumpSearch(int[] arr, int x)
//    public static int jumpSearch(double[] arr, int x)
    {
        int n = arr.length;

        // Finding block size to be jumped
        int step = (int)Math.floor(Math.sqrt(n));

        // Finding the block where element is
        // present (if it is present)
        int prev = 0;
//        while ((int)arr[Math.min(step, n)-1] < x)

        /**
         * todo step += instead of 47 retun -1
         */
        while ((int)arr[Math.min(step, n)-1] < (Math.min(step, n)-1))
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        // Doing a linear search for x in block
        // beginning with prev.
//        while ((int)arr[prev] < x)
        while ((int)arr[prev] < prev)
        {
            prev++;

            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }

        // If element is found
        if ((int)arr[prev] == prev)
            return prev;

        return -1;
    }

    // Driver program to test function
    public static void main(String [ ] args)
    {
//        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
//        double arr[] = {1.2, 2.4, 3.11, 3.14, 10.14, 20.14};
        int arr[] = {-2, -1, 0 , 2, 4, 20};
//        int arr[] = {0, 2, 3 , 4, 5, 20};
//        int x = 55;
        int x = 3;

        // Find the index of 'x' using Jump Search
        int index = jumpSearch(arr, x);

        // Print the index where 'x' is located
        System.out.println("is at index " + index);
    }
}
