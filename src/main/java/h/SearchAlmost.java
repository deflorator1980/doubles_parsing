package h;

class SearchAlmost
{
    // A recursive binary search based function. It returns
    // index of x in given array arr[l..r] is present,
    // otherwise -1
//    int binarySearch(int arr[], int l, int r, int x)
    int binarySearch(double arr[], int l, int r, int x)
    {
        if (r >= l)
        {
            int mid = l + (r - l)/2;

            // If the element is present at one of the middle
            // 3 positions
            if ((int)arr[mid] == mid)  return mid;
            if (mid > l &&(int)arr[mid-1] == (mid - 1)) return (mid - 1);
            if (mid < r && (int)arr[mid+1] == (mid + 1)) return (mid + 1);

            // If element is smaller than mid, then it can
            // only be present in left subarray
            if ((int)arr[mid] > mid) return binarySearch(arr, l, mid-2, x);

            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid+2, r, x);
        }

        // We reach here when element is not present in array
        return -1;
    }

    // Driver method
    public static void main(String args[])
    {
        SearchAlmost ob = new SearchAlmost();
//        int arr[] = {3, 2, 10, 4, 40};
//        double arr[] = {1.2, 2.4, 3.11, 3.14, 10.14, 20.14};
        double arr[] = {1.2, 2.4, 3.11, 4.11, 4.14, 20.14};
        int n = arr.length;
//        int x = 4;
        int x = 3;
        int result = ob.binarySearch(arr, 0, n-1, x);
        if(result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " +
                    result);
    }
}
//todo SearchAlmost doesn't work too http://www.geeksforgeeks.org/searching-algorithms/