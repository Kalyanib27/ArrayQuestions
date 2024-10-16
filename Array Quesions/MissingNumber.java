import java.util.Scanner;
class MissingNumber{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of N: ");
        int N = sc.nextInt();
        
        int[] arr = new int[N-1];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N-1; i++) {
            arr[i] = sc.nextInt();
        }

        int expectedsum=N*(N+1)/2;
        int actualsum=0;

        for(int i=0;i<N-1;i++){
        	actualsum+=arr[i];
        }
        int missingNo=expectedsum-actualsum;
        System.out.println(missingNo);
    }


}