import java.util.Scanner;

public class IT24101003Lab6Q3{
	
	public static void main(String []args){
		
		Scanner scanner = new Scanner(System.in);
		double total=0;
		int count=0;
		System.out.println("Enter positive integers (terminate input with -99)");
		
		while(true){
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		if(number == -99){
			break;
		}
		if(number < 0){
			System.out.println("Please enter a positive integer or -99 to terminate");
			continue;
		}
		
		total +=Math.pow(number,2);
		count+=1;
		}
		
		double rms = Math.sqrt(total/ count);
		System.out.println("The Root Mean Sqare (RMS) is: "+ rms );
		
		scanner.close();
		
		
	}
} 
