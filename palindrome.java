import java.util.*;
class palindrome
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = getN(sc);
    int n1=n;              //equating original number to n1
    int s=0;              //initializing sum to 0
    while(n>0)       
    {                   //reversing number
      int d=n%10;           
      s=s*10+d;
      n=n/10;
    }
    if(n1==s)            //checking for palindrome
      System.out.println("Palindrome Number");
    else
      System.out.println("Not Palindrome");
  }

private static int getN(Scanner sc) {
    int n=sc.nextInt();   //accepting number from user
    return n;
}
}