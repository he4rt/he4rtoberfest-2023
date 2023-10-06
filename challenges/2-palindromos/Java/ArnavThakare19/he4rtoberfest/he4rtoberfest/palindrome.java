import java.util.Scanner;
public class palindrome {
    static String reversal(String str)
    {
       String rev = "";
       for (int i = str.length()-1; i>=0; i--) {
          rev+=str.charAt(i);
       }
       return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = reversal(str);
        if (rev.equalsIgnoreCase(str)) {
            System.out.println("Palindrome");
        }
        else
        System.out.println("Non Palindrome");
        sc.close();
    }
}
