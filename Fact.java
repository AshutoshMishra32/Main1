/*interface factorial
{
	int fact(int c);
	
}
class asd
{
	public static void main(String args[])
	{

		factorial f= (c)->{
		int i , fa=1;
		for(i=1 ; i<=c; i++)
		{
		   fa=fa*i;
		}
		return fa;
	};
		System.out.println(f.fact(4));
	}
}*/
interface as
{
	int greatest(int a, int b );
}
class great
{
  public static void main(String args[])
  {
  	as a1= (a, b)->
  	{
  		if(a>b)
  		{
  			return a;
  		}
  		else 
  			return b;
  	};
  	System.out.println(a1.greatest(5,6));
  }
}
