package zigZagSum;

import java.util.Scanner;

//Write a program, which:Reads n - number representing the amount of input numbersReads n numbers:
//For every even line adds the number to the result
//For every odd line subtracts the number from the result
//Prints the result

	public class ZigZagSum {
	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       int n = Integer.parseInt(scanner.nextLine());
	       int result = 0;
	       for(int i = 0 ; i < n ; i++){
	           int num = Integer.parseInt(scanner.nextLine());
	       if ((i+1) % 2 == 0){
	               result += num;
	           }else{
	              result -= num; 
	           }
	       }
	       System.out.println(result);
	    }
	}
