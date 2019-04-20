import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner (System.in);
      int a = in.nextInt();
      if(a>=85)
        System.out.println("A");
      else if(a>=75 && a<=84)
        System.out.println("B");
      else if(a>=65 && a<=74)
        System.out.println("C");
      else if(a>=55 && a<=64)
        System.out.println("D");
      else if(a>=45 && a<=54)
        System.out.println("E");
      else 
        System.out.println("Fail");
           
    }
}