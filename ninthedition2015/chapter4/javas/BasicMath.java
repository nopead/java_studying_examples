package ninthedition2015.chapter4.classes;

class BasicMath{
	public static void main(String args[]){
		//арифметические операции над целочисленными значениями
		System.out.println("Целочисленная арифметика");
		
		int a = 1 + 1;
		int b = a * 3;
		int c = b / 4;
		int d = c - a;
		int e = -d;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		
		//арифметические операции над значениями типа double
		
		System.out.println("Целочисленная арифметика");
		
		double da = 1 + 1;
		double db = da * 3;
		double dc = db / 4;
		double dd = dc - da;
		double de = -dd;
		
		System.out.println("da = " + da);
		System.out.println("db = " + db);
		System.out.println("dc = " + dc);
		System.out.println("dd = " + dd);
		System.out.println("de = " + de);
	}
}