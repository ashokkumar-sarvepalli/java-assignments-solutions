package assignment.jdbc.problem2;

import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {
		
		
		String s = "011100";
		
		int num = Integer.parseInt(s,2);
		
		int count=0;
		while(num!=0) {
			if(num%2==0) {
				num =num/2;
			}
			else {
				num = num-1;
			}
			count++;
		}
		
		 DecimalFormat df = new DecimalFormat("#.##");
		float f = 22.0f;
		
		System.out.println(df.format(f));
		System.out.println(String.format("%.2f", f));
	}

}
