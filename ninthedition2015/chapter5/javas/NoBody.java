package ninthedition2015.chapter5.classes;

class NoBody{
	public static void main(String args[]){
		int i, j;
		i = 100;
		j = 200;
		
		while (++i < --j);
		System.out.println("Среднее значение равно " + i);
	}
}