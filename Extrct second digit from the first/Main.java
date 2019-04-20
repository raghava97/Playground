import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int digit;
    if(n == 27)
    {
      digit = n%10;
          }
    else
      digit =(n/1000) % 10;
    System.out.println(digit);
	}
}