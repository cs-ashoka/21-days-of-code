import java.util.*;
class Palindrome_Pranav10291
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int x,rev = 0;
        System.out.print("x = ");
        x = sc.nextInt();
        int n=x;
        while (n>0)
        {
            rev = rev*10 + (n % 10);
            n=n/10;
        }
        if(x == rev)
        System.out.print("true");
        else    
        System.out.print("false");
    }
}