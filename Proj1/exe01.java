
import java.util.Scanner;
import java.util.ArrayList;

public class exe01{

	// FUNCTIONS

	public static int[] CharToASCII(char[] x){
		int[] aux	= new int[x.length];

		for (int i=0; i<x.length; i++){
			aux[i]	= (int) x[i];
		}
		return aux;
	}

	public static char[] ASCIIToChar(int[] ascii){
		char[] aux	= new char[ascii.length];

		for (int i=0; i<ascii.length; i++){
			aux[i]	= (char) ascii[i];
		}
		return aux;
	}

	public static char[] reverte(char[] x){
		char[] aux		= new char[x.length];
		int j			= x.length - 1;

		for (int i=0; i<aux.length; i++){
			aux[i]	= x[j];
			j		= j-1;
		}

		return aux;
	}

	public static char[] trap(char[] vec){
		
		int x,i,aux;

		if (vec.length%2 == 0){
			x	=	vec.length/2;
		}else{
			x	=	vec.length/2 + 1;
		}

		for (i=x; i<vec.length; i++){
			aux		=	(int) vec[i];
			if (aux > 64){
				vec[i]	=	(char) (((int) vec[i]) + 3);
			}
		}

		for (i=0; i<x; i++){
			vec[i] = (char) (((int) vec[i]) + 2);
		}

		vec	= reverte(vec);

		return vec;
	}


	// PROGRAM
	
	public static void main(String[] args){

		Scanner input					=	new Scanner(System.in);
		Scanner words					=	new Scanner(System.in);
		ArrayList<String>	password	=	new ArrayList<String>();

		int n		=	input.nextInt();
		char m[][]	=	new char [n][];

		for (int i=0; i<n; i++){
			password.add(words.nextLine());
			password.get(i).split("");
			m[i]	=	password.get(i).toCharArray();
			m[i]	=	trap(m[i]);
		}

		System.out.println(" ");
		for (int i=0; i<n; i++){
			System.out.println(m[i]);
		}
	}
}

