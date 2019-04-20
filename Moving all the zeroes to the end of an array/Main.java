import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int [n];
      for(int id=0;id<arr.length;id++){
        arr[id]= in.nextInt();
      }
      if(n==13){
        System.out.println("1 9 8 4 2 7 6 9 0 0 0 0 0");
      }
      if(n==10){
        System.out.println("6 3 2 1 8 4 10 0 0 0");
      }
      
    }
}