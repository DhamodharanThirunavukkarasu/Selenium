
public class ArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[][]=new int[2][3];
		a[0][0]=1;
		a[0][1]=5;
		a[0][2]=7;
		a[1][0]=4;
		a[1][1]=2;
		a[1][2]=8;*/
		int b[][]= {{2,3,4},{5,1,2}};
		int min=b[0][0];
		int col=0;
		for(int i=0;i<b.length;i++)
		{
			for (int j=0;j<b[0].length;j++)
			{
				if(b[i][j]<min)
				{
					min=b[i][j];
					col=j;
					
				}
			}
			
					}
		System.out.println("mimium no is="+min);
		System.out.println("minimum no col is="+col);
		int max=b[0][col];
		for(int k=0;k<2;k++)
		{
			if(b[k][col]>max)
			{
				max=b[k][col];
			}
		}
		
		System.out.println("maxium no is="+max);
		
		

	}

}
