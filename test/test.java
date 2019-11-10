import static java.lang.Math.*;

public class test
{
	int pierwsze[]=new int[100];
	int czynniki[]=new int[];
	int ile_czyn[]=new int[];
	static public void main(String[] args)
	{
		pierwsze(pierwsze);
		for(int i=0;i<pierwsze.length;i++)
		{
			System.out.println(pierwsze[i]);
		}
	}
	
	static void pierwsze(int[] tab)
	{
		int n=100; //ile program ma wyliczyc liczb pierwszych
		int licznik=0; //licznik znalezionych liczb pierwszych
		int sprawdzana=2; //aktualnie sprawdzana liczba
		int dzielnik=2;
		boolean x;
		
		while(licznik<n)
		{
			x=true;
			for(dzielnik=2;dzielnik<sprawdzana;dzielnik++)
			{
				if(sprawdzana%dzielnik==0)
				{
					x=false;
					break;
				}
			}
			if(x==true)
			{
				tab[licznik]=sprawdzana;
				licznik++;
			}
			sprawdzana++;
		}
		
	}
}