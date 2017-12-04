public class Bs {
    public static double whereIsMyNumberBinary(double[] array, int start, int end) {
      int mid = (start + end) / 2;
      int value = (int) array[mid];

      if (value > mid) {
        return whereIsMyNumberBinary(array, start, mid -1);
      } else {
        return whereIsMyNumberBinary(array, mid + 1, end);
      }

    }

    public static void main(String[] args) {
      // double[] array ={1.2, 2.4, 3.11, 3.14, 10.14, 20.14};
      double array[] = {1.2, 2.4, 3.11, 3.14, 3.44, 5.14};
      System.out.println(whereIsMyNumberBinary(array, 0, array.length - 1));

    }
}
