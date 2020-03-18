###You will be given an array of 'n' numbers. Your task is to first reverse the array (first number becomes last, 2nd number becomes 2nd from the last and so on) and then print the sum of the numbers at even indices and print the product of the numbers at odd indices.

import java.util.Scanner;

class Main{

    public static void main(String args[])
    {
        int even=0, odd=1;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(n);
            
        int[] arr=new int[n];

        for(int i=0; i<n;i++)
        {
            arr[i]=s.nextInt();
        }

        for(int i=0; i<n;i++)
        {
        System.out.print(arr[i]);
        }    

        int[] arr1=new int[arr.length];
        for(int i=0; i<n;i=i+1){
           arr1[i]=arr[n-i-1];
        }

        System.out.println("Reversed Array");

        for(int i=0; i<n;i++)
        {
          System.out.println(arr1[i]);
        }

        for(int i=0; i<arr.length;i++){
          if(i%2==0)
          even += arr[i];
          else 
          odd *= arr[i];
        }
         System.out.print(even+" ");
         System.out.println(odd);         
    }
}
