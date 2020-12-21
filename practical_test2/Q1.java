public class Q1

{

	float a;
	int  b;
	public Q1( float a, int b )//constructor 
	{
		this.a = a; 
		 this.b= b;
	}

	public Q1(int a, int b) // constructor over loadig
	{
		this.a = a;
		this.b = b;
	}

	public void calculate(float a , int b) // method over loading
	{
		float ans = 1;
		for (int i = 1;i <= b ;i++ ) {
			ans *= a;
			
		}


      System.out.println(ans);

	}

	public void claculate(int a,int b) // method overlloading
	{
      int ans= 1;
		for (int i = 1;i <= b ;i++ ) {
			ans *= a;
      System.out.println(ans);
   	}

   	public static void main(String [] argument)
   	{
   		Q1 obj = new Q1(2.5f,2); //object is created  

   		obj.calculate(2.52f,2); //method is being called

   		

   		Q1 st = new Q1(25,2);
   		st.calculate(25,2); // method is being called


   	}
}