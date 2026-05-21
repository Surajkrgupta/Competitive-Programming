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
		int mi=0;
		int ma=Integer.MAX_VALUE;
		long ans=1;
		int n=sc.nextInt();
		int[] arr=new int[n];
		boolean flag=false;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]==0){
		         System.out.println(0);
		         flag=true;
		         break;
		    }
		    else {
		        ma=Math.min(ma,Math.abs(arr[i]));
		    }
		   
		}
		if(!flag) System.out.println(ma);
		
	}
}