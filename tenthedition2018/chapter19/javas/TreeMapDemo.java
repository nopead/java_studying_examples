package tenthedition2018.chapter19.classes;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

class TreeMapDemo{
	public static void main(String[] args){
		TreeMap<String, Double> tm = new TreeMap<>();
		
		tm.put("Джон Доу", Double.valueOf("3434.34"));
		tm.put("Том Смит", Double.valueOf("123.22"));
		tm.put("Джейн Бейкер", Double.valueOf("1378.00"));
		tm.put("Тод Холл", Double.valueOf("99.22"));
		tm.put("Ральф Смит", Double.valueOf("-19.08"));
		
		Set<Map.Entry<String, Double>> set = tm.entrySet();
		
		System.out.println("K -- V");
		for (Map.Entry<String, Double> map_el: set){
			System.out.println(map_el.getKey() + " -- " + map_el.getValue());
		}
		
		double balance = tm.get("Джон Доу");
		tm.put("Джон Доу", balance + 1000);
		System.out.println("Ноывй остаток на счете Джона Доу: " + tm.get("Джон Доу"));
	}
}