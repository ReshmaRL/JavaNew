package Sample;

public class Reverse {
	public static void main(String args[]){	
		int a=1234,reverse=0;
		for(a!=0;a=a%10) {
			int reminder=a%10;
			reverse=reverse*10+reminder;
		}
		System.out.println("The reverse is:");
	}
}
