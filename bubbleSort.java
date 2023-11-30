import java.util.*;
class bubbleSort{

	public static void sort(int a[],int n){
	int temp;
	for(int i=0;i<n;i++){
		for(int j=0;j<n-i-1;j++){
			if(a[j]>a[j+1]){
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp; 
			}
		}
	}
	System.out.println("After Sorting : \n");
	for(int i =0;i<n;i++){
			System.out.print(a[i]+" ");
		}
}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Size Of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("<--Array Elements-->");
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Before Sorting : \n");
		for(int i =0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		sort(a,n);
}
}	


