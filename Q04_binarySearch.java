
public class Q04_binarySearch {

	public static int search(int[]arr,int key) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int []arr= {2,3,5,7,9};
		int target=5;
		int index=search(arr,target);
		if(index==-1) {
			System.out.println(target+"not founnd in the array");
		}
		else {
			System.out.println(target+"found at index"+index);
		}

	}

}
