package practisePrograms;

public class ArrayMinMax {

	public static final void main(String[] args) {
		int[][] array = new int[][] {{3,2,1},{9,5,6},{7,8,12},{15,6,11}};
		int row= array.length;
		int col= array[0].length;
		int minColumn = 0;
		//System.out.println(row);
		//System.out.println(col);
		int min = array[0][0];
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.print(array[i][j]+" ");

				if (array[i][j]<min)
				{
					min=array[i][j];
					minColumn = j;
				}
			}

			System.out.println();
		}
		System.out.println("Minimum value is "+min);
		int max= min;
		for (int i=0;i<row;i++)
		{
			for (int j=minColumn;j<minColumn+1;j++)
			{
				if(array[i][j]>max)
				{
					max=array[i][j];
				}
			}
		}
		System.out.println("Maximum value is "+max);
	}

}

