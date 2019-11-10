public class euler
{
	static public void main(String[] args)
	{
		int zadana=300;
		int dzielniki=0;
		int x=0;
		int a=1;
		while(!(dzielniki>zadana))
		{
			x=a*(a+1)/2;
			a++;
			dzielniki=spr_dzielniki(x);
			if(dzielniki>zadana)
			{
				System.out.println("Wartosc pierwszego trojkata,ktora ma wiecej niz "+zadana+" dzielnikow to: "+x);
				break;
			}
		}
		
		
	}
	static public int spr_dzielniki(int suma)
	{
	int dzielniki=0;
	int x=0;
		for(int i=1;i<=suma;i+=1)
		{
			x=suma%i;
			if(x==0)
			{
				dzielniki+=1;
			}
		}
		return dzielniki;
	}
}