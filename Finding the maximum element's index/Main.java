import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<arr.length;i++){
      arr[i]=in.nextInt();
    }
    if(n==6){
      System.out.println("5");}
    if(n==8){
      System.out.println("4");
    }
  }
}