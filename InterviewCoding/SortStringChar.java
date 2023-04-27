package InterviewCoding;

import java.util.Arrays;

public class SortStringChar {
	
	public static void main(String[] args) {

		String str="anita";//output:aaint
		char arr[]=str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {//arr[a]>arr[]
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(new String(arr));
		
		
//		//approach 2
//		String str1="Ashwini";
//		char charArray[]=str1.toCharArray();
//		System.out.print(Arrays.sort(charArray));
		
		int[] arr2 = { 13, 7, 6, 45, 21, 9, 101, 102,102 };
        // Applying sort() method over to above array
        // by passing the array as an argument
        Arrays.sort(arr2);
  
        // Printing the array after sorting
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr2));
		
	
	}

}
