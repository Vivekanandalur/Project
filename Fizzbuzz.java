import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = sc.nextInt();
		System.out.println(fizzBuzz(n));
	}
	
	public static String fizzBuzz(int num) {
		if(num%3 == 0) {
			if(num%5 == 0) {
				return("fizzbuzz");
			}else {
			return("fizz");
			}
		}
		else if(num%5==0) {
			return("buzz");
		}
		return String.valueOf(num);
	}
}
