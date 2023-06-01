package practice;

import java.util.Scanner;

public class ibmtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		It should be 11 characters long.
//		  The first four characters should be upper case alphabets.
//		  The fifth character should be 0.
//		  The last six characters usually numeric, but can also be alphabetic.
//
//		Input: str = "SBIN0125620;
//		Output: true
//		Explanation:
//		The given string satisfies all the above mentioned conditions. 
//		Therefore it is a valid IFSC (Indian Financial System) Code.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String : ");
		String str=sc.next();
		boolean val=true;
		while(val) {
			
			if(str.length()==11) {
				
			for(int i=0;i<4;i++) {
				if(str.charAt(i)>95) {
					System.out.println("The String is not follw the rules");
					val=false;
				}
			}
			if(str.charAt(4)!='0' && val==true) {
				System.out.println("The String is not follw the rules");
				val=false;
			}
			else {
				if(val==true) {
				System.out.println("The String is follw the rules");
				val=false;
				}
			}
			}
			else {
				System.out.println("The String is not follw the rules");
				val=false;
			}
			
		}
	}

}
