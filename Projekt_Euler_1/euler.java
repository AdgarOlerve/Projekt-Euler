class euler
{
	static int zadana=1000000;
	
	static public void main(String[] args)
	{	int suma=0;
		int liczby[]=new int[zadana];
		wypelnij(liczby,zadana);
		for(int i=0;i<zadana;i+=1)
		{
			if(podzielna(liczby[i],5)==true)
			{
				suma+=liczby[i];
				System.out.println("\npodzielna przez 5: "+liczby[i]);
			}
			else if(podzielna(liczby[i],3)==true)
			{
				suma+=liczby[i];
				System.out.println("\npodzielna przez 3: "+liczby[i]);
			}
		}
		System.out.println("\nsuma: "+suma);
		
	}
	//wypelnia tablice liczby[] liczbami w zakresie od 1 do "zadana"
	static public void wypelnij(int[] liczby,int zadana)
	{
		int i=1;
		while(i<zadana)
		{
			liczby[i]=i;
			i+=1;
		}
	}
	//sprawdza czy dana liczba po podzieleniu zostawia reszte(sprawdza czy jest podzielna)
	static public boolean podzielna(int liczba,int dzielnik)
	{
		int x = liczba % dzielnik;
		if(x>0)
		return false;
		else
		return true;
	}
}
