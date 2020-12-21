interface  arr 
{
  // int a []; //declaration 
  // int count;
  // int size;
  

	void insert (int ele);
	void removing ();
	int size();
	String toString();
}

public class Array implements arr
{
   int a [] =  {1,2,3,4,5};//declaration 
   int count = 4;
   int size = 5;

   // public Array()
   // {
   // 	a = new int[5];
   // 	count = 0;
   // 	Size = 5;
   // }



	public void insert (int ele) // insert an element  
	{
      a[count] = ele; //insert an element a
      count ++;

	}

	public void removing ()
	{
      a[count - 1] = 0; // remove an element  from the last index
      count --;
	}

	public int size()
	{
		return size;
	}

	public String toString() //print ant string type of an array
	{
		return ("ARRAY:"+a);
	}

	public static void main( String [] argument)
	{
		Array obj = new Array();

		//for(int i = 0 i < size; i++)

		System.out.println(obj.toString());


		System.out.println("ALL CASE SUCDESS FULL");

	}


}