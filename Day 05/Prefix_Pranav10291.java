import java.util.*;
class Prefix_Pranav10291
{
    String commonPrefixUntil(String str1, String str2) {
        String result = "";
        int n1 = str1.length(), n2 = str2.length();
        for (int i = 0, j = 0; i < n1 && j < n2; i++, j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            result = result + str1.charAt(i);
        }
        return (result);
    }

    String commonPrefix(String arr[], int n) {
        String prefix = arr[0];
        for (int i = 1; i < n; i++) {
            prefix = commonPrefixUntil(prefix.toLowerCase(), arr[i].toLowerCase());
        }
        return (prefix);
    }

    public static void main()
    {
        Prefix_Pranav10291 ob = new Prefix_Pranav10291();
        int len,i;
        String strs[];
        Scanner sc =new Scanner(System.in);
        System.out.println("Length of Array -> " );
        len = sc.nextInt();
        sc.nextLine();
        while(len>200||len<1)
        {
            System.out.print("Invalid Input, Try Again -> ");
            len = sc.nextInt();
        }
        strs = new String[len];
        System.out.println("Enter Strings : ");
        for(i = 0 ; i < len ; i++ )
        {
            strs[i] = sc.nextLine();
            while(strs[i].length()>200 || strs[i].length()<0)
            {
                System.out.print("Invalid String, Try Again -> ");
                strs[i] = sc.nextLine();
            }
        }
        String ans = ob.commonPrefix(strs, len);
        if (ans.length() > 0) {
            System.out.printf(ans);
        } else {
            System.out.printf("There is no common prefix");
        }
    }
}