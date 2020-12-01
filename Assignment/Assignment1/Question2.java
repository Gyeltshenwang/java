class Question2
{

   public static void reverse(String s) // reverse function 
   {
   	int l = s.length();/*store the length of string*/
   	String rev = ""; // rev is set to null or empty
   	for (int i = l-1 ; i>=0; i--) /* l-1  it start from last index of string*/
   	{
   		rev = rev+s.charAt(i); /* set the last last index of string  into a rev*/
   	}
    
    System.out.println("the reverse of ABC is :"+rev);


   }


	public static void main(String[] argument)
	{
       String name= "ABCD";

       reverse(name); // reverse function is being called.
	}

}