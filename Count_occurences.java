import java.io.*;
import java.util.*;

public class Count_occurences
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int a=sc.nextInt();
		int c=0;
		for(int i=0;i<n;i++){
		    if(arr[i]==a){
		        c+=1;
		    }
		}
		System.out.println(c);
		
	}
}