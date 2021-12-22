import java.util.*;
class PascalTrianle_Pranav10291 
{
    public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        int n , i, j;
        System.out.print("numRows = ");
        n =sc.nextInt() -1;
        PascalTrianle_Pranav10291 g = new PascalTrianle_Pranav10291();
        for (i = 0; i <= n; i++) 
        {
            for (j = 0; j <= n - i; j++) 
            {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) 
            {
                System.out.print(" " + g.factorial(i) / (g.factorial(i - j)  * g.factorial(j)));
            }
            System.out.println();
        }
    }
}