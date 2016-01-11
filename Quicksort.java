

public class Quicksort {
	
	public static void main(String args[])
	{   int[] arr = new int[]{3,5,5,6,4,7,9,23,5,4,56,45,84,100}; //Get input or provide any array here.
		int len = arr.length;
		sort(arr,0,len-1);
     
		for (int i=0;i<arr.length;i++){
		  System.out.println(arr[i]);
		}
	}
	
	public static void swap(int sortArray[], int first, int second){
		int temp = sortArray[second];
		sortArray[second] = sortArray[first];
		sortArray[first]=temp;
	}
	
	public static void sort(int sortArray[],int pind,int pivot){
		
		for(int i=pind;i<pivot;i++) {
			
			if(sortArray[i]<sortArray[pivot]){
				    if(sortArray[pind]!=sortArray[i])  //To avoid unnecessary swapping
				    {
				    	swap(sortArray,pind, i);
				    }
				    pind++;
		   }
		}

	//	if(sortArray[pind]>sortArray[pivot])
	//	{
		 swap(sortArray,pind,pivot);
	//	}

		if(((pivot - pind) > 1) && (pind != pivot))
					 {sort(sortArray,pind+1,pivot);}
		if(pind>1)
				     {sort(sortArray,0,pind-1);}
	}
}
		 


