package ninthedition2015.chapter10.classes;

class MultipleExceptions{
	public static void main(String args[]){
		try{
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int[] c = { 1 };
			c[42] = 92;
		}
		catch (ArithmeticException e){
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("После блока операторов try/catch");
	}
}