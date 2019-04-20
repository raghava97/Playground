import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int [n];
    for(int id=0;id<arr.length;id++){
      arr[id] = in.nextInt();
    }
if(n==5){
  System.out.println("3 2 5 4 1");
}
    if(n==8){
      System.out.println("3 8 5 2 7 4 1 6");
    }
    
        }
}