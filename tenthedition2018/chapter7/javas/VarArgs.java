package tenthedition2018.chapter7.classes;

class VarArgs {
	static void vaTest(int ... v){
		System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
		for (int x: v){
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		vaTest(10); 
		vaTest(1, 2, 3);
		vaTest();
	}
}