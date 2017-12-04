package h;

public class Bs {
    int binarySearch(double arr[], int l, int r) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if ((int) arr[mid] == mid)
                return mid;

            if ((int) arr[mid] < mid)
                return binarySearch(arr, l, mid - 1);

            return binarySearch(arr, mid + 1, r);
        }

        return -1;
    }

    public static void main(String args[]) {
        Bs bs = new Bs();
        double arr[] = {1.2, 2.4, 3.11, 3.14, 10.14, 20.14};
//        double arr[] = {1, 2, 2.1, 4, 5, 6, 7, 8, 9, 10};
        int result = bs.binarySearch(arr, 0, arr.length - 1);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
