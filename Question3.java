
// 3.write a program to find out maximum number among three number(if else if ladder statement)




public class Question3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		int c = 40;
		
		if (a>b && a>c )
		{
			System.out.println("A is the Larger Number");
		}
		else if (b>a && b>c  )
		{
			System.out.println("B is Larger Number");
		}
		else
		{
			System.out.println("C is Largest Number");
		}
		
	}

}
