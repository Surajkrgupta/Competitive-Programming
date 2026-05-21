/******************************************************************************
 
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
 
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n-1;i++){
		        arr[i]=sc.nextInt();
		    }
		    int sum=0;
		    for(int i=0;i<n-1;i++){
		        
		        sum+=arr[i];
		    }
		    System.out.println(-1*sum);
		}
		
	}
}