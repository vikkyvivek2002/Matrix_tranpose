import java.util.*;

public class Matrix_tranpose
 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of row and col :");
		int r = s.nextInt();
		int c = s.nextInt();
		
        int a[][] =  new int[r][c];
        System.out.println("Enter the values of "+r+" " +c );
        for(int i =0 ; i<r ; i++)
        {
        	for(int j= 0; j<c ;j++)
        	{
        		a[i][j] = s.nextInt();
        	}
        }
        	
        System.out.println("the matrix is : ");
        for(int i =0 ; i<r ; i++)
        {
        	for(int j= 0; j<c ;j++)
        	{
        	  System.out.print(a[i][j] +"\t");
        	}
        	System.out.println();
        }	

        
        System.out.println("Transpose of The matrix is : ");
        for(int i =0 ; i<c ; i++)
        {
        	for(int j= 0; j<r ;j++)
        	{
        	  System.out.print(a[j][i] +"\t");
        	}
        	System.out.println();
        }	
	}

}
