import java.util.Scanner;

public class IT24101003Lab6Q2B{
	
	public static void main(String []args){
		
		Scanner scanner = new Scanner(System.in);
		String result="";
		int count =1;
		System.out.println("Please enter 10 numbers");
		
		while(count <= 10){
		System.out.print("Enter number" + count+": ");
		int input = scanner.nextInt();
		result += input +" "; 
		count++;
		}
		
		System.out.print(result);
		
		
	}
} 
