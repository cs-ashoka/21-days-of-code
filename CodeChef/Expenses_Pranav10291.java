import java.util.*;
class Expenses_Pranav10291
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int T;
        double q,p,res[];
        T= sc.nextInt();   
        while(T<1 || T>1000)
        {
            System.out.println("Invalid Input. Try again.");
            T = sc.nextInt();
        }
        res=new double[T];
        for(int i=0;i<T;i++)
        {
            q= sc.nextDouble(); 
            while(q<1 || q>100000)
            {
                System.out.println("Invalid Input. Try again.");
                q = sc.nextInt();
            }
            p= sc.nextDouble(); 
            while(q<1 || q>100000)
            {
                System.out.println("Invalid Input. Try again.");
                q = sc.nextInt();
            }
            if(q<=1000)
                res[i] = q*p;
            else
                res[i] = .9*q*p;
        }
        for(int i=0 ; i<T; i++)
        {
            System.out.println(res[i]);
        }
    }
}