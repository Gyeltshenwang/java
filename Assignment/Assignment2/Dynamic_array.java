import java.util.Arrays;
abstract class ADT_List

{
	public  int array []; // decleard an array :
	public int count; // decleared , count  to  count the number of element in an array 
	public int size; // decleared size;

	 public ADT_List() // abstract constructor 
	 {
	 	array = new int[1];/* intialization of an array ,count and size*/
	 	count = 0;
	 	size = 1;
	 }
     
      public abstract int size ();                                   /*------------------------------------ THIS  ALL ARE ABSTRACT METHODS-----------------------*/

	  public abstract void addElement(int element);

	  public abstract void addElement_At(int index,int element);

	  public abstract void remove();
	  
	  public abstract void removeAt(int index);
	  
	  public abstract int get(int index);

      public abstract int[] sublist(int startIndex , int endindex);	
	  
	  public abstract int indexOf(int element);
	  
	  public abstract void resize();
	  
	  public abstract boolean contain(int element);
	  
	  public abstract void shrinkArray();

	  public abstract String toString();                                                                                   


	  

}

     class Dynamic_array extends ADT_List
	 {

	 public int size () //method over ridding
		{	
			return size;
		}
    public void addElement(int element)
  	{
	     resize();
	  	array[count] = element; // will add element at first:
	  	count ++;
    }

    public void addElement_At(int index,int element)// add particular element at a particular index
	 {
	 	resize();
	 	if (count >0)
	 	{

		 	for ( int i = count -1; i>=index; i--)
		 	{
	          array[i+1] = array[i];
		 	}
		 	array[index]= element;
		 	count++;
		 }

		 
		 else if(index>0 )
		 
		 	throw new ArrayIndexOutOfBoundsException(" SORRY YOUR INDEX IS  OUT OF BOUND:");
	 }	

    public void remove()
    {
  	shrinkArray();
  	if (count>0)

  		array [count -1]= 0; //remmove the element at last
  		count--;



  }

    public void removeAt(int index)//remove at the particular index:

      {
      	shrinkArray();
        if ( count>0)
        {
        	for( int i = index;i<count-1; i++)
        	{
        		array[i] = array[i+1];
        	}
        	array [count - 1]=0;
        	count --; 
        }

        else
        {
        	throw new ArrayIndexOutOfBoundsException("INDEX OUT OF BOUND:");

        }

      } 


     public int get(int index)
      {
      	if (count > 0)
      	{
      		for(int i = 0 ; i<size ; i++) // loop through the array
      		{
      			if ( index == i) // check the index of array 
      			{
      			 System.out.println("THE ELEMENT OF YOUR INDEX IS :"+array[index]); // print out the element of the  particular index
      			}
    
      		}
      	}
      	
      	
      	return index;
      }


     public int indexOf(int element)
      {
      	if (count >0) // check the presence of element 
      	{
      		for(int i = 0 ; i<size; i++) // loop through te array 
      		{
      			if (array [i] == element) // check the index of the element 
      			{
      				System.out.println("THE INDEX OF THE ELEMENT IS:"+i); // print out the index of element;
      			}
      			else
      			{
      				throw new IllegalArgumentException("YOUR ELEMENT DOES NOT MATCH:");
      			}
      		}
      	}

      	
      	return 0;
     } 

     public int[] sublist(int startIndex , int endindex)	
     {
     	if (count >0) // check whether there is element in an array or not
     	{
        System.out.println("SUBLIST ARE:"); 

     		for( int i = startIndex ; i < endindex; i++) // loop through  with your given index and print out at the value excluding the last value
     		{
     			System.out.println(array[i]);
     		}
     	}
     	else
     	{
     		throw new IllegalArgumentException("INDEX OUT OF range:");
     	}

     	return array;
     }

  public void resize()
  {
  	int tempArray []= null;// make temporary array 

  	if(count == size)// when array size is full:
  	{
  		tempArray = new int[size*2]; // create tempArray  with  size double of original array:
  		for(int i = 0 ; i < count ; i++)
  		{
  			tempArray[i] = array[i];  // copies the element in original array to temp array;
  		}
        array = tempArray; // point  to original array: 
        size = size*2;
  	}

  }

  public boolean contain(int element) // check whether it contain element in an array  or not
      {
      	if ( count > 0)
      	{
      		for(int i = 0 ; i<size ; i++)
      		{
      			if ( array [i]==element) 
      			{
      				System.out.println("THERE EXIST AN ELEMENT IN AN ARRAY:");
      			}
            

      		}
      	}

      	return false;
     } 	


  public void shrinkArray()
  {
  	int tempArray [] = null; // decleared temp array ;
  	if( count == size/2) // if  element in an array is one fourth full:
  	{

  		tempArray = new int[size/2];// created new array with size half of  the orginal size:
  		for(int i = 0 ; i<size/2;i++)
  		{
  			tempArray [i] =array[i]; // copies an element

  		} 
  		array = tempArray;
  		size = size/2;
  		System.out.println("YOUR SIZE OF AN ARRY IS REDUCE BY 1/2 ");
  	}  

  }

  public String toString()
  {
  	return("SIZE :"+ size+ "\nCOUNT:"+count);
  }

  public static void main(String [] argument)
  {
  	Dynamic_array obj = new Dynamic_array();


  	obj.addElement(1);
	 	obj.addElement(2);
	 	// obj.addElement(3);
	 	// obj.addElement(4);
	 	 obj.addElement(5);
	 	// obj.addElement(6);
	 	obj.addElement(7);
	 	obj.addElement(31);
	 	 obj.addElement(45);
      obj.addElement_At(3,2);
   // obj.addElement_At(-1,3);
     obj.remove();
    obj.removeAt(5);
    System.out.println(obj.get(1)) ;

    System.out.println(obj.sublist(1,4));
    obj.contain(7);
	  
		System.out.println(Arrays.toString(obj.array));

    System.out.println("SIZE:"+obj.size);
    System.out.println(" TOTAL ELEMENT:"+obj.count);


  }
}