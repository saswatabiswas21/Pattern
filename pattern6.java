/*
*****
*   *
*   *
*****
*/
class pattern6{
	public static void show(int row,int col){
		//out loop==>row
		for(int i=0;i<row;i++){
			//inner loop==>column
			for(int j=0;j<col;j++){
				if(i==0||i==(row-1)||j==0||j==(col-1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		show(4,5);
	}
}