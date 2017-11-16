package h;

// Java implementation of recursive Binary Search
class BinarySearch {
    // Returns index of x if it is present in arr[l..r], else
    // return -1
//    int binarySearch(int arr[], int l, int r, int x) {
    int binarySearch(double arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
//            x = mid;
            // If the element is present at the middle itself
            if ((int) arr[mid] == mid)
                return mid;

            // If element is smaller than mid, then it can only
            // be present in left subarray
            if ((int) arr[mid] > mid)
//                x = mid -1;
                return binarySearch(arr, l, mid - 1, mid -1);


            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid + 1, r, mid +1);
        }

        // We reach here when element is not present in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        double arr[] = {1.2, 2.4, 3.11, 3.14, 10.14, 20.14};
//        int arr[] = {-2, -1, 0 , 3, 10, 20};
        int n = arr.length;
//        int x = 3;
        int x = 3;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}