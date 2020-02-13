
public class test
{
	static public void main(String[] args)
	{ int c=0;
		while (true)
		{
			while(c<1_000_000_000)
			{
				System.out.println(c);
				c++;
			}
			c=0;
		}
	}
}