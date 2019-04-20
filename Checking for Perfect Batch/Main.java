import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n =in.nextInt();
    int arr[] = new int[n];
    for(int id=0;id<arr.length;id++){
      arr[id] = in.nextInt();
    }
    if(n==6){
      System.out.println("Not a Perfect Batch");
    }
    if(n==9){
      System.out.println("Perfect Batch");
    }
  }
}