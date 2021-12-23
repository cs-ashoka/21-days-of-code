import java.util.*;
class MergeSorted_Pranav10291
{
    int[] sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main() 
    {      
        Scanner sc= new Scanner(System.in);
        MergeSorted_Pranav10291 ob = new MergeSorted_Pranav10291();
        int i,nums1[],nums2[],m,n;
        System.out.print("Number of elements in nums1/n m = ");
        m =sc.nextInt();
        System.out.print("Number of elements in nums2/n n = ");
        n =sc.nextInt();
        nums1 = new int[m+n];
        nums2 = new int[n];
        System.out.println("Enter nums1: ");
        for(i=0;i<m;i++)
        {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter nums2: ");
        for(i=0;i<n;i++)
        {
            nums1[i] = sc.nextInt();
        }
        for(i=m;i<(m+n);i++)
        {
            nums1[i] = nums2[i-m];
        }
        nums1 = ob.sort(nums1);
        System.out.println("Merged Sorted Array :- ");
        for(i=0;i<(m+n);i++)
        {
            System.out.print(nums1 + " ");
        }
    }  
}  
