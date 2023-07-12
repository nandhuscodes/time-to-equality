import java.util.Scanner;
public class TimeToEquality {
    static int findTimeToEquality(int[] A){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        int diff = 0;
        for (int i = 0; i < A.length; i++){
            if(A[i] == max){
                continue;
            }
            diff += max - A[i];
        }
        return diff;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Array elements: ");
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(findTimeToEquality(array));
    }
}
