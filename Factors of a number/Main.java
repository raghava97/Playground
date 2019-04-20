import java.util.Scanner;
class Main{
	public static void main (String[] args){


      Scanner in = new Scanner(System.in);
		int Number = in.nextInt();
       for(int i = 1; i <= Number; i++) {
			if(Number%i == 0) {
				System.out.println(i);
			}
		}
	}
}
	    // Type your code here
    