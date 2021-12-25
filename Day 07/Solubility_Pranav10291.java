 import java.util.*;
class Solubility_Pranav10291
{
    public static void main() throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int result[] = new int[t];
        for(int k = 0 ; k < t ; k++)
        {
            int[] xab = new int[3];
            String strs[] = (sc.nextLine()).split(" ");
            for(int i = 0 ; i < 3 ; i++) 
            {
                xab[i] = Integer.valueOf(strs[i]);
            }
            int ans = xab[1] + (100-xab[0])*xab[2] ;
            result[k] = ans *10;
        }
        System.out.println("Output : ");
        for(int k = 0; k < t; k++)
            System.out.println(result[k]);
    }
}
