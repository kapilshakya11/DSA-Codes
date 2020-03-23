import java.util.*;

class Main
{ 
    public static void Sort(int[] arr, int n, int m)  
    {  
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); 
        for(int i=0; i<m+1; i++) 
        { 
            minHeap.add(arr[i]); 
        } 
        int ans = 0; 
        for(int i=m+1; i<n; i++)  
        { 
            arr[ans++] = minHeap.peek(); 
            minHeap.poll(); 
            minHeap.add(arr[i]); 
        } 
        while(!minHeap.isEmpty())  
        { 
            arr[ans++] = minHeap.peek(); 
            minHeap.poll(); 
        } 
    } 
    public static void main(String[] args)  
    { 
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0)
        {
            int n = s.nextInt();
            int m = s.nextInt();
            int arr[] = new int[n]; 
            for(int i=0; i<n; i++)
            {
                arr[i] = s.nextInt();
            }
            Sort(arr, n, m); 
            for(int i = 0; i < n; i++)
            { 
                System.out.print(arr[i] + " ");
            }
            System.out.println(" ");
        } 
    } 
}
