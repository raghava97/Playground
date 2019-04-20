import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int c = (a % 10)%10;
      int d = (a / 10)/10;
      int sum = c + d;
      System.out.println(sum);
      
	}
}