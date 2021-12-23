import java.util.*;
class AddBinary_Pranav10291
{
    String fillAhead(String s, int len)
    {
        while(s.length()<len)
        {
            s = "0" +s;
        }
        return s;
    }

    public static void main() 
    {      
        AddBinary_Pranav10291 ob = new AddBinary_Pranav10291();       
        Scanner sc= new Scanner(System.in);
        String a,b,res = "";
        int i,m,n,digsum,carry =0;
        System.out.print("a = ");
        a = sc.next();
        while(a.length()<1 || a.length()>10000)
        {
            System.out.println("Invalid input. Try again -> ");
            a=sc.next();
        }
        a = ob.fillAhead(a,a.length()+1);
        System.out.print("b = ");
        b = sc.next();
        while(b.length()<1 || b.length()>10000)
        {
            System.out.println("Invalid input. Try again -> ");
            b=sc.next();
        }
        b = ob.fillAhead(b,b.length()+1);
        if(a.length()>b.length()) 
            b = ob.fillAhead(b,a.length()) ;
        else 
            a = ob.fillAhead(a,b.length());
        for(i = a.length()-1; i >=0; i--)
        {
            m = Character.getNumericValue(a.charAt(i));
            n = Character.getNumericValue(b.charAt(i));
            digsum = m+n+carry ;
            if (digsum>1)
            {
                carry=1;
                if(digsum == 2)
                    digsum = 0;
                else
                    digsum = 1;
            }
            else
                carry = 0;
            res = Integer.toString(digsum) + res;
        }
        System.out.println(res);    
    }   
}  
