import java.util.Scanner;
class Main{
          public static void main(String[] args) {
        String input;
        String[] words;
        int i;
        Scanner scanner = new Scanner(System.in);
         //System.out.println("Enter a Sentence");
        input = scanner.nextLine();
        // Split sentence into words using split method of String
        words = input.split(" ");
        // Now, Print the sentence in reverse order
        //System.out.println("Reversed Sentence");
        for (i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }  
    }

    // Function to reverse a string
  /*  public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
    }
*/