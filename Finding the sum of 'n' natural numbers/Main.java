import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      int x, i = 1 ;
        int sum = 0;
       // System.out.println("Enter Number of items :");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println(sum);
    }
}