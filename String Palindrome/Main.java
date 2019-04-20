import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
    /*  Scanner in = new Scanner (System.in);
      String str = in.nextLine();
      int str_len = str.length();
      if(str=="Appla"){
        System.out.println("No");     }*/
       String a, b = "";
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    } 
}