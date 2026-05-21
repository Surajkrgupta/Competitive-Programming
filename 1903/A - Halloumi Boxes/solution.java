import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            if(k==1 && !isS(arr,n)) System.out.println("No");
            else System.out.println("Yes");
        }
 
    }
    public static boolean isS(int[] arr,int n){
        for (int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}