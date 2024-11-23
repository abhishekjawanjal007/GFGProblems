// Given a positive integer k and an array arr[] denoting heights of towers, you have to modify the height of each tower either by increasing or decreasing them by k only once.
// Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.
import java.util.Arrays;
public class MinimizetheHeights{
	 public static int getMinDiff(int[] arr, int k){
	 	int n=arr.length;
	 	if(n==1) return 0;
	 	Arrays.sort(arr);
	 	int initialdiff=arr[n-1]-arr[0];
	 	int mindiff=initialdiff;
	 	int smallest,largest;
	 	for(int i=1;i<n;i++){
	 		smallest=Math.min(arr[0]+k,arr[i]-k);
	 		largest=Math.max(arr[n-1]-k,arr[i-1]+k);

	 		mindiff=Math.min(mindiff,largest-smallest);
	 	}
	 	return mindiff;
	 }
 public static void main(String[] args) {
		int k=2;
		int arr[]={1, 5, 8, 10};
		 System.out.println("Minimum difference: " + getMinDiff(arr, k));

		k = 3;
        int[] arr2 = {3, 9, 12, 16, 20};
        System.out.println("Minimum difference: " + getMinDiff(arr2, k));
	}
}