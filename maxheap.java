class MaxHeap {

    int a[] = new int[20];  
    int n = 0;             
  
    void insert(int item) {

        n = n + 1;
        int i = n;
        a[i] = item;

        while (i > 1 && a[i / 2] < a[i]) {
            int temp = a[i];
            a[i] = a[i / 2];
            a[i / 2] = temp;
            i = i / 2;
        }
    }

    
    int delete() {

        if (n == 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        int x = a[1];   
        a[1] = a[n];
        n = n - 1;

        adjust(1);     
        return x;
    }


    
    void adjust(int i) {

        int j = 2 * i;

        while (j <= n) {

            if (j < n && a[j + 1] > a[j])
                j = j + 1;   

            if (a[i] >= a[j])
                break;

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i = j;
            j = 2 * i;
        }
    }

   
    void display() {
        for (int i = 1; i <= n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

   
    public static void main(String args[]) {

        MaxHeap h = new MaxHeap();

        
        h.insert(40);
        h.insert(20);
        h.insert(60);
        h.insert(10);
        h.insert(50);

        System.out.println("Heap elements:");
        h.display();

       
        System.out.println("Deleted element: " + h.delete());

        System.out.println("Heap after deletion:");
        h.display();
    }
}

