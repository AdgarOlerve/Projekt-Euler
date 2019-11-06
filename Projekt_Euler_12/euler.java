public class euler
{
	static public void main(String[] args)
	{		
			int zadana=500;
			int suma=0;
			int stop=1;
			int dzielniki=0;
			while(true)
			{
			    dzielniki=0;
			    suma=0;
    			for(int i=1;i<=stop;i+=1)
    			{
    				suma+=i;
    			}
    			dzielniki=spr_dzielniki(suma);
				System.out.println("suma "+suma);
    			stop+=1;
    			if(dzielniki>zadana)
    			{
    				System.out.println("Wartosc pierwszego trojkata,ktora ma wiecej niz "+zadana+" dzielnikow to: "+suma);
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