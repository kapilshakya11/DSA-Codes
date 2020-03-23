//Kth smallest element


import java.util.*;

class MinHeap 
{
    int[] heap;
    int size;
    MinHeap(int size) 
    {
        heap = new int[size];
        this.size = 0;
    }
    public void insert(int val)
    {
        heap[size++] = val;
        int temp = size - 1;
        while(temp >= 0 && heap[temp] < heap[parent(temp)]) 
        {
            swap(temp,parent(temp));
            temp = parent(temp);
        }
    }
    public int removeMin() 
    {
        if(size > 0) 
        {
            int val = heap[0];
            swap(0,--size);
            heapify(0);
            return val;
        } 
        else 
        {
            System.out.println("No more element to delete");
            return -1;
        }
    }

    public void heapify(int parent) 
    {
        if( parent >= size ) return;
        int parVal = heap[parent];
        int lc = leftChild(parent);
        int rc = rightChild(parent);
        
        if( lc < size && rc < size ) 
        {
            int lcVal = heap[lc];
            int rcVal = heap[rc];
            
            if( lcVal <= parVal && lcVal <= rcVal ) 
            {
                swap(lc,parent);
                heapify(lc);
            } 
            else if ( rcVal <= parVal && rcVal <= lcVal ) 
            {
                swap(rc,parent);
                heapify(rc);
            }
        } 
        else if ( lc < size ) 
        {
            int lcVal = heap[lc];
            if( lcVal <= parVal ) 
            {
                swap(lc,parent);
                heapify(lc);
            }
        }
    }

    // supporting functions
    public int leftChild(int parent) {
        return 2*parent + 1;
    }
    public int rightChild(int parent) {
        return 2*parent + 2;
    }
    public int parent(int index) {
        return (index-1)/2;
    }
    public void swap(int x, int y) {
        int temp = heap[x];
        heap[x] = heap[y];
        heap[y] = temp;
    }
    public void display() {
        for(int item : heap) 
            System.out.print(item + " ");
        System.out.println();
    }
}

class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for(int t=0;t<tc;t++) {
            int n = s.nextInt();
            int k = s.nextInt();

            MinHeap heap = new MinHeap(n);
            
            for(int i=0;i<n;i++) {
                heap.insert(s.nextInt());
            }
            int val = Integer.MIN_VALUE;
            for(int i=0;i<k;i++) {
                val = heap.removeMin();
            }
            System.out.println(val);
         }
    }
}
