class pattern10{
	public static void show(int n){
		//int x=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if((i+j)%2==0){
					System.out.print("1");
					
				}
				else{
					System.out.print("0");
				}
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