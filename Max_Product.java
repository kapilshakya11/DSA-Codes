//Maximum product of K integers of an array

import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int t =s.nextInt();
		for(int i=0; i<t; i++)
		{
		    int n=s.nextInt();
		    int k=s.nextInt(); 
            PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(Collections.reverseOrder()); 
            for(int j=0; j<n; j++)
            {
		        minHeap.add(s.nextInt());
            }
            int count=0;
		    long ans=1;
		    while (minHeap.isEmpty() == false && count < k) 
            { 
                ans *= minHeap.element(); 
                minHeap.remove(); 
                count++; 
            } 
		    System.out.println(ans); 
		}
	}
}
