package ninthedition2015.chapter5.classes;

class DoWhile{
	public static void main(String args[]){
		int n = 10;
		
		do{
			System.out.println("Такт " + n);
		} while (--n > 0);
	}
}