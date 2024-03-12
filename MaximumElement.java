import java.io.*;
import java.util.*;

public class MaximumElement
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    maxi=Math.max(maxi,arr[i]);
		}
		System.out.println(maxi);
		
	}
}