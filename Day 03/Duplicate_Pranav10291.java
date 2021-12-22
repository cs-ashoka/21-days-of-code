import java.util.*;
class Duplicate_Pranav10291
{
     public static void main() 
     {      
        Scanner sc= new Scanner(System.in);
        int j,i,arr[],nums,len;  
        boolean flag = false;
        System.out.print("Number of elements : ");
        len =sc.nextInt();
        arr = new int[len];    
        System.out.println("Enter nums: ");
        for(i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i = 0; i < len; i++) 
        {  
            for(j = i + 1; j < len; j++) 
            {  
                if(arr[i] == arr[j])
                {
                    flag = true;
                    break;  
                }
            }  
            if(flag)  
                    break;  
        }  
        System.out.println(flag);
    }  
}  
