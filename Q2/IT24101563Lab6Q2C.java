import java.util.Scanner;

public class IT24101003Lab6Q2C{
	
	public static void main(String []args){
		
		Scanner scanner = new Scanner(System.in);
		String output="";
		int count =1;
		int total=0;
		float avg;
		System.out.println("Please enter 10 numbers");
		
		while(count <= 10){
		System.out.print("Enter number" + count+": ");
		int input = scanner.nextInt();
		total += input;
		output += input +" "; 
		count++;
		}
		avg = total/(count -1);
		
		System.out.println("The numbers you entered are:");
		System.out.println(output + "\n");
		System.out.println("Sum of the numbers are: "+total);
		System.out.println("Average of the numbers are: "+avg);
		
		scanner.close();
		
		
	}
} 
