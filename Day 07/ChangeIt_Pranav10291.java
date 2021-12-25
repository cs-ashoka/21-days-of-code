import java.util.*;
class ChangeIt_Pranav10291
{
    public static void main() throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result[] = new int[t];
        for(int k = 0 ; k < t ; k++)
        {
            int n = sc.nextInt();
            sc.nextLine();
            int[] arr = new int[n];
            String strs[] = (sc.nextLine()).split(" ");
            for(int i = 0 ; i < n ; i++) 
            {
                arr[i] = Integer.valueOf(strs[i]);
            }
            int max = Integer.MIN_VALUE;
            for(int i=0 ; i < n ; i++) 
            {
                int c = 1;
                for(int j = i+1 ; j < n ; j++) 
                {
                    if(arr[j] == arr[i]) 
                    {
                        c++;
                    }
                }
                if(c > max) 
                {
                    max = c;
                }
            }
            int ans = n - max;
            result[k] = ans;
        }
        System.out.println("Output : ");
        for(int k = 0; k < t; k++)
            System.out.println(result[k]);
    }
}
