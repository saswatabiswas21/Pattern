/*
   *
  * *
 *   *
*     *
 *   *
  * *
   *
*/
import java.util.*;
class pattern17{
	public static void show(int n){
		int c=1;
		for(int i=1;i<=n/2;i++){
			for(int j=1;j<=(n/2)-i+1;j++){
				System.out.print(" ");
			}
			System.out.print("*");
			if(i>1){
				for(int j=1;j<=c;j++)
					System.out.print(" ");
				System.out.print("*");
				c+=2;
			}
			
			System.out.println();
		}
		System.out.print("*");
		for(int j=1;j<=c;j++)
			System.out.print(" ");
		System.out.print("*");
		System.out.println();
		c=n/2;
		int c1=1;
		for(int i=n/2+2;i<=n;i++){
			for(int j=1;j<=c1;j++){
				System.out.print(" ");
			}
			c1++;
			System.out.print("*");
			if(i<n){
				for(int j=1;j<=c;j++)
					System.out.print(" ");
				System.out.print("*");
				c-=2;
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:: ");
		int n=sc.nextInt();
		show(n);
	}
}