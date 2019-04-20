import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int s=0;
      for (int a=1;a<=n;a++){
         s = s + a;
      }
      System.out.println(s);
	}
}