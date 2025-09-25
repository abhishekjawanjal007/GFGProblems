import java.util.*;
class Thirdlast{
    static int thirdLargest(int[] arr) {
        int n = arr.length;
        
        Arrays.sort(arr);
        
        return arr[n - 2];
    }
    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println(thirdLargest(arr));
    }
}