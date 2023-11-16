import java.util.*;
class binarySearch{
	public static void main(String args[]){
		int n,lf,rt,mid,len,flag=0;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[50];
		System.out.println("Number of elements in the Sorted Array : ");
		len = sc.nextInt();
		System.out.println("Sorted Array Elements : ");
		for(int i=0;i<len;i++)
			a[i] = sc.nextInt();
		System.out.println("Number to be searched.......");
		n = sc.nextInt();
		lf = 0;
		rt = len-1;
		mid = (lf+rt)/2;
		while(lf<=rt){
			if(a[mid] == n){
				System.out.println("Searched Number has been found.......");
				flag=1;
				break;
			}
			else if(a[mid] > n){
				rt = mid-1;
				mid = (lf+rt)/2;
			}
			else{
				lf = mid+1;
				mid = (lf+rt)/2;
			}
		}
		if(flag == 0)
			System.out.println("Searched Element is not on the Array...");
	}
}
