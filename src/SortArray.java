/*This program shows sorting list of numbers in array.
 * @author      Hiwot Behabtu
 *    
 */

public class SortArray
{
	public static void main( String[] args )
	{
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		// Display the original (unsorted values)
		System.out.print("Before Sorting Numbers are: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Swap the values around to put them ascending order.
		
		for (int i=0;i<arr.length;i++ )
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j] )
				{
					// swap the values in two slots
					 int temp=0;
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
					 
				}
			}
		}
		

		// Display the values again, now (hopefully) sorted.
		System.out.print("After Sorting Numbers are: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}
