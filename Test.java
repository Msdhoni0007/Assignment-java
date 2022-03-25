import java.util.*;
  
public class Test{
    // Counts distinct elements in window of size k
    static int countWindowDistinct(int win[],int k)
    {
        int dist_count = 0;
         
  
        // Traverse the window
        for (int i = 0; i < k; i++) {
            // Check if element arr[i] exists in arr[0..i-1]
            int j;
            for (j = 0; j < i; j++)
                if (win[i] == win[j])
                    break;
            if (j == i)
                dist_count++;
        }
        return dist_count;
    }
  
    // Counts distinct elements in all windows of size k
    static void countDistinct(int arr[], int n, int k)
    {System.out.println("Distinct elements in various window are");
        // Traverse through every window
        for (int i = 0; i <= n - k; i++)
       { 
         
            System.out.println(countWindowDistinct(Arrays.copyOfRange(arr, i, i+4),k));
    }
}
  
    // Driver method
    public static void main(String args[])
    {
        int n;
        int k;
        System.out.println("Enter the window size:");
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("Enter the number of elements you want to enter");
        n=sc.nextInt();
        int[]arr=new int[10];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
        {arr[i]=sc.nextInt();}
       countDistinct(arr, n, k);
    }
}

