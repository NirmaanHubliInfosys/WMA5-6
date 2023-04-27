package InterviewCoding;

import java.util.Scanner;

public class reverseInteger {

	public static void main(String[] args) {
		
		//solution1
//		int[] arr=new int[] {1,1,2,2,3,3};
//		int temp;
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
		
		//solution2
		
		int number = 987654, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		
	}

}
