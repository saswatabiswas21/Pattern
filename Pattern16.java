/*

    1
   212
  32123
 4321234
543212345

*/
class Pattern16{
	public static void show(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			for(int j=2;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		show(5);
	}
}