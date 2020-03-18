//Find factorial of a given number where n!=n*n-1*n-2.....*1

import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
        int n,i,fact=1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        for(i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
