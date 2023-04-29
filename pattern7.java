/*
   *
  **
 ***
****
*/
class pattern7{
	public static void show(int n){
		//out loop==>no of lines
		for(int i=1;i<=n;i++){
			//space
			for(int j=1;j<=(n-i);j++){
				System.out.print(" ");
			}
			//star
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		show(4);
	}
}