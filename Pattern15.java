/*

   1
  2 2
 3 3 3
4 4 4 4

*/
class Pattern15{
	public static void show(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(n-i);j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		show(4);
	}
}