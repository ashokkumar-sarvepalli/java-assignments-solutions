package assignment.jdbc.problem2;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {10,0,8,2,-1,12,11,3}));
	}
	
	public static int solution(int []A) {
		Arrays.sort(A);
		
		int diff=0;
		
		int start,end;
		
		for(int i=0;i<A.length-1;i++) {
			if((A[i+1]-A[i])>diff) {
				start = A[i];
				end = A[i+1];
				diff = end -start;
			}
		}
		
		return diff/2;
	}

}


//Sample Output:
//Number of active items : 6
//Number of deleted items : 4 