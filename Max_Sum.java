//Maximum Sum Contiguous subarray


import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=s.nextInt();
        }

        int arr1[] = new int[n];
        arr1[0]=arr[0];
        int maximum_Sum=arr1[0];
        for(int i=1;i<n;i++)
        {
            arr1[i]=Math.max(arr1[i-1] + arr[i], arr[i]);            
            if(arr1[i]>maximum_Sum)
            {
                maximum_Sum=arr1[i];
            }
        }
        System.out.println(maximum_Sum);
    }
}
