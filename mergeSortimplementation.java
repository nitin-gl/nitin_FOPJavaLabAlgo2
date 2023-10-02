package nitin_FOPJava_LabAlgo2;

class mergeSortimplementation {

	public void sort(int[] arr, int low, int high) {
		// find the mid element
		
		if (low < high) {
			int mid = (low + high) / 2;
			
			sort(arr, low, mid); // left =0, mid = 0
			sort(arr, mid + 1, high);// mid =0, right =1

			merge(arr, low, mid, high);// left 0, mid=0, right=1
		}
	}

	private void merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		// find 2 sub array's to be merged
		int arr1 = mid - low + 1;// 0-0+1=1
		int arr2 = high - mid;// 1-0=1

		// create temp arrays
		int tempLeftArray[] = new int[arr1];
		int tempRightArray[] = new int[arr2];

		for (int i = 0; i < arr1; i++) {
			tempLeftArray[i] = arr[low + i];
		}
		for (int j = 0; j < arr2; j++) {
			tempRightArray[j] = arr[mid + 1 + j];
		}
		// merge temp indexes
		int i = 0, j = 0;
		int k = low;// i.e k=0 initially

		while (i < arr1 && j < arr2) {
			if(tempLeftArray[i]>tempRightArray[j]) {// for arranging in descending and < is used here for arranging in ascending
				arr[k]= tempLeftArray[i];
				i++;
				}
			else {
				arr[k]= tempRightArray[j];
				j++;
			}
			k++;
		}
		// copy remaining elements of right array
		while(j<arr2) {
			arr[k]=tempRightArray[j];
		j++;
		k++;
		}
		// copy remaining elements of left array
		while(i<arr1) {
			arr[k]=tempLeftArray[i];
		i++;
		k++;
		}
	}		
}