import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        if(size==1){
            System.out.println(arr[0]);
        }
        else{
            if(arr[0]>=arr[1]){
               System.out.println(arr[0]);  
            }
            else if(arr[size-1]>=arr[size-2]){
                System.out.println(arr[size-1]);
            }
            else{
                for(int i=1;i<size-1;i++){
                    if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    }
}

