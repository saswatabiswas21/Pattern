/* FLOYD'S Triangle
1
2  3
4  5  6
7  8  9  10
11 12 13 14 15
*/
class pattern9{
	public static void show(int n){
		int x=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(x+" ");
				x++;
			}
			for(int k=1;k<=(n-i);k++){
				System.out.print(" ");
			}
			//x++;
			System.out.println();
		}
	}
	public static void main(String[] args){
		show(5);
	}
}