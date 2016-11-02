package praktikum11;

public class Rekursioon {

	public static void main(String[] args) {
		//System.out.println(astenda(2, 3));
		System.out.println(fib(3));
	}
	
	public static int astenda(int a, int b)
	{
		if(b == 1){
			return a;
		}
		return a * astenda(a, b-1);
		
	}
	public static int fib(int n)
	{
		if (n <= 1) return n;
		else return fib(n-1) + fib(n-2);
	}

}
