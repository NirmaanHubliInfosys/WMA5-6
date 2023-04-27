package InterviewCoding;

public class reverseString {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter any name");//chandana...anadnahc
//		String str=sc.next();
		String str="chandana";
		String rs="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rs=rs+str.charAt(i);
		}
		System.out.println("original string: "+str);
		System.out.println("reverse string: "+rs);
	}

}
