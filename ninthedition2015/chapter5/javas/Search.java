package ninthedition2015.chapter5.classes;

class Search{
	public static void main(String args[]){
		int nums[] = {6,8,3,7,5,6,1,4};
		int val = 5;
		boolean found = false;
		
		for (int x: nums){
			if (x == val){
				found = true;
				break;
			}
		}
		
		String result = (found) ? "найден" : "не найден";
		System.out.println("Элемент " + val + " в списке nums " + result);
	}
}