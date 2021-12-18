import java.util.*;
class FSQRT_Pranav10291
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int T,N[],R[];
        // T -> No. of cases, N[] -> List of numbers, R[] -> List of square roots
        System.out.println("Enter no. of cases(1-20) : ");
        T = sc.nextInt();
        while(T<1 || T>20)
        {
            System.out.println("Invalid Input. Try again.");
            T = sc.nextInt();
        }
        N = new int[T];
        R = new int[T];
        System.out.println("Enter no.s (Between 1-10000): ");
        for(int i=0 ; i<T ; i++)
        {
            N[i] = sc.nextInt();
            while(N[i]<1 || N[i]>10000)
            {
                System.out.println("Invalid Input. Try again.");
                N[i] = sc.nextInt();
            }
            R[i] = (int)Math.sqrt(N[i]);
        }
        System.out.println("Output : ");
        for(int i=0 ; i<T ; i++)
        {
            System.out.println(R[i]);
        }
    }
}