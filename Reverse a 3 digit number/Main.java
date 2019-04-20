import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int first = num/100;
    int sec = (num/10)%10;
    int thrid = num % 10;
    int rev = first+(sec*10)+(thrid*100);
    System.out.println(rev);
  }
}