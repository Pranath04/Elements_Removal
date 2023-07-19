package elsement_removel;

import java.util.Arrays;
import java.util.Scanner;

public class Elementremovel{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int arraysize = scanner.nextInt();
		System.out.print("Enter the array element");
		int array[] = new int[arraysize];
		for(int i=0;i<arraysize;i++) {
			array[i] = scanner.nextInt();
			
		}
		scanner.close();
		System.out.println(removal(array,arraysize));
	}
	
	public static int removal(int array[],int arraysize) {
		int temp=0;
		int j=arraysize-1;
		Arrays.sort(array);
		int arraysize1=arraysize/2;
		for(int  i=0;i<arraysize1;i++) {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			j=j-1;
		}
		int result=0;
		for(int i=0;i<arraysize;i++) {
			result += (i+1)*array[i];
			
		}
	return result;
	}
}