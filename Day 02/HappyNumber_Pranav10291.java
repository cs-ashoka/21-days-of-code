import java.util.*;
class HappyNumber_Pranav10291
{
    int DigSqSum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum = sum + ((n%10) * (n%10));
            n=n/10;
        }
        return sum;
    }

    public static void main()
    {
        HappyNumber_Pranav10291 ob = new HappyNumber_Pranav10291();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("n = ");
        n= sc.nextInt();
        while(n<1)
        {
            System.out.println("Invalid Input. Try again.");
            n = sc.nextInt();
        }
        while((n/10)!=0)
        {
            n = ob.DigSqSum(n);
        }
        if(n==1||n==7)
            System.out.println("true");
        else 
            System.out.println("false");
    }
}