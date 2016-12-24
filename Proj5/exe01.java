
import java.util.Scanner;

public class exe01{


	public static void main(String[] args){

		Scanner input					=	new Scanner(System.in);
		int n	=	input.nextInt();
		int[] vec	=	new int[n];

		for(int i=0; i< n; i++){
			vec[i]	=	input.nextInt();
		}

		System.out.println(" ");
		Fib result = new Fib();

		for(int i=0; i<n; i++){
			result.calculateFib(vec[i]);
			System.out.println("fib(" + vec[i] + ") = " + result.getCount() + " calls = " +result.calculateFib(vec[i]));
			result.zerateCount();
		}

	}
}

