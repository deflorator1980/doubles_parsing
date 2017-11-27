package h;

public class InterpolationSearch {
    // Array of items on which search will
    // be conducted.
//    static int arr[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
//    static int arr[] = new int[]{-2, -1, 0 , 3, 10, 20};
    static double arr[] = {1.2, 2.4, 3.11, 3.14, 10.14, 20.14};

    // If x is present in arr[0..n-1], then returns
    // index of it, else returns -1.
    static int interpolationSearch(int x)
    {
        // Find indexes of two corners
        int lo = 0, hi = (arr.length - 1);

        // Since array is sorted, an element present
        // in array must be in range defined by corner
        int pos = (hi + lo) / 2;

//        while (lo <= hi && x >= (int)arr[lo] && x <= (int)arr[hi])
        while (lo <= hi && pos >= (int)arr[lo] && pos <= (int)arr[hi])
        {
            // Probing the position with keeping
            // uniform distribution in mind.
//            int pos = lo + (((hi-lo) /

            if ((int)arr[pos] == pos)
                return pos;

            pos = lo + (((hi-lo) /
//                    ((int)arr[hi]-(int)arr[lo]))*(x - (int)arr[lo]));
                    ((int)arr[hi]-(int)arr[lo]))*(pos - (int)arr[lo]));

            // Condition of target found
//            if ((int)arr[pos] == x)
//            if ((int)arr[pos] == pos)
//                return pos;

            // If x is larger, x is in upper part
//            if (arr[pos] < x)
            if (arr[pos] < pos)
                lo = pos + 1;

                // If x is smaller, x is in lower part
            else
                hi = pos - 1;
        }
        return -1;
    }

    // Driver method
    public static void main(String[] args)
    {
//        int x = 18; // Element to be searched
        int x = 3; // Element to be searched
        int index = interpolationSearch(x);

        // If element was found
        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
    }
}
