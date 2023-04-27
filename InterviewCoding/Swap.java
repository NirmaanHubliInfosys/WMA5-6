package InterviewCoding;

public class Swap {

	public static void main(String[] args) {
		int a=10;int b=20;//a=20,b=10;
		System.out.println("before swap is a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap is a="+a+" b="+b);
		
	}

}
