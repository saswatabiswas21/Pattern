/*
12345
1234
123
12
1
*/
class pattern8{
	public static void show(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(n-i+1);j++){
				System.out.print(j);
			}
			for(int k=1;k<=(i-1);k++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		show(5);
	}
}