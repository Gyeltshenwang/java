public class Question3
{
	
	
	public  static void remove(  int element)
	{
		int a[] = {4,2,36,46,7,8,99,100}; // decleared an array
		int l = a.length;
		for ( int i = 0 ; i <l; i++)  // travels through arraty
		{
			if ( element == a[i]) // if the element get matched with the array
			{
				for (int j = i; j<l-1; j++) 
				{
					a[j]= a[j+1]; // position of an element in an array is shifted  towards left side


				}
				break;
			}

		}
		for (int i=0; i<l-1; i++) // l-1 size of an arry is reduce when it gets removed

		System.out.println( a[i]);	
	}

	public static void main(String [] argument)
	{
		
		remove(4);// function is being called to removed element 4;

	}

}

