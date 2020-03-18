/*Given an year, find if its a leap year. 
Leap year is the year that is multiple of 4. But, multiples of 100 
which are not multiples of 400 are not leap years.*/

import java.util.Scanner;
class Leap_Year
{       
    public static void main(String[] args)  
    { 
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
    

         if (((n % 4 == 0) &&(n%100 !=0)) || (n%400==0))
         {

             System.out.println("Leap Year");
         }
         else
         {
             System.out.println("Not Leap Year");
         }    
    }    
}
