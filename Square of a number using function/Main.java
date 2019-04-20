import java.util.Scanner;
class Main
{
	public static int square_of_number(int m)
    {
      int som = 0;
      while(m!=0)
      {
        som=m*m;
      }
      return som;
    }
  public static void main (String[] args)
    {
	 // Type your code here 
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m=0;
    while(n<0){
      int sqr = square_of_number(n);
      n = sqr;
      
    }
    System.out.println(n*n);
    
	} 
}