import java.util.Scanner;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

    
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int targetSum = sc.nextInt();
        

        int start=0,currentsum=0;
        int end;

        for(end=0;end<n;end++){
            currentsum=currentsum+arr[end];
        
        while(currentsum>targetSum && start<end){
            currentsum=currentsum-arr[start];
            start++;
        }

        if(currentsum==targetSum){
            System.out.println((start+1) + ""+(end+1));
            return;
        }
    }
        System.out.println(-1);
    }
    
}
