import java.util.ArrayList;
class euler
{
	static public void main(String[] args)
	{	
		int fib_max=4000000;
		ArrayList<Integer> fibonaci=new ArrayList<Integer>(10);
		fill_fib(fibonaci,fib_max);
		System.out.println("Suma: "+check_if_even(fibonaci));
		
	}
	//wypelnia listę kolejnymi liczbami fibonaciego mniejszymi niż "fib_max"
	static void fill_fib(ArrayList<Integer> fibonaci,int fib_max)
	{
		int a=1,b=2,c=0,i=0;
		fibonaci.add(0,a);
		fibonaci.add(1,b);
		while(true)
		{
			c=fibonaci.get(i)+fibonaci.get(i+1);
			if(c>fib_max)
				break;
			
			fibonaci.add(c);
			System.out.println((i+1)+". "+c);
			i++;
		}
	}
	//sprawdza,ktore liczby sa parzyste i zwraca ich sume
	static int check_if_even(ArrayList<Integer> fibonaci)
	{
		int suma=0,x=0;
		for(int i=0;i<fibonaci.size();i++)
		{	x=fibonaci.get(i);
			if((x % 2) == 0)
				suma+=fibonaci.get(i);
		}
		return suma;
	}
}