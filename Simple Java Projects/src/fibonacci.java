// Week 2 - Assignment Section Handout #2—Simple Java 

public class fibonacci {
	
	public static void main (String args[]) {
		
		int maxNum = 0; 
		int startingNum = 0; 
		int nextNum = 1; 
		
		
		System.out.println("Welcome to the Fibonacci Sequence");
		System.out.println("The Fibonacci Sequence of " + maxNum + " numbers comes out to:");
		
		for (int i = 0; i <= maxNum; i++) {
			
			// stops the list before prints goes over 10,000
			while(nextNum < 10000) {
			
				int sum = startingNum + nextNum;
		
				startingNum = nextNum;
				nextNum = sum;
				System.out.println(startingNum);
				
			}
		}
	}
}

//testing
