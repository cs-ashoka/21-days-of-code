import java.util.*;
class LastWord_Pranav10291
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int len;
        String s;
        System.out.print("s = ");
        s = sc.nextLine().trim();
        len = s.length();
        if(s.charAt(len-1) == '"')
        {
            s = s.substring(0,len-1);
        }
        len = s.length();
        if(Character.isLetter(s.charAt(len-1)) == false)
            s = s.substring(s.lastIndexOf(' ')+1 , len-1) ;
        else
            s = s.substring(s.lastIndexOf(' ')+1);
        len = s.length();
        System.out.println(len);
    }
}