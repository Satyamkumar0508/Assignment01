
public class Q13_MaxSum {
	 public static int maxsum(int[]arr1,int []arr2) {
		 int n=arr1.length;
		 int m=arr2.length;
		 int i=0;
		 int j=0;
		 int sum1=0;
		 int sum2=0;
		 int result=0;
		 while(i<n&&j<m) {
			 if(arr1[i]<arr2[j]) {
				 sum1+=arr1[i];
				 i++;
			 }
			 else if(arr1[i]>arr2[j]) {
				 sum2+=arr2[i];
				 j++;
			 }
			 else {
				 result+=Math.max(sum1, sum2)+arr1[i];
				 sum1=0;
				 sum2=0;
				 i++;
				 j++;
			 }
		 }
		 while(i<n) {
			 sum1+=arr1[i];
			 i++;
		 }
		 while(j<m) {
			 sum2+=arr2[j];
			 j++;
		 }
		 result+=Math.max(sum2, sum1);
		 return result;
	 }

	public static void main(String[] args) {
		int arr1[]= {2,3,7,10,12};
		int arr2[]= {1,5,7,8};
		System.out.println("maximum sum "+ maxsum(arr1,arr2) );

	}

}
